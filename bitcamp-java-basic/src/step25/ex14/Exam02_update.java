// 게시판 관리 - 변경 + PreparedStatement 적용
package step25.ex14;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exam02_update {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("업데이트 아이디? ");
        String id = keyScan.nextLine();
        
        System.out.print("email? ");
        String email = keyScan.nextLine();
        
        System.out.print("password? ");
        String password = keyScan.nextLine();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");
        
        PreparedStatement stmt = con.prepareStatement(
            "update ex_member set email=?, pw=? where id=?");
        stmt.setString(1, email);
        stmt.setString(2, password);
        stmt.setString(3, id);
        int count = stmt.executeUpdate();
        
        System.out.printf("%d 개 변경 성공!", count);
        
        stmt.close();
        con.close();
        keyScan.close();
    }
}







