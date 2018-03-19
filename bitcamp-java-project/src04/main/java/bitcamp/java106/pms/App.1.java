package bitcamp.java106.pms;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {    
        Scanner keyScan = new Scanner(System.in);
                
        Team[] teams = new Team[5];
        Member[] members = new Member[5];
        String[] cmd = new String[10];
       
        int a = 0, b = 0;
        for (int i = 0; i < cmd.length; i++) {
            
            System.out.print("명령> ");
            cmd[i] = keyScan.nextLine();

            String[] parts = new String[2];
            parts = cmd[i].split(" ");
            
            teams[a] = new Team();
            members[b] = new Member();
            
            if (cmd[i].equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                System.out.println();

            } else if (cmd[i].equals("team/add")) {
                   
                System.out.print("팀명? ");
                teams[a].name = keyScan.nextLine();
                System.out.print("설명? ");
                teams[a].description = keyScan.nextLine();
                System.out.print("최대인원? ");
                teams[a].maxQty = keyScan.nextInt();
                keyScan.nextLine();
                System.out.print("시작일? ");
                teams[a].startDate = keyScan.nextLine();
                System.out.print("종료일? ");
                teams[a].endDate = keyScan.nextLine(); 
                a++; 
                System.out.println();         

            } else if (cmd[i].equals("team/list")) {
                for (int j = 0; j < a; j++){
                    System.out.printf("%s, %d, %s ~ %s\n", 
                        teams[j].name, teams[j].maxQty, 
                        teams[j].startDate, teams[j].endDate);                                           
                }
                System.out.println();

            } else if (parts[0].equals("team/view")) {
                if (parts[1].equals("")) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                } else {
                    boolean check = true;
                    for (int j = 0; j < a; j++) {
                        if (parts[1].equals(teams[j].name)) {
                            System.out.printf("팀명: %s\n", teams[j].name);
                            System.out.printf("설명: %s\n", teams[j].description);
                            System.out.printf("최대인원: %d\n", teams[j].maxQty);
                            System.out.printf("기간: %s ~ %s\n", 
                                teams[j].startDate, teams[j].endDate);
                            check = false;
                        }  
                    }                      
                    if(check) System.out.println("해당 이름의 팀이 없습니다.");
                    System.out.println();
                }               
            } else if (cmd[i].equals("member/add")) {
                System.out.print("아이디? ");
                members[b].id = keyScan.nextLine();
                System.out.print("이메일? ");
                members[b].email = keyScan.nextLine();
                System.out.print("암호? ");
                members[b].pw = keyScan.nextLine();
                b++; 
                System.out.println();

            } else if (cmd[i].equals("member/list")) {
                for (int j = 0; j < b; j++){
                    System.out.printf("%s, %s, %s\n", 
                        members[j].id, members[j].email, members[j].pw);                                           
                }
                System.out.println();

            } else if (cmd[i].equals("member/view")) {
/*
                System.out.printf("아이디: %s\n", members[j].id);
                System.out.printf("이메일: %s\n", members[j].email);
                System.out.printf("암호: %s\n", mebers[j].pw);

                System.out.println("해당 아이디의 회원이 없습니다.");
                
                System.out.println("아이디를 입력하시기 바랍니다.");
*/
            
            } else if (cmd[i].equals("quit")) {
                System.out.println("안녕히가세요!");
                break;
            } else {
                System.out.println("명령어가 올바르지 않습니다.\n");
                
            }
            /*
            String[] parts = cmd[i].split(" ");
            String part1 = parts[0];
            String part2 = parts[1];
            System.out.println(part1);
            System.out.println(part2);*/
            /*
                System.out.printf("팀명: %s\n", teams[j].name);
                System.out.printf("설명: %s\n", teams[j].description);
                System.out.printf("최대인원: %d\n", teams[j].maxQty);
                System.out.printf("기간: %s ~ %s\n", 
                    temas[j].startDate, teams[j].endDate);
                else if (part2 == teams[a].name )
                System.out.println("해당 이름의 팀이 없습니다.");
                else 
                System.out.println("팀명을 입력하시기 바랍니다.");  */   
        }
    }
}