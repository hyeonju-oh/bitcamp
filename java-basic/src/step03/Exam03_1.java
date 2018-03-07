// 레퍼런스와 인스턴스 - 가비지
package step03;

public class Exam03_1 {
    public static void main(String[] args) {

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        Score s1;
        
        // 인스턴스를 만들어 그 주소를 레퍼런스에 저장한다
        s1 = new Score();

        // 새 인스턴스를 만들어 s1에 주소를 저장한다
        s1 = new Score();
        
        // 그러면 기존에 들어 있던 주소는 잃어버린다.
        // 주소를 잃어버려 사용할 수 없는 메모리를 "garbage"라 한다
        // 가비지 컬렉터의 실행
        // - 메모리 부족할 때
        // - CPU가 한가할 때
        // - System.gc()를 호출하여 가비지 실행을 요청할 때

    }
}