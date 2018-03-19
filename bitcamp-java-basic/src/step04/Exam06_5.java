package step04;
// 증감 연산자 : 전위(pre-fix) 증가 연산자 
public class Exam06_5 {
    public static void main(String[] args) {
        int i = 2;
        ++i;
        // i메모리의 값을 먼저 증가시키고 i메모리 값을 그 자리에 놓는다.
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}
