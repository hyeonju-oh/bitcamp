package step04;
// 비트 이동 연산자 : >>, >>>, <<
public class Exam04_4 {
    public static void main(String[] args) {
        int i = 0x27a130ff;
        int a, b, c, d;
        System.out.println(Integer.toHexString(i));

        // i 변수에 들어있는 각 값을 1 바이트씩 짤라서 16진수로 출력하라!

        // 비트연산자 and or

        // 0x27a130ff = 0b00100111_10100001_00110000_11111111

        System.out.println(Integer.toHexString(i >> 24));
        System.out.println(Integer.toHexString(i >> 16));         
        System.out.println(Integer.toHexString(i >> 8));

        a = i >> 24;
        b = (i >> 16) & 0x000000ff;
        c = (i >> 8) & 0x000000ff;
        d = i & 0xff;
        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));


    }
}