package clasloaderProj;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class ClassloaderT extends ClassLoader{
//    public classloaderT(String name, ClassLoader parent) {
//        super(name, parent);
//    }

    public ClassloaderT(ClassLoader parent) {
        super(parent);
    }

    public ClassloaderT() {
    }

    @Override
    protected Class<?> findClass(String classPath) throws ClassNotFoundException {
        File file = new File(classPath);
        try {
            byte[] classByte = getClassByte(file);

            String classname = classPath.substring(classPath.lastIndexOf("\\") + 1,
                    classPath.lastIndexOf("."));
            classname = "clasloaderProj." + classname;
            Class<?> Classimp = this.defineClass(classname, classByte, 0, classByte.length);
            return  Classimp;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(classPath);
    }

    private byte[] getClassByte(File file) throws IOException {
        // 这里要读入.class的字节，因此要使用字节流
        FileInputStream fis = new FileInputStream(file);
        FileChannel fc = fis.getChannel();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        WritableByteChannel wbc = Channels.newChannel(baos);
        ByteBuffer by = ByteBuffer.allocate(1024);

        while (true)
        {
            int i = fc.read(by);
            if (i == 0 || i == -1)
                break;
            by.flip();
            wbc.write(by);
            by.clear();
        }

        fis.close();

        return baos.toByteArray();
    }
}
