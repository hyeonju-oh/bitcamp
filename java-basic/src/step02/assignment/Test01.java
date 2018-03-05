package step02.assignment;
public class Test01 {
    public static void main(String[] args) {
        java.io.InputStream s = System.in;
        java.util.Scanner scan = new java.util.Scanner(s);
        
        String str; 
        int a1, a2, a3, sum;
        float av;
        System.out.print("이름? ");
        str = scan.nextLine();
        System.out.print("국어? ");
        a1 = scan.nextInt();
        System.out.print("영어? ");
        a2 = scan.nextInt();
        System.out.print("수학? ");
        a3 = scan.nextInt();
        sum = a1 + a2 + a3;
        av = sum / 3.0f;
        System.out.println("---------");
        System.out.printf("%s %d %d %d %d %.1f",str,a1,a2,a3,sum,av);
    }
}