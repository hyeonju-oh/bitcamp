package step11.ex12;
// Object 클래스의 메서드를 오버라이딩 하기 = toString()
public class Exam01_2 {
    static class Score {
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float aver;
        
        public Score(String name, int kor, int eng, int math) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
            this.sum = kor + eng + math;
            this.aver = this.sum / 3f;
        }
        // Object로부터 상속 받은 toString() 리턴 값이 마음에 들지 않는닫면 재정의하라!
        // => 보통 인스턴스의 내부 데이터를 문자열로 리턴하도록 변경한다.
        @Override
        public String toString() {
            return String.format("%s,%d,%d,%d,%d,%.1f", 
                    this.name, this.kor, this.eng, this.math, this.sum, this.aver);
            
        }
    }
    public static void main(String[] args) {
        Score s1 = new Score("홍길동", 100, 100, 100);
        System.out.println(s1.toString());
        
        System.out.println(s1);
    }

}
