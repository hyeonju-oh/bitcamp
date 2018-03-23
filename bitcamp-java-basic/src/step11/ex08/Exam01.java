package step11.ex08;
// 상속 - 다중 상속
public class Exam01 {
    public static void main(String[] args) {
        // 만약 C 클래스가 A와 B를 모두 상속 받을 수 있다면, C 클래스의 인스턴스를 만들 때 
        // v2 변수는 A 설계도에 따라 float 메모리를 만들어야 하는가? 아니면 B 설계도에 따라 int 메모리를 만들어야 하는가?
        
        C obj = new C(); //??
        // 그래서 자바는 클래스의 다중 상속을 지원하지 않는다.

    }
}
