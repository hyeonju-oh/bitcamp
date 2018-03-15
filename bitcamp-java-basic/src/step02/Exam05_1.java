// 부동소수점 변수 - 값 할당
package step02;
public class Exam05_1 {
    public static void main(String[] args) {
        float f; //유효자릿수 7자리 부동소수점 저장 가능
        f = 9.8765435f;
        System.out.println(f);
        f = 9876543.5f;
        System.out.println(f);
        // 유효자릿수는 소수점을 제외한 숫자의 개수이다.
        // 단 앞이나 뒤에 9이 오면 그 0은 자릿수에서 재외한다.
        f = 0.000098765435f;
        System.out.println(f);
        f = 98765435000000L;
        System.out.println(f);
        
        // 다음과 같이 정수를 부동소수점 메모리에 저장하려 할 때는 값이 짤릴 수 있다.
        // 정수를 부동소수점 메모리에 저장할 때는 특히 주의해야 한다.
        // 정수(int) --> 부동소수점 (float)
    }
}