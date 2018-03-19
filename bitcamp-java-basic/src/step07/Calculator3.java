package step07;
// 메서드 분류 - 인스턴스 변수 사용
public class Calculator3 {
    
    // 인스턴스 변수
    // 작업 결과를 개별적으로 관리하고 싶을 때 인스턴스 변수로 선언
    // new 명령을 사용해서 만들어야 한다.
    // 변수 선언 앞에 static이 붙지 않는다.
    int result = 0;
    
    // 인스턴스 변수를 다루는 메서드는 작업을 수행할 때 그 인스턴스 주소를 받아야 한다
    
    public static void plus(Calculator3 calc, int value) {
        calc.result += value;
    }
    public static void minus(Calculator3 calc,int value) {
        calc.result -= value;
    }
    public static void multiple(Calculator3 calc,int value) {
        calc.result *= value;
    }
    public static void divide(Calculator3 calc,int value) {
        calc.result /= value;
    }
}
