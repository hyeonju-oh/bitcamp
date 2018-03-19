// 변수의 범위 - 변수와 블록
package step02;

public class Exam11_3 {
  
    public static void main(String[] args) {
        int a = 100;
        {
            /* int a = 200; // 컴파일 오류! */
                         // 메서드 안에서는 변수 이름 중복 불가
        } // 안쪽 블록에서는 바깥 블록 변수를 사용할 수 있다.
        System.out.println(a);
        // 안쪽 블록의 실행이 끝나면, 왼쪽 블록에서 선언된 모든 변수들이 자동으로 제거
        System.out.println(b);// 컴파일 오류!

        {
            // 이전 블록에서 선언된 변수는 그 블록이 종료되는 순간
            // 제거되기 때문에 다음과 같이 같은 이름의 변수를 선언할 수 있다.
            int b = 400;
        }
    }   
}
