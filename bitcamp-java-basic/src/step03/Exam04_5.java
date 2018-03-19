// 클래스 사용 - import
package step03;
// 구체적으로 클래스 이름을 지정하지 않고 패키지명 다음에 wildcard(*)를 지정한다면
// 그 패키지의 모든 클래스를 패키지명 없이 사용할 수 있다
import step03.test.*;
import java.util.*;
import java.lang.reflect.*;

public class Exam04_5 {
    public static void main(String[] args) {
        // 다른 패키지의 클래스 사용
        // ->패키지 이름을 항상 붙여야 한다.
        // 그래야만 컴파일러가 해당 클래스를 찾을 수 있다.
        step03.test.B v1;
        v1 = new step03.test.B();

        B v2;
        v2 = new B();

        Method obj1;
        Calendar obj2;
        
    }
}