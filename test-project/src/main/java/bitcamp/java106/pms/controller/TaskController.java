package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TaskDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.dao.TeamMemberDao;
import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Team;

public class TaskController {
    Scanner keyScan;
    TeamDao teamDao;
    TaskDao taskDao;
    MemberDao memberDao;
    TeamMemberDao teamMemberDao;
    
    public TaskController(Scanner scanner, TeamDao teamDao, 
            TaskDao taskDao, TeamMemberDao teamMemberDao, MemberDao memberDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
        this.taskDao = taskDao;
        this.teamMemberDao = teamMemberDao;
        this.memberDao = memberDao;
    }
           
    public void service(String menu, String option) {
        if (option == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return;
        }
        
        Team team = teamDao.get(option);
        if (team == null) {
            System.out.printf("'%s'팀은 존재하지 않습니다.", option);
            return;
        }
        
        if (menu.equals("task/add")) {
            onTaskAdd(team);
        } else if (menu.equals("task/list")) {
            onTaskList(team);
        } else if (menu.equals("task/view")) {
            onTaskView(team);
        } else if (menu.equals("task/update")) {
            onTaskUpdate(team);
        } else if (menu.equals("task/delete")) {
            onTaskDelete(team);
        } else if (menu.equals("task/state")) {
            onTaskState(team);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    private void onTaskAdd(Team team) {
        Task task = new Task(team);
        
        System.out.println("[팀 작업 추가]");
        System.out.print("작업명? ");
        task.setTitle(keyScan.nextLine());
        System.out.print("시작일? ");
        task.setStartDate(Date.valueOf(keyScan.hasNextLine()));
    }

    private void onTaskList(Team team) {
        // TODO Auto-generated method stub
        
    }

    private void onTaskView(Team team) {
        // TODO Auto-generated method stub
        
    }

    private void onTaskUpdate(Team team) {
        // TODO Auto-generated method stub
        
    }

    private void onTaskDelete(Team team) {
        // TODO Auto-generated method stub
        
    }

    private void onTaskState(Team team) {
        // TODO Auto-generated method stub
        
    }

    

}
