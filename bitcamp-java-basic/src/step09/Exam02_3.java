package step09;
// 인스턴스 메서드와 클래스 메서드 활용 - Math 클래스
public class Exam02_3 {
    public static void main(String[] args) throws Exception {
        // Math 클래스는 수학 관련 메서드를 모아둔 클래스이다.
        System.out.println(Math.abs(-200));
        
        System.out.println(Math.ceil(3.28));
        System.out.println(Math.floor(3.28));
        System.out.println(Math.ceil(-3.28));
        System.out.println(Math.floor(-3.28));

        System.out.println(Math.pow(2, 7));
        
        System.out.println(Math.round(3.14));
        System.out.println(Math.round(3.54));
    }
}
