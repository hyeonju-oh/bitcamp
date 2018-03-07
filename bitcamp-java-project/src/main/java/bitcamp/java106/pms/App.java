package bitcamp.java106.pms;

import javax.lang.model.util.ElementScanner6;

public class App {
    public static void main(String[] args) {
        java.io.InputStream s = System.in;
        java.util.Scanner sc = new java.util.Scanner(s);

        class Project {
            String teamName;
            String ss;
            int num;
            String sd;
            String ed;
        }
        
        Project[] pro = new Project[5];
        
        int a = 0;
        for (int i = 0; i < pro.length; i++) {
            
            System.out.print(i);
            
            pro[i] = new Project();

            System.out.print("팀명? ");
            pro[i].teamName = sc.nextLine();
            System.out.print("설명? ");
            pro[i].ss = sc.nextLine();
            System.out.print("최대인원? ");
            pro[i].num = sc.nextInt();
            sc.nextLine();
            System.out.print("시작일? ");
            pro[i].sd = sc.nextLine();
            System.out.print("종료일? ");
            pro[i].ed = sc.nextLine();
            
            System.out.print("계속 입력하시겠습니까?(Y/n) ");
            String question = sc.nextLine();
            a = i;
            if (question.equals("n")){
                break;
            }
            else if (question.equals("Y")){
                continue;
            }
            else{
                System.out.println("Y나 n을 입력해 주세요");
                i--;
                
            }
                
        }

        
        System.out.println("-------------------");

        for(int i = 0; i <= a; i++) {
            System.out.printf("%s, %d명, %s ~ %s\n", 
                pro[i].teamName, pro[i].num, pro[i].sd, pro[i].ed);
            
        }     
    }
}