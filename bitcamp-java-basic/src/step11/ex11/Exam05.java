package step11.ex11;
// 오버라이딩(overriding) - @Override
public class Exam05 {
    public static void main(String[] args) {
        B3 obj = new B3();
        obj.m(100);
        
        // B3 클래스에서는 m() 메서드를 제대로 오버라이딩 하였다.
        // @Override?
        // => 에노테이션 문법, 컴파일러나 JVM에게 전달하는 특별한 주석이다.
        // => 개발자도 자신의 에노테이션을 정의하고 사용할 수 있다.
    }
}
