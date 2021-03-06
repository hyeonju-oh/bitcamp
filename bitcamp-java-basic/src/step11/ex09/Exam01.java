package step11.ex09;
// 다형성 - 다형적 변수(polymorphic variables)
public class Exam01 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Bike b = new Bike();
        Car c = new Car();
        Sedan s = new Sedan();
        Truck t = new Truck();
        
        // 레퍼런스는 같은 타입의 객체를 가리킬 수 있을 뿐만 아니라 그 클래스의 서브클래스 객체까지 가리킬 수 있다.
        // 왜? 서브 클래스는 항상 상위 클래스의 모든 것을 사용할 수 있기 때문이다.
        
        // 이런 규칙에 따라, 다음 v2 변수는 vehicle 객체 뿐만 아니라
        // Bike, Car, Sedan, Truck 객체까지 다양한 서브클래스의 객체를 가리킬 수 있다.
        // 그래서 v2는 "다형적 변수"의 기능을 갖고있다 말한다.
        Vehicle v2 = null;
        v2 = b;
        v2 = c;
        v2 = s;
        v2 = t;
        
        Bike b2 = null;
        //b2 = v; // 컴파일 오류
        //b2 = c; // 컴파일 오류
        //b2 = s; // 컴파일 오류
        //b2 = t; // 컴파일 오류
        
        Car c2 = null;
        //c2 = v; // 컴파일 오류
        //c2 = b; // 컴파일 오류
        c2 = s;
        c2 = t;
        
        Sedan s2 = null;
        s2 = v; // 컴파일 오류
        s2 = b; // 컴파일 오류
        s2 = c; // 컴파일 오류
        s2 = t; // 컴파일 오류
    }
}
