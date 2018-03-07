// 형변환 - 명시적 형변환이 가능한 경우
package step02;

public class Exam08_6 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 100;
        long l = 100;

        byte b2 = (byte)s; // 명시적 형변환
        System.out.println(b2);
      
        b2 = (byte)i;
        System.out.println(b2);
      
        b2 = (byte)l;
        System.out.println(b2);

        int i2 = 0b0000_0000_0000_0000_0000_0001_0010_1100; // 300(10진수)
        b2 = (byte)i2;
        System.out.println(b2); // 44(10진수) - 0b0010_1110
        // 큰 메모리의 값을 바이트 단위로 쪼개고 싶을 때 이 방식을 응용한다

    }
}
