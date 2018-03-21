package step08;
// 변수 초기화 - 초기화 문장
public class Exam05_2 {
    static class A {
        // 변수 선언과 동시에 값을 저장하는 것을 "변수 초기화 문장"이라 부른다.
        static int a = 100;
        int b = 200;
    }
    public static void main(String[] args) {
        int c = 300;
        
        System.out.println(A.a);
        
        A obj1 = new A();
        System.out.println(obj1.b);
        
        System.out.println(c);
    }
}

// 생성자? 인스턴스(객체)를 생성한 후에 사용하기 전에 유효한 값으로 초기화시키는 작업을 수행한다
