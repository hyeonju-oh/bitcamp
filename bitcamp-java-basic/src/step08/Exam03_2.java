package step08;
// 인스턴스와 인스턴스 변수, 인스턴스 메서드

public class Exam03_2 {
    static class Calculator {
        int result;
        
        // 인스턴스 메서드는 Heap에 만들어 지는 것이 아니다
        // 클래스의 모든 코드는 Method Area 영역에 로딩 된다
        public void plus(int value) {
            this.result += value;
        }
        public void minus(int value) {
            this.result -= value;
        }
    }
    public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();
    
    // 인스턴스 메서드든 클래스 메서드든 모두 Method Area 영역에 올라간다
    // 그리고 인스턴스를 가지고 그 메서드를 호출하는 것이다.
    
    c1.plus(123);
    c2.minus(30);
    }    
}
