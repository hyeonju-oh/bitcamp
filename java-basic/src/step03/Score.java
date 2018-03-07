// 패키지 클래스
// 이렇게 별도의 파일로 클래스를 정의한 클래스를 "패키지 클래스"라 부른다
// 즉 패키지에 직접 소속된 클래스라는 의미
// main() {} 블록 안에 정의한 클래스는 main() {} 블록 안에서만 정의할 수 있다.
// 이렇게 별도의 파일로 정의한 클래스는 
// 다른 클래스에서도 사용할 수 있다
package step03;

public class Score {
    public String name;
    public int kor;
    public int eng;
    public int math;
    public int sum;
    public float aver;
}
