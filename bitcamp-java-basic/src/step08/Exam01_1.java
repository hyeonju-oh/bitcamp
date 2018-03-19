package step08;
// 인스턴스 변수
public class Exam01_1 {
    
    public static void main(String[] args) {
        // 인스턴스 변수는 new 명령을 통해 생성된다
        // Heap 영역에 생성된다
        class A {
            int v1;
            boolean v2;
        }
        // A클래스에 대해 new 명령을 사용하기 전에는 v1, v2 메모리는 존재하지 않는다.
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        
        obj1.v1 = 100;
        obj2.v1 = 200;
        obj3.v1 = 300;
        
        System.out.printf("%d, %d, %d\n", obj1.v1, obj2.v1, obj3.v1);
        // 인스턴스 변수는 new 명령을 실행할 때마다 생성되기 때문에
        // 각각 구분되는 개별 데이터를 저장할 때 사용한다.
        
    }

}
