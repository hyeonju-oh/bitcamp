package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

// 캡술화(encapsulation) - 접근 범위 테스트
public class Exam02_2 extends C {
    public static void main(String[] args) {
        //Car c1 = new Car();// 컴파일 오류!
        // 생성자가 private이기 때문에 다른 클래스에서 호출할 수 없다.
        // 따라서 인스턴스를 생성할 수 없다.
        
        Car c2 = Car.create("티코");
        System.out.printf("%s,%s,%d,%d\n",
                c2.model, c2.maker, c2.cc, c2.valve);
    }
}

