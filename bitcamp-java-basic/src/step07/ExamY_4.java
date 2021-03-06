package step07;
// 메서드 분류 - 인스턴스 변수

public class ExamY_4 {
    public static void main(String[] args) {
        
        // 다음 두 개의 식을 분리하여 계산해 보자
        // 식1) 2 + 3 - 1 * 7 / 3 = ?
        // 식2) 3 * 2 + 7 / 4 - 5 = ?
   
        Calculator3 c1 = new Calculator3();
        Calculator3 c2 = new Calculator3();
        
        Calculator3.plus(c1, 2);
        Calculator3.plus(c2, 3);
        
        Calculator3.plus(c1, 3);
        Calculator3.multiple(c2, 2);
        
        Calculator3.minus(c1, 1);
        Calculator3.plus(c2, 7);
        
        Calculator3.multiple(c1, 7);
        Calculator3.divide(c2, 4);
        
        Calculator3.divide(c1, 3);
        Calculator3.minus(c2, 5);
        
        System.out.printf("result = %d\n", c1.result);
        System.out.printf("result = %d\n", c2.result);
    }
}