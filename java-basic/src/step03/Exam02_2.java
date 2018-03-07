// 레퍼런스 배열 - 사용 전
package step03;

public class Exam02_2 {
    public static void main(String[] args) {
        // 여러개의 인스턴스 주소 저장하기

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        
        // 레퍼런스 배열 준비 (인스턴스 배열이 아니다)
        Score[] arr = new Score[3];
        arr[0] = new Score();
        arr[1] = new Score();
        arr[2] = new Score();
        
        arr[0].name = "홍길동";
        arr[1].name = "임꺽정";
        arr[2].name = "유관순";

        System.out.printf("이름: %s\n", arr[0].name);
        System.out.printf("이름: %s\n", arr[1].name);
        System.out.printf("이름: %s\n", arr[2].name);
        

    }
}

// 결론! 
// 여러 개의 인스턴스의 주소를 관리할 때는 레퍼런스 배열을 사용하는게 편하다