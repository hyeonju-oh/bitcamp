// 부동소수점 변수 -단정도와 배정도
package step02;
public class Exam05_2 {
    public static void main(String[] args) {
    float f;
    double d;
    
    //부동소수점 리
    // 다음 코의 값은 4바이트 크기의 부동소수점 범위를 넘어갔기 때문에 변수(메모리)에
    // 값을 넣기 전에 이미 리터럴 값이 4바이트 크기를 넘어가기 때문에 짤린다.
    // 따라서 d변수에 저장된 값은 짤린 값이다
    f = 9876.98769876f;
    d = 9876.98769876;
    
    System.out.println(f);
    System.out.println(d);

        
    }
}
// 정수의 경우 리터럴을 표현할 때 값이 그 크기를 .

// 결론! 
// float 메모리에 값을 저장할 때는 유효자릿수가
