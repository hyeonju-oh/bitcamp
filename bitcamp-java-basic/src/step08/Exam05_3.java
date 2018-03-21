package step08;
// 변수 초기화 - 초기화 문장과 생성자의 실행 순서
public class Exam05_3 {
    static class A {
        int a = 100;
        // 생성자는 초기화 문장을 실행한 후에 호출된다
        A() {
            this.a = 300;
        }
    }
    public static void main(String[] args) {
        
        A obj1 = new A();
        System.out.println(obj1.a);
        
    }
}

// 생성자? 인스턴스(객체)를 생성한 후에 사용하기 전에 유효한 값으로 초기화시키는 작업을 수행한다
