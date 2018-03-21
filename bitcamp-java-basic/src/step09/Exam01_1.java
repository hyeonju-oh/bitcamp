package step09;
// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용을 익혀보자!
public class Exam01_1 {
    public static void main(String[] args) throws Exception {
        // 생성자를 호출하여 문자열 인스턴스를 초기화시킨다.
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 !== s2");
        }

        char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        System.out.printf("%s, %s, %s\n", s1, s2, s3);
        
        byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, (byte)0xa2,
                (byte)0xb6, (byte)0xca, (byte)0xb6, (byte)0xcb};
        String s4 = new String(bytes);
        System.out.println(s4);
        // 출력이 깨지는 이유는 EUC-KR 코드 값이 들어 있는 바이트 배열이 제대로 유니코드 배열로 저장되지 않았기 때문
        // 이 생성자는 바이트 배열에 들어 있는 값이 ISO-8859-1 이라고 간주하기 때문이다.
        
        String s5 = new String(bytes, "EUC-KR");
        System.out.println(s5);
    }
}
