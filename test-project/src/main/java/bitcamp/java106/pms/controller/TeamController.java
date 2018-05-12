package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.Console;

public class TeamController {
    Scanner keyScan;
    TeamDao teamDao;
    public TeamController(Scanner keyScan, TeamDao teamDao) {
        this.keyScan = keyScan;
        this.teamDao = teamDao;
    }
           
    public void service(String menu, String option) {
        if (menu.equals("team/add")) {
            teamAdd();
        } else if (menu.equals("team/list")) {
            teamList();
        } else if (menu.equals("team/view")) {
            teamView(option);
        } else if (menu.equals("team/update")) {
            onTeamUpdate(option);
        } else if (menu.equals("team/delete")) {
            onTeamDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
    
    void teamAdd() {
        System.out.println("[팀 정보 입력]");
        Team team = new Team();
        System.out.print("팀명? ");
        team.setName(keyScan.nextLine());
        System.out.print("설명? ");
        team.setDescription(keyScan.nextLine());
        System.out.print("최대인원? ");
        team.setMaxQty(keyScan.nextInt());
        keyScan.nextLine();
        System.out.print("시작일? ");
        team.setStartDate(Date.valueOf(keyScan.nextLine()));
        System.out.print("종료일? ");
        team.setEndDate(Date.valueOf(keyScan.nextLine()));
        teamDao.insert(team);
    }
    
    void teamList() {
        System.out.println("[팀 목록]");
        Team[] list = teamDao.list(); 
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) continue;
            System.out.printf("%s, %d명, %s ~ %s\n" , 
                    list[i].getName(), list[i].getMaxQty(), 
                    list[i].getStartDate(), list[i].getEndDate());
        }
    }
    
    void teamView(String name) {
        System.out.println("[팀 정보 조회]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(name);
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
            
        } else {
            System.out.printf("팀명: %s\n", team.getName());
            System.out.printf("설명: %s\n", team.getDescription());
            System.out.printf("최대인원: %d\n", team.getMaxQty());
            System.out.printf("기간: %s ~ %s\n", 
                    team.getStartDate(), team.getEndDate());
        }
    }
    
    void onTeamUpdate(String name) {
        System.out.println("[팀 정보 변경]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(name);
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        
        } else {
            Team updateTeam = new Team();
            System.out.printf("팀명 : %s\n", team.getName());
            updateTeam.setName(team.getName());
            System.out.printf("설명(%s) ", team.getDescription());
            updateTeam.setDescription(keyScan.nextLine());
            System.out.printf("최대인원(%d) ", team.getMaxQty());
            updateTeam.setMaxQty(keyScan.nextInt());
            keyScan.nextLine();
            System.out.printf("시작일(%s) ", team.getStartDate());
            updateTeam.setStartDate(Date.valueOf(keyScan.nextLine()));
            System.out.printf("종료일(%s) ", team.getEndDate());
            updateTeam.setEndDate(Date.valueOf(keyScan.nextLine()));
            teamDao.update(updateTeam);
            System.out.println("변경하였습니다.");
        }
    }
    
    void onTeamDelete(String name) {
        System.out.println("[팀 정보 삭제]");
        if (name == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(name);
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
            
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                teamDao.delte(team.getName());
                System.out.println("삭제하였습니다.");
            }
        }
    }
    
}