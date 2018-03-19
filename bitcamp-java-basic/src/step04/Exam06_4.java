package step04;
// 증감 연산자 : 후위(post-fix) 증감 연산자 응용1 
public class Exam06_4 {
    public static void main(String[] args) {
        int i = 2;
        int result = i++ + i++ * i++;
        System.out.printf("%d, %d\n", i, result); // 2 + 3 * 4 = i 5, result 14
    }
}
