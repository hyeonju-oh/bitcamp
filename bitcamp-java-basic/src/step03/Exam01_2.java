// 클래스 - 사용 후
package step03;

public class Exam01_2 {
    public static void main(String[] args) {
        // 여러개의 변수(메모리)를 묶어 한 사람의 성적 정보를 저장하라!
        // 식탁에 밥, 국, 반찬 등을 쟁반에 담아 가져오는 상황

        // 다양한 타입의 메모리를 묶어서 Score라는 새로운 형태를 만들 수 있는 설계도
        // 개발자가 새롭게 정의한 데이터 타입 - 사용자 정의 데이터 타입
        // 다음과 같이 클래스 문법을 사용하여 설계도 정의
        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        // 주소를 보관하려면 레퍼런스가 필요하다.
        // Score 설계도에 따라 메모리 확보
        // 확보된 메모리를 사용하려면 주소를 보관할 필요가 있다.
        Score s; // Score 설계도에 따라 만든 메모리의 주소를 저장할 변수
        s = new Score(); // Score 설계도에 따라 메모리를 확보하고 그 메모리에 
                        // 주소를 s에 저장한다

        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        s.sum = s.kor + s.eng + s.math;
        s.aver = s.sum / 3;
        // s(레퍼런스가 가리키는) 인스턴스의 name 값
        // s 객체의 name 값
        System.out.printf("이름: %s\n", s.name);
        System.out.printf("국어: %d\n", s.kor);
        System.out.printf("영어: %d\n", s.eng);
        System.out.printf("수학: %d\n", s.math);
        System.out.printf("합계: %d\n", s.sum);
        System.out.printf("평균: %.1f\n", s.aver);

    }
}