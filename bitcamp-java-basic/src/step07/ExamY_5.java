package step07;
// 메서드 분류 - 인스턴스 변수와 인스턴스 메서드

public class ExamY_5 {
    public static void main(String[] args) {
        
        
        // 다음 두 개의 식을 분리하여 계산해 보자
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
        
        
        Calculator4 c1 = new Calculator4();
        Calculator4 c2 = new Calculator4();
        
        c1.plus(2);
        c2.plus(3);
        
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);
        
        System.out.printf("result = %d\n", c1.result);
        System.out.printf("result = %d\n", c2.result);
    }
}