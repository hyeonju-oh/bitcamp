// 흐름제어문 - swith 문법
package step05;
import java.util.Scanner;


public class Exam03_1 {
    public static void main(String[] args) {
        // 조건이 참인 동안 문장을 계속 실행한다
        int count = 0;
        while (count < 5) 
            System.out.println(count++);
        System.out.println("---------------");
        count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
    
    }
}
