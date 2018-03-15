// 클래스 사용 - 사용 범위
package step03;

// 패키지 멤버 클래스 - 패키지에 직접 소속된 클래스
// 다른 클래스들도 A 클래스 사용 가능
class A {}
public class Exam04_2 {
    
    // 중첩 클래스(Nested class) - 다른 클래스 안에 정의된 클래스
    // 그 클래스 안에서만 사용된다
    class B {}
    public static void main(String[] args) {

        // 로컬 클래스(local class) - 오직 그 메서드 블록 안에서만 사용된다
        class C {}        
    }
    public void m() {
        A ref1;
        B ref2;
        //C ref3; // 컴파일 오류
    }
}