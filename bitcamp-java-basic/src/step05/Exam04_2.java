// 흐름 제어문 - for 반목문의 초기화 변수
package step05;
import java.util.Scanner;


public class Exam04_2 {
    public static void main(String[] args) {
        // for (변수선언 및 초기화; 조건; 증감문) 문장
        // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2;....}

        for (int i = 1; i <= 5; i++) 
            System.out.println(i);

        System.out.println("--------------");
        
        //System.out.println(i); // 컴파일 오류!
        int x;
        for (x = 1; x <= 5; x++) 
            System.out.println(x);
        System.out.printf("x = %d\n", x);
        
    }
}
