package bbb;
public class Test11_1 {
    public static void main(String[] args) {
        System.out.println(3.14);
        System.out.println(true);
        System.out.println('\uAC00');
        System.out.print("123");
        System.out.print('\b');
        System.out.println("123");
        System.out.println("ABC\t123"); // Tab : 커서를 OS의 기본 칸 수 만큼 이동 
        System.out.println("ABC\u0009123"); // Tab에 대해 유니코드 값을 직접 지정해도 된다.
        System.out.println("ABC\n123"); // Line Feed(LF; 0x000a) : 커서를 처음으로 되돌리고 다음 줄로 이동한다.
        System.out.println("ABC\r123"); // Carrage Return(CR; 0x000d) : 커서를 처음으로 옮긴다. 
        System.out.println("ABC\f123"); // Form Feed : 커서를 다음 줄로 이동한다.
        System.out.println("ABC\"123"); // double quote
        System.out.println("ABC'123"); // single quote 
        System.out.println('\''); // single quote 
        System.out.println('"'); // double quote 
        System.out.println("c:\\workspace\\test"); // backslash 
        System.out.println(14_5678_1234); 
        System.out.println(1_456_781_234); // 위치는 상관없다.
        System.out.println(0b0110_0100); // = 100(10진수)
        System.out.println(0B0110_0100); // = 100(10진수)
        System.out.println(0B110_0100); // 앞쪽의 0은 생략가능

        int[] score= new int[7];        
        int[] sc= new int[] {2,3,4};
        score[0]=33;

        for (int i = 0; i < sc.length; i++) {
            System.out.println(sc[i]);
        }
    }
}