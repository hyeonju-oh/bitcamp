package bbb;
public class T05 {
    static String m1() {
        return "hello";
    }
    static int[] m2() {
        int[] values = {1, 2, 3};
        return new int[]{4, 5, 3};
    }

    static void m2(int... values) {
        System.out.printf("아규먼트 개수: %d\n", values.length);
        for (int v : values) {
            System.out.println(v);
        }
        System.out.println("----------------");
    }

    static void s1(String name) {
        System.out.printf("%s님 반갑습니다!\n", name);
    }

    public static void main(String[] args) {
        String v = m1();
        System.out.println(v);
        System.out.println(m1());
        m1();

        m2(33,444);

        s1("홍홍");

        int[] arr = m2();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}