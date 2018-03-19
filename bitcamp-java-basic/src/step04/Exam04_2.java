package step04;
// 비트 이동 연산자 : >>, >>>, <<
public class Exam04_2 {
    public static void main(String[] args) {
        int i = 0b01101001; // 105
        System.out.println(i);
        System.out.println(i >> 1); //00110100 52
        System.out.println(i >> 2); //00011010 26
        System.out.println(i >> 3); //00001101 13
        System.out.println(i >> 4); //00000110 6
        // 오른쪽으로 이동 후, 왼쪽 빈자리는 원래 숫자와 같은 부호로 값을 채운다
        // 오른쪽 경계를 넘어간 비트는 짜른다
       
        // 음수를 이동
        i = 0b11111111_11111111_11111111_1010_1001;
        System.out.println(i); //-87
        System.out.println(i >> 1); //11010100 -44
        System.out.println(i >> 2); //11101010 -22
        System.out.println(i >> 3); //11110101 -11
        System.out.println(i >> 4); //11111010 -6
        // 2로 나눈 후에 소수점이 있으면 그 수보다 더 작은 정수값이 되는 결과가 나옴

        
    }
}