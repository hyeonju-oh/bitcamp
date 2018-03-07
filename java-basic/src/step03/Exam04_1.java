// 클래스 사용 - 패키지 클래스 사용
package step03;

public class Exam04_1 {
    public static void main(String[] args) {
        // 바깥 쪽에 별도 선언한 클래스를 사용하기
        Score s1 = new Score();

        s1.name = "홍길동";

        System.out.println(s1.name);
    }
}

// javac -encoding UTF-8 -d bin src/step03/Exam04_1.java
// -> Exam04_1.java 컴파일 오류 : Score 클래스를 찾을 수 없음
// Exam04_1.java에서 Score 클래스를 사용하는데 컴파일할 때 Score 클래스 정보 필요
// 컴파일러가 Score 클래스에 대한 정보를 모르기 때문에 컴파일 오류!
// 해결책 : 컴퍼일러에게 Score 클래스에 대한 정보를 알려줘라!
// 1) Score.class 파일을 갖고 있으면 그 파일이 있는 위치를 알려줘라
//      javac -encoding UTF-8 -d bin -classpath bin src/step03/Exam04_1.java
// 2) Score 클래스의 소스 파일이 있다면 소스 파일의 위치를 알려줘라.
//      javac -encoding UTF-8 -d bin -sourcepath src src/step03/Exam04_1.java
// 자바에서 기본으로 제공하는 클래스가 아닌 다른 클래스를 사용할 때~~~