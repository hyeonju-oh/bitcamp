package step11.ex3;

public class Exam01 {
    public static void main(String[] args) {
        // 새 프로젝트에서는 제조사, 모델명, 수용인원 외에 썬루프 장착여부, 자동변속 여부를 추가적으로 저장하고 싶다
        
        // 방법2) 기존 코드를 복사하여 새 클래스(Car2)를 만든다.
        //       => 같은 일을 하는 여러 클래가 존재하게 되면 관리하기가 힘들다!
        //       => 만약 원본 코드에 버그가 있으면 버그도 복사하게 된다
        Car2 c = new Car2("비트자동차", "티코", 5, true, true);
    }
}
