// 형변환 - 정수 변수와 부동소수점 변수
package step02;

public class Exam08_3 {
    public static void main(String[] args) {
        byte b = 100;
        short s = 100;
        int i = 98765678;
        long l = 98765678;
        char c = 100;
        
        float f;
        double d;
        // 정수 변수의 값을 부동소수점 변수에 저장할 때 값이 짤릴 수 있다
        f = b;
        System.out.println(f);
        f = s;
        System.out.println(f);
        f = c;
        System.out.println(f);
        f = i; // 가수부 크기(23비트)를 넘는 정수는 짤린다
                // 즉 유효자릿수를 넘는 정수는 짤린다
        System.out.println(f);
        f = l; // 가수부 크기(23비트)를 넘는 정수는 짤린다
        System.out.println(f);

        
        d = i; //int(4) ==> double(8)
                // double의 가수부는 53비트 크기를 갖는다.
                // 따라서 int(32비트)의 값을 그대로 저장할 수 있다.
        System.out.println(d);

        l = 18_2345_3456_4567_5678L; //53비트가 넘어가는 정수
        d = l;
        System.out.println(d);
    }
}