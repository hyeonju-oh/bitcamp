// 배열 - 배열 레퍼런스와 배열 인스턴스(배열의 비밀)
package step02;

public class Exam09_3 {
    public static void main(String[] args) {
        int[] arr1;                                                                                                                                                                                                                                                                                                                                                                                                                                

        arr1 = new int[5]; 

        arr1[0] = 100; // arr1에 저장된 주소로 찾아가서 0번째 항목에 값을 넣어라
        arr1[1] = 2;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        // 단 한 번이라도 메모리에 값을 넣지 않은 상태에서 그 메모리의 값을 
        // 사용하려면 컴파일 오류가 발생한다.
        int a;
        //System.out.println(a); // 컴파일오류!

        // new 명령으로 확보된 메모리는 종류에 상관없이, 자동으로 0 으로 초기화
        // 값을 넣지 않고 바로 사용할 수 있다.
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
    }
}

// 레퍼런스(reference) : 값이 아닌 메모리의 주소를 담는 변수
// 인스턴스(instance) : 값을 저장하고 있는 메모리