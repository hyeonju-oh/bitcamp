package step04;
// 증감 연산자 : 전위(pre-fix) 증감 연산자 응용1 
public class Exam06_8 {
    public static void main(String[] args) {
        int i = 2;
        int result = ++i + ++i * ++i;// 3 + 4 * 5
        System.out.println(result);

        // 주의! 
        // pre-fix 연산자나 post-fix 연산자를 리터럴에 적용할 수 없다.
        int x = ++100; // 컴파일 오류
        x = 100++; // 컴파일 오류

        // 변수에 동시에 적용할 수 없다
        int y = 100;
        ++y++; .// 컴파일 오류
        (++y)++; // 컴파일 오류


    }
}
