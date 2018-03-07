// 배열 - 배열 레퍼런스와 배열 인스턴스의 관계
//        부제 : garbage와 garbage 컬렉터
package step02;

public class Exam09_4 {
    public static void main(String[] args) {
        int[] arr1;                                                                                                                                                                                                                                                                                                                                                                                                                                
        arr1 = new int[]{100, 200, 300}; // garbage
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]); 

        arr1 = new int[]{10, 20, 30, 40, 50};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        
    }
}

// 레퍼런스(reference) : 값이 아닌 메모리의 주소를 담는 변수
// 인스턴스(instance) : 값을 저장하고 있는 메모리