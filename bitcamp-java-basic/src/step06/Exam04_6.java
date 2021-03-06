// 메서드 : 스택 메모리 응용3 - 스택 오버플로우
package step06;

public class Exam04_6 {
    static int sum(int value) {
        // 종료 조건을 빼버리면, 무한으로 호출한다.
        //if (value == 1)
        //  return 1;
        long a1, a2, a3, a4, a5, a6, a7, a8, a9;
        long a11, a12, a13, a14, a15, a16, a17, a18, a19;
        long a111, a112, a113, a114, a115, a116, a117, a118, a119;
        
        
        System.out.println(value);
        return value + sum(value - 1);
        
    }
   
    public static void main(String[] args) {
        System.out.println(sum(5));

    }
}

// 재귀호출(recursive call)
// 수학식을 코드를 표현하기가 편고 코드가 간결하다
// 그러나 반복문을 사용하는 경우보다 메모리를 많이 사용한다.
// 멈춰야 할 조건을 빠뜨리면 스택 메모리가 극한으로 증가하여
// 메모리가 부족한 상태에 빠진다. => "StackOverFlow"