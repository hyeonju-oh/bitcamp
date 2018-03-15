// 메서드 : 리팩토링
package step06;
import java.util.Scanner;

public class Exam01_3 {
    // 스페이스를 출력하는 코드들을 관리하기 쉽도록 별도의 블록에 모아놓는다
    // ->메서드method 또는 함수function이라 부른다
    // 자바는 주로 메서드라 사용한다
    public static void printSpace(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(" ");
        }
    }
    public static void printStars(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
    }

    public static int getSpaceLength(int totalStar, int displayStar) {
        return (totalStar - displayStar) / 2;
    }

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        for (int starLen = 1; starLen <= len; starLen +=2) {
            printSpace(getSpaceLength(len, starLen));
            printStars(starLen);
            System.out.println();
        }
        

    }
}