// 게시판 관리 - 변경 + PreparedStatement 적용
package step25.ex15;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam02_update {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("업데이트 팀이름? ");
        String name = keyScan.nextLine();
        
        System.out.print("설명? ");
        String description = keyScan.nextLine();
        
        System.out.print("최대인원? ");
        int maxQty = keyScan.nextInt();
        keyScan.nextLine();
        System.out.print("시작일? ");
        Date startDate = Date.valueOf(keyScan.nextLine());
        System.out.print("종료일? ");
        Date endDate = Date.valueOf(keyScan.nextLine());
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        
        PreparedStatement stmt = con.prepareStatement(
            "update ex_team set ds=?, mq=?, sd=?, ed=? where name=?");
        stmt.setString(1, description);
        stmt.setInt(2, maxQty);
        stmt.setDate(3, startDate);
        stmt.setDate(4, endDate);
        stmt.setString(5, name);
        int count = stmt.executeUpdate();
        
        System.out.printf("%d 개 변경 성공!", count);
        
        stmt.close();
        con.close();
        keyScan.close();
    }
}







