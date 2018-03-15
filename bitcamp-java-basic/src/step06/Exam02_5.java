// 메서드 : 개념 및 기본 문법 5
package step06;
import java.util.Scanner;

public class Exam02_5 {
    // 5) 메서드 : 가변 파라미터
    // [리턴타입] 메서드명(타입... 변수) {...}
    // -> 0개 이상의 값을 받을 때 선언하는 방식
    // -> 내부적으로 배열처럼 사용한다.
    
    static void hello(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다\n", names[i]);
        }
    }
    public static void main(String[] args) {
        
        hello(); // 이 경우 names 배열의 개수는 0이다.
        System.out.println("-----------");
        hello("홍길동"); // 이 경우 names 배열의 개수는 1이다.
        System.out.println("-----------");
        hello("홍길동", "임꺽정", "유관순"); // 이 경우 names 배열의 개수는 3이다.
        //hello("gh", 20, "h");
        System.out.println("-----------");
        String[] arr = {"김구", "안중근", "윤봉길"};
        hello(arr);
    }
}