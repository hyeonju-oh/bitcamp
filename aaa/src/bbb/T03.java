package bbb;
public class T03 {
    public static void main(String[] args) {

        System.out.println("------------------");
        
        // => 변수 초기화 문장을 생략할 수 있다.
        int i = 0;
        for (; i < 5; i++)
            System.out.println(i);
        System.out.println(i); // i 변수는 for의 로컬 변수가 아니다.
     
        for (int a = 1; a <= 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------------------");
        
        // => 중첩된 for 문에서 가장 바깥쪽 반복문 탈출하기
        label1: 
        for (int a = 1; a <= 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
                if (b == 2)
                    break;
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("------------------");
    }
}