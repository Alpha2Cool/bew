package Solution;

public class currenttime_test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop-start);
    }
}
