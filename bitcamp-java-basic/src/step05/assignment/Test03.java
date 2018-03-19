package step05.assignment;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int count = 1;
        while (count <= len) {
            int spaceCnt = 1;
            int spaceLen = (len - count) / 2;
            while (spaceCnt <= spaceLen){
                System.out.print(" ");
                spaceCnt++;
            }
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count +=2;
        }
        System.out.println("----------------");
        System.out.println("----------------------------");
        
        // => while 문의 중법 연습 II
        // - 위의 결과를 다음과 같이 출력하라!
        //    *
        //   ***
        //  *****
        count = 1;
        while (count <= len) {
            int spaceLen = (len - count) / 2;
            while (spaceLen > 0) {
                System.out.print(" ");
                spaceLen--;
            }
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count += 2;
        }
        
        System.out.println("----------------------------");
        
        // => while 문의 중법 연습 III
        // - 위의 결과를 다음과 같이 출력하라!
        //  *****
        //   ***
        //    *
        count = len;
        while (count > 0) {
            int spaceLen = (len - count) / 2;
            while (spaceLen > 0) {
                System.out.print(" ");
                spaceLen--;
            }
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count -= 2;
        }
        

        System.out.println("----------------------------");
        
        // => while 문의 중법 연습 III
        // - 위의 결과를 다음과 같이 출력하라!
        //  *****
        //   ***
        //    *
        count = len;
        while (count > 0) {
            int spaceCnt = 1;
            int spaceLen = (len - count) / 2;
            while (spaceCnt <= spaceLen) {
                System.out.print(" ");
                spaceCnt++;
            }
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count -= 2;
        }
        String str = "Information!";
        int n = str.length();
        char[] st = new char[n];
        n--;
        for (int k = n; k >= 0; k--) {
            st[n-k] = str.charAt(k);
        }
        for (char k : st)
            System.out.printf("%c", k);
        

    }
}