package step08;
// 초기화 블록 - 클래스 블록
public class Exam06_1 {
    static class A {
        int a;
        int b;
        { // 아무 이름 없이 선언하는 블록이 "초기화 블록"이다.
            // 인스턴스를 생성한 후, 생성자를 호출하기 전에 자동으로 실행한다.
            System.out.println("{}11111111");
            
        }
        A() {
            System.out.println("A()");
        }
        { // 초기화 블록은 여러개 정의할 수 있다. 순서대로 호출된다.
            System.out.println("{}2222222");
            // 초기화 블럭을 나눠서 여러개 정의하면 코드를 유지보수하기 어렵다.
        }
    }
    public static void main(String[] args) {
        A obj1 = new A();
    }
}
