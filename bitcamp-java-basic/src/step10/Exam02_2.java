package step10;
// Wrapper 클래스 : auto-boxing / auto-unboxing
public class Exam02_2 {
    public static void main(String[] args) {
        int i1 = 100;
        // int ==> Integer
        Integer obj1 = new Integer(i1);
        
        // Integer ==> int
        Integer obj2 = new Integer(200);
        int i2 = obj2.intValue();
        
        // JDK1.5부터 auto-boxing, auto-unboxing 기능을 제공한다
        // auto-boxing : int 값을 가지고 자동으로 Integer 랩퍼 객체를 만든다.
        Integer obj3 = i1; // 내부적으로 new Integer(i1)으로 바뀐다
                           // 즉 int 값이 obj3에 저장되는 것이 아니라, 내부적으로 Integer 객체가 생성되어 그 주소가 저장된다.
        
        // auto-unboxing : Integer 객체에서 값을 꺼내 리턴한다
        Integer obj4 = new Integer(300);
        int i3 = obj4; // 내부적으로 obj4.intValue()로 바뀐다.
    }
}
