// 흐름 제어문 - for 반목문과 배열
package step05;
import java.util.Scanner;


public class Exam04_3 {
    public static void main(String[] args) {

        String[] names = {"홍길동", "임꺽정", "유관순", "윤봉길", "안중근"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("------------");

        for (String name : names)
            System.out.println(name);
        // 위의 방식으로 for문을 사용할 경우 변수 선언을 바깥에 둘 수 없다

        /*
        String name2;
        for (name2 : names) // 컴파일 오류!
        System.out.println(name2); 
        */
    }
}
