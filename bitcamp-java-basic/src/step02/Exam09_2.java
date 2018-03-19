// 배열 - 배열 초기화
package step02;

public class Exam09_2 {
    public static void main(String[] args) {
        
        int[] arr1 = new int[5];
        
        arr1[0] = 0;
        arr1[1] = 0;
        arr1[2] = 0;
        arr1[3] = 0;
        arr1[4] = 0;

        int[] arr2 = new int[]{0, 0, 0, 0, 0};
        int[] arr3 = {0, 0, 0, 0, 0};

        // 배열선언 ==> 초기화
        int[] arr4;
        arr4 = new int[]{0, 0, 0, 0, 0};

        int[] arr5;
        arr5 = {0, 0, 0, 0, 0};

        
    }
}

// 1) 배열 선언 + 초기화
//    데이터타입[] 변수명 = new 데이터타입[]{값, 값, 값};
//    배열을 초기화 시 배열 개수 지정 X
// 2 ) 배열 선언 후 따로 배열 초기화