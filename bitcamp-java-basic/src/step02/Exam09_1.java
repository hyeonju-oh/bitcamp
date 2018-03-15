// 배열 - 배열 선언과 사용
package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        int i1, i2, i3, i4, i5;

        int[] arr1 = new int[5];
        int arr2[] = new int[3]; //C-style

        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;
        
        arr1[5] = 222; // 컴파일 할 때는 인덱스가 유효한지 알 수 없다. 실행시 오류!

    }
}
// 같은 종류의 메모리를 쉽게 만드는 방법
// 메모리종류[] 메모리이름 = new 메모리종류[개수];
// 데이터타입[] 변수명 = new 데이터타입[개수];
// ex) int[] array = new int[5];
// 
// 배열 메모리에 접근
// 배열변수[인덱스] = 값;
// ex) arr[0] = 100;
