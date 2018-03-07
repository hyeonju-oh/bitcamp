// 형변환 - 명시적 형변환이 가능한 경우
package step02;

public class Exam08_7 {
    public static void main(String[] args) {
        // 1) 정수 메모리끼리 형변환 가능
        // 2) 부동소수점으로 정수로 형변환 가능
        // 3) 형변환 없이 정수는 부동소수점 메모리에 저장할 수 있다
        // 4) 숫자를 문자 코드로 형변환 가능하다

        char ch;
        int i = 0x41;
        ch = (char)i;

        boolean bool;
        bool = (boolean) 1; // 컴파일 오류


    }
}
