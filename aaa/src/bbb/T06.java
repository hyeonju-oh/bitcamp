package bbb;


public class T06 {
    
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
       int age = 8; //scan.nextInt();
       if (age < 8) {
            System.out.println("유아");
       } else if (age < 14) {
            System.out.println("어린이");
       } else if (age < 20) {
            System.out.println("청소년");
       } else if (age < 65) {
            System.out.println("성년");
       } else {
           System.out.println("노인");
       }
       
       int level = -10; //scan.nextInt();
       switch (level) {
           case 0: System.out.println("손님"); break;
           case 1: System.out.println("회원"); break;
           case 2: System.out.println("관리자"); break;
           default: System.out.println("유효하지 않은 회원입니다.");
       }

       String v1 = "어린이";
       switch (v1) {
           case "유아":
           case "노인": System.out.println("무료승차"); break;
           case "어린이":
           case "중학생":
           case "고등학생":
           case "미성년": System.out.println("청소년 요금입니다."); break;
           case "성인":
           case "외국인": System.out.println("일반 요금입니다."); break;
           default: System.out.println("요금 계산 대상이 아닙니다.");
       }

    }
}