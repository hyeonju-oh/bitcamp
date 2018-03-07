package bbb;
public class T02 {
    public static void main(String[] args) {
        java.io.InputStream a = System.in;
        java.util.Scanner scan = new java.util.Scanner(a);

        int age;

        System.out.print("나이를 입력하세요: ");
        age = scan.nextInt();

        if (age < 13) {
            System.out.println("아동"); 
        }
        else if (age < 20) {
            System.out.println("청소년");
        }
        else if (age < 65) {
            System.out.println("성년");
        }
        else 
            System.out.println("경로우대");
        
    }
}