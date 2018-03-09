package step04;
// 비트 이동 연산자 : >>, >>>, <<
public class Exam04_3 {
    public static void main(String[] args) {
        int i = 0b01101001; // 105
        System.out.println(i);
        System.out.println(i >>> 1); //00110100 52
        System.out.println(i >>> 2); //00011010 26
        System.out.println(i >>> 3); //00001101 13
        System.out.println(i >>> 4); //00000110 6
        // >>> 연산자를 사용하여 오른쪽으로 이동한다면,
        // 왼쪽 빈자리는 무조건 0으로 채운다
        // 그래서 양수일 때는 >> 연산자와 같은 결과가 나오지만
        // 다음과 같이 음수 일때는 양수로 바뀌는 결과가 나온다
       
        // 음수를 이동
        // 왼쪽 빈자리는 0으로 채운다
        i = 0b11111111_11111111_11111111_1010_1001;
        System.out.println(i); //-87
        System.out.println(i >>> 1); //11010100 2147483604
        System.out.println(i >>> 2); //11101010 1073741802
        System.out.println(i >>> 3); //11110101 536870901
        System.out.println(i >>> 4); //11111010 268435450
        // 2로 나눈 후에 소수점이 있으면 그 수보다 더 작은 정수값이 되는 결과가 나옴

        
    }
}