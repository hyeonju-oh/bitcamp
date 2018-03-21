package step08;
// 초기화 블록 - 인스턴스 블록의 활용
public class Exam06_2 {
    
    public static void main(String[] args) {
        // 생성자를 이용하여 인스턴스를 초기화시킬 수 있는데 
        // 왜, 인스턴스 블록이라는 문법이 존재하는가?
        // 생성자를 정의할 수 있는 상황이라면 인스턴스 블록은 사용할 이유가 없다!
        
        // "익명 클래스"
        // 클래스 이름이 없기 때문에 생성자를 만들 수 없다. 
        Object obj1 = new Object() {
            {
                System.out.println("인스턴스 블록...");
            }
        };
    }
}
