package Solution;

public class StringBuilder_test {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("abc");
        st.append("hello");
        String sss = "world";
        st.append(sss);
        String ss = st.toString();
        System.out.println(ss);
    }
}
