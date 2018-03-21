package step08;
// 변수 초기화 - 자동 초기화
public class Exam05_1 {
    static class A {
        static int a;
        int b;
    }
    public static void main(String[] args) {
        int c;
        
        // 클래스 변수는 생성되는 순간 0으로 자동 초기화 된다
        System.out.println(A.a);
        
        A obj1 = new A();
        // 인스턴스 변수는 생성되는 순간 0으로 자동 초기화 된다
        System.out.println(obj1.b);
        
        // 로컬 변수는 자동 초기화되지 않는다.
        //System.out.println(c); // 컴파일 오류
    }
}

// 생성자? 인스턴스(객체)를 생성한 후에 사용하기 전에 유효한 값으로 초기화시키는 작업을 수행한다
