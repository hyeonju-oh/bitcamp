// 메서드 : 개념 및 기본 문법 2
package step06;
import java.util.Scanner;

public class Exam02_2 {
    // 2) 메서드 : 리턴값(x), 파라미터(o)
    // 메서드 블록을 실행할 때 값이 필요하다면 파라미터 변수를 선언하라
    // 
    static void hello(String name, int age) {
        // 파라미터: 
        // 메서드를 실행할 때 사용할 값을 외부로부터 값을 받기 위해 선언한 로컬 변수
        // 메서드를 싱핼할 때 생성되고 메서드 실행이 끝나면 제거된다. 
        System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
    }
    public static void main(String[] args) {
        System.out.println("main()111111");
        
        // hello 메서드 호출하기
        hello("홍길동", 20);
        // hello 메서드 실행이 완료되면 다시 이리로 되돌아 와서 다음 명령을 실행한다

        System.out.println("main()222222");
        // 메서드는 언제든 필요할 때 마다 반복하여 실행할 수 있다.
        hello("임꺽정", 30);
        System.out.println("main()333333");
        hello("유관순", 16);
        System.out.println("main()444444");
        
        // 파라미터의 타입, 개수, 순서가 일치해야 한다.
        hello("윤봉길");// 컴파일 오류!
        hello(20,"윤봉길"); // 컴파일 오류!
        String r = hello("안중근", 30);// 컴파일 오류!
        void r = hello("안중근", 30);// 컴파일 오류!
    }
}
// 아규먼트(argument) : 메서드를 호출할 때 넘겨주는 값
// -> 예) hello("홍길동", 20);   "홍길동", 20이 아규먼트이다
// 파라미터(parameter) : 아규먼트를 받는 변수






// 메서드(method) = 함수(function) = 프로시저(procedure)
// 명령어를 기능 단위로 관리하기 쉽게 별도로 분리하여 묶어 놓는 것.
// - 반복적으로 자주 사용하는 명령어를 재사용하기 쉽도록 별도로 분리하여 묶어놓은 것

// 메서드 종류
// - 클래스 메서드 : 클래스에 소속, 모든 인스턴스에 대해 사용할 수 있다
//                  static이 붙는다 
// - 인스턴스 메서드 : 인스턴스에 대해 사용할 수 있다. static이 붙지 않는다
// 
