package step01;
public class Exam03 {
    /**
     변수 선언 앞에 설명을 붙여 놓으면 나중에 HTML문서를 만들데 추출
     */
    int a;
 
    public static void main(String[] args) {
        System.out.println("src/step01/Exam03");
    }

    /* 애노테이션 : @이름 형태로 된 주석
    컴파일러나 JVM에게 특별한 명령을 전달할 때 사용하는 아주 특별한 주석
    컴파일한 후에도 .class 파일에 존재할 수 있다
    */
    @Override
    public String toString() {
        return "Exam03";
    }
}