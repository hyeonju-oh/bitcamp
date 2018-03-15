// 문자 변수 - UTF-16(Unicode 2) 코드 값 저장
package step02;
public class Exam06_2 {
    public static void main(String[] args) {
        char c1, c2;
        c1 = 0x41; // A 문자의 UTF-16 코드값
        c2 = 65;
        // 변수의 종류가 char이면, 출력할 때 10진수를 출력하는 대신 해당 코드의
        // 문자를 폰트파일에서 찾아 출력한다.
        System.out.println(c1);
        System.out.println(c2);

        // 자바에서는 문자의 코드 값을 알아내는 명령어가 있다. '' 작은따옴표
        // '헐'의 경우 헐 문자의 UTF-16 코드 값을 그 자리에 놓는다. 
        char c3;
        c3 = '헐';
        c3 = 54736;
        System.out.println(c3);
    }
}