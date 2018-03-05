package bitcamp.java106.pms;
public class App2 {
    public static void main(String[] args) {
        java.io.InputStream s = System.in;
        java.util.Scanner sc = new java.util.Scanner(s);

        // Scanner sc = new Scanner(System.in); 최상위에 import java.util.Scanner;

        String name, ss, sd, ed;
        int num;
        
        System.out.print("팀명? ");
        name = sc.nextLine();
        System.out.print("설명? ");
        ss = sc.nextLine();
        System.out.print("최대인원? ");
        num = sc.nextInt();
        sc.nextLine();
        System.out.print("시작일? ");
        sd = sc.nextLine();
        System.out.print("종료일? ");
        ed = sc.nextLine();
        System.out.println("-------------------");
        System.out.printf("팀명: %s\n설명:\n%s\n최대인원: %d명\n일자: %s ~ %s",
                        name, ss, num, sd, ed);
               
    }
}