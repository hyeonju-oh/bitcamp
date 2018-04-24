// 게시물 관리 - 조회 + PreparedStatement 적용
package step25.ex15;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Exam02_view {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("조회할 팀이름? ");
        String name = keyScan.nextLine();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        java.sql.Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java106db?serverTimezone=UTC&useSSL=false",
                "java106", "1111");

        PreparedStatement stmt = con.prepareStatement(
            "select ds,mq,sd,ed from ex_team where name=?");
        stmt.setString(1, name);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            System.out.printf("팀이름: %s\n", rs.getString("name"));
            System.out.printf("설명: %s\n", rs.getString("ds"));
            System.out.printf("최대인원: %d\n", rs.getInt("mq"));
            System.out.printf("시작일: %s\n", rs.getDate("sd"));
            System.out.printf("종료일: %s\n", rs.getDate("ed"));
        } else {
            System.out.println("해당 팀이 없습니다!");
        }
       
        rs.close();
        stmt.close();
        con.close();
        keyScan.close();
    }
}







