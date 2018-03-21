package step09;
// 인스턴스 메서드와 클래스 메서드 활용 - String 클래스
public class Exam02_1 {
    public static void main(String[] args) throws Exception {
        String s1 = new String("Hello");
        // s1 인스턴스(s1 레퍼런스가 가리키는 인스턴스)의 값을 조회하는 메서드 사용
        // 따라서 이 메서드를 호출하려면 반드시 String 인스턴스의 주소를 줘야 한다.
        char c = s1.charAt(1);
        System.out.println(c);
        System.out.println(s1.compareTo("Helli"));
        System.out.println(s1.compareTo("Hello"));
        System.out.println(s1.compareTo("Hellu"));
        
        System.out.println(s1.contains("ll"));
        System.out.println(s1.contains("oo"));
        
        String s2 = s1.concat(" , world!");
        System.out.println(s1);
        System.out.println(s2);
        
        System.out.println(s1.equals("aaa"));
        System.out.println(s1.equals("Hello"));
        
        String s3 = new String("ABC가각");
        byte[] bytes = s3.getBytes("EUC-KR");
        for (int i = 0; i < bytes.length; i++) 
            System.out.printf("%x,", bytes[i]);
        System.out.println();
        
        String s4 = String.format("%s님 반갑습니다", "홍길동");
        System.out.println(s4);
        
        String s5 = String.join(":", "홍길동", "임꺽정", "유관순");
        System.out.println(s5);
        
        String s6 = String.valueOf(true);
        String s7 = String.valueOf(3.14f);
        String s8 = String.valueOf(100);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        
    }
}
