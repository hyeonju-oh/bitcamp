// 메서드 : 사용 후
package step06;
import java.util.Scanner;

public class Exam01_2 {
    // 스페이스를 출력하는 코드들을 관리하기 쉽도록 별도의 블록에 모아놓는다
    // ->메서드method 또는 함수function이라 부른다
    // 자바는 주로 메서드라 사용한다
    public static void printSpaces(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }

    // 
    public static void printStars(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
    }
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();


        for (int starLen = 1; starLen <= len; starLen += 2){
            // 명령 코드들을 기능 별로 묶어 두고
            // 필요할 때마다 다음과 같이 사용하면
            // 코드를 읽기가 쉬워진다
            printSpaces((len - starLen) / 2);
            printStars(starLen);
            System.out.println();
          
        }         
    }
}