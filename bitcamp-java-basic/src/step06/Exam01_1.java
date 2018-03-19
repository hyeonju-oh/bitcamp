// 메서드 : 사용 전
package step06;
import java.util.Scanner;

public class Exam01_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int starLen = 1;
        while (starLen <= len) {
            int starCnt = 1;

            int spaceCnt = 1;
            int spaceLen = (len - starLen) / 2;
            while (spaceCnt <= spaceLen) {
                System.out.print(" ");
                spaceCnt++;
            }
            while (starCnt <= starLen) {                
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            starLen+= 2;
        }
         
    }
}