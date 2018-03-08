// 산술 연산자 : 연산의 결과 타입
package step04;

public class Exam01_4 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        float r = i / j; // int와 int의 연산 결과는 항상 int
                         // 따라서 r 변수에 넣기 전에 이미 결과는 정수 2다
                         // 정수 2를 float 변수에 넣으면 출력할 때 2.0
        System.out.println(r);
        
        r = (float)i / (float)j;
        System.out.println(r);
        //0111_1111_1111_1111_1111_1111_1111_1111 = Integer.MAX_VALUE
        int x = Integer.MAX_VALUE; //0x7fffffff = 약 +21억
        int y = Integer.MAX_VALUE;
        int r1 = x + y; //0xfffffffe
        long r2 = x + y;
        System.out.println(r1); // int(4byte) + int(4byte) = int(4byte)
        System.out.println(r2);
        // r2의 출력 결과를 보면 42억이 출력되는 것이 아니라 2가 출력
        // int와 int의 연산 결과는 피연사자와 같은 4바이트 int가 된다
        // 그래서 8바이트 long 변수에 저장되기 전에
        // 이미 그 결과는 int 값으로 -2가 되기 때문에 long 변수의 값이 -2
        float f1 = 987.6543f;
        float f2 = 1.111111f;
        float f3 = f1 + f2; // 988.765411
        double r4 = f1 + f2; 
        System.out.println(f3); //988.7654
        System.out.println(r4); // 988.765380859375

        double d1 = 987.6543;
        double d2 = 1.111111;
        double r5 = d1 + d2; // 988.765411
        System.out.println(r5);
    }
}
// 해결책 - 변수에 들어 있는 값을 다른 타입으로 바꿔라
// "형변환(type conversion = type casting)" 하라!
// 원래 변수의 타입을 바꾸는 것이 아니다.
// 내부적으로는 변수에 들어 있는 값을 꺼내 지정된 타입의 임시 메모리를 만들어 저장한다
// byte + byte = int
// shore + short = int
// byte + short = int
// "암시적 형변환()"

// int + int = int
// long + long = long
// float + float = float
// double + double = double

// 3) 다른 타입과 연산을 수행할 때는 내부적으로 같은 타입으로 맞춘 다음에 실행한다
//  Exam01_5.java를 보라~