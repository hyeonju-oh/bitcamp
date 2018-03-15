// 메서드 : 개념 및 기본 문법 3
package step06;
import java.util.Scanner;

public class Exam02_3 {
    // 3) 메서드 : 리턴값(o), 파라미터(x)
    // 메서드 블록을 실행한 후 값을 리턴하는 메서드
    // 리턴 타입은 반드시 한 개만 가능하다
    
    static String hello() {
        // 값을 리턴하는 문법: return 값;
        return "안녕하세요";
    }
    public static void main(String[] args) {
        
  
        // hello() 메서드를 실행하고, 그 리턴 값을 변수에 담는다.
        String r = hello();
        System.out.println(r);

        hello(); //이때 값을 받을 변수가 없기 때문에 리턴 값은 버려진다.
        //int r2 = hello(); // 컴파일 오류!
        System.out.println(hello());
    }
}