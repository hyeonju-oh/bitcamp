package step09;

import java.util.Date;

// 인스턴스 메서드와 클래스 메서드 활용 - Date 클래스
public class Exam02_4 {
    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        
        System.out.println(d1.getYear()+1900);
        System.out.println(d1.getMonth()+1);
        System.out.println(d1.getDate());
        
        long millis = Date.parse("Sat, 12 Aug 1995 13:30:00 GMT");
        System.out.println(millis);
        
        // 실무에서는 java.util.Date 대신 이 클래스의 자식 클래스인  java.sql.Date을 쓰기도 한다
        long currMillis = System.currentTimeMillis();
        
        java.sql.Date today = new java.sql.Date(currMillis);
        
        // 인스턴스 메서드 활용
        String str = today.toString();
        System.out.println(str);
        
        // 스태틱 메서드 활용
        java.sql.Date d = java.sql.Date.valueOf("2018-03-21");
        
    }
}
