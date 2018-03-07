package bbb;
public class T06 {
    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
       int age = scan.nextInt();
       if (age <= 19) {
           if (age > 13) {
               System.out.println("청소년");
           }
           else
            System.out.println("어린이 또는 유아");
            
        }
        else
            System.out.println("성년");
    }
}