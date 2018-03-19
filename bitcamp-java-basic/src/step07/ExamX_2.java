package step07;
// 사용자 정의 데이터 타입 - 메서드 활용

public class ExamX_2 {
    public static void main(String[] args) {
        Score2 score = new Score2();
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        /*
        score.sum = score.kor + score.eng + score.math;
        score.average = score.sum / 3f;
        */
        Score2.calculate(score);
        
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                score.name, score.kor, score.eng, 
                score.math, score.sum, score.average);
    }
}