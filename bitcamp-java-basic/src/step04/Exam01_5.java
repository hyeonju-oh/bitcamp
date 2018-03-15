// 산술 연산자 : 암시적 형변환
package step04;

public class Exam01_5 {
    public static void main(String[] args) {
       byte b = 1;
       short s = 2;
       int i = 3;
       long l = 4;
       float f = 5.5f;
       double d = 6.6;
       char c = 7;
       boolean bool = true;
       //byte r1 = b + b; // 컴파일 오류
       //short r2 = s + s; // 컴파일 오류
       //short r3 = b + s;
       
       int r4 = b + i;
       int r5 = s + i;
       //int r6 = i + l; // 컴파일 오류
       //long r7 = l + f; // 컴파일 오류
       // 정수 타입의 값과 부동소수점 타입의 값을 연산하면 정수 타입의 값이
       // 암시적 형변환을 통해 부동소수점으로 바뀐다.
       //int r8 = i + f; // 컴파일 오류
       float r9 = f + d; // 컴파일 오류

       //byte + short + int + long + float + double = double
       long r10 = b + s + i + l + f + d; // 컴파일 오류

       //float + int + long = float // 컴파일 오류
        long r11 = f + i + l; // 컴파일 오류

        int r12 = bool + i;
    }
}
// 다른 타입끼리 연산을 할 때는 둘 중 한개의 타입을 다른 타입으로 바꿔야 한다.
// 타입을 바꾸는 것을 내부적인 규칙에 따라 자동으로 처리한다고해서
// "암시적 형변환(implicit type conversion)" 이라 부른다.
// byte,short,char => int => long => float => double