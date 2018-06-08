package bitcamp.java106.step13.ex6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Caller {
    
    @Autowired X x;
    
    public void test() {
        int result = x.m1(10, 2);
        System.out.printf("result: %d\n", result);
        
        result = x.m1(10, 0);
        System.out.printf("result: %d\n", result);
    }
}
