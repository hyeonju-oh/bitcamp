package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

// 캡술화(encapsulation) - 접근 범위 테스트
public class Exam02_1 extends C {
    public static void main(String[] args) {
        A obj1 = new A();
        //obj1.privateVar = 100; // 접근 불가! 오직 그 클래스 안에서만 사용가능.
        obj1.defaultVar = 100; // OK! 이 클래스는 A클래스와 같은 패키지에 소속되어 있다.
        obj1.protectedVar = 100; // OK! 비록 이 클래스가 자식클래스는 아니지만 같은 패키지에 소속되어 있다.
        obj1.publicVar = 100; // OK! 모두 다 접근 가능!
        
        B obj2 = new B();
        //obj2.privateVar = 100;
        //obj2.defaultVar = 100;
        //obj2.protectedVar = 100;
        obj2.publicVar = 100;
        
        C obj3 = new C();
        //obj3.privateVar = 100;
        //obj3.defaultVar = 100;
        //obj3.protectedVar = 100;
        obj2.publicVar = 100;
        
        Exam02_1 obj4 = new Exam02_1();
        //obj4.privateVar = 100;
        //obj4.defaultVar = 100;
        obj4.protectedVar = 100;
        obj4.publicVar = 100;
    }
}

// private : 