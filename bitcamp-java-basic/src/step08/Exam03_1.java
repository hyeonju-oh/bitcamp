package step08;
// 내장 변수 this

public class Exam03_1 {
    static class A {
        int value;
        static void m1() {
            // 클래스 메서드는 인스턴스 주소 없이 호출되기 때문에 인스턴스 주소를 받는 내장 변수가 없다.
            //this.value = 100; // 컴파일 오류
        }
        void m2() {
            this.value = 100;
        }
        void m3() {
            value = 200; // 인스턴스 변수를 사용할 때 this를 생략할 수 있다           
        }
        void m4(int value) {
            value = 200; // 로컬 변수
            this.value = 300; // 인스턴스 변수
        }
    }
    public static void main(String[] args) {
        A.m1();
        
        A obj1 = new A();
        obj1.m2();
        
        A obj2 = new A();
        obj2.m2();

    }

}
