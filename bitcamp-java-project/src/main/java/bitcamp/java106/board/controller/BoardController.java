package bitcamp.java106.board.controller;

import java.util.Scanner;

import bitcamp.java106.board.domain.Board;
import bitcamp.java106.board.util.Console;

public class BoardController {
    public static Scanner keyScan;

    static Board[] boards = new Board[1000];
    static int boardIndex = 0;  
    
    
    public static void service(String menu, String option) {
        if (menu.equals("board/add")){
            BoardController.onBoardAdd();                
        } else if (menu.equals("board/list")) {
            BoardController.onBoardList();
        } else if (menu.equals("board/view")) {
            BoardController.onBoardView(option);
        } else if (menu.equals("board/update")) {
            BoardController.onBoardUpdate(option);                
        } else if (menu.equals("board/delete")) {
            BoardController.onBoardDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }
    
    static int getBoardIndex(String number) {        
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (boards[i].number == Integer.parseInt(number)) {            
                return i;
            }
        }
        return -1;
    }
    
    

    static void onBoardAdd() {
        Board board = new Board();
        System.out.println("[게시글 등록]");
        System.out.print("제목? ");
        board.title = keyScan.nextLine();
        System.out.print("내용? ");
        board.contents = keyScan.nextLine();
        System.out.print("등록일? ");
        board.date = keyScan.nextLine();
        board.number = boardIndex;
        boards[boardIndex++] = board; 
    }

    static void onBoardList() {
        System.out.println("[게시글 목록]");
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            System.out.printf("%d, %s, %s\n", 
                boards[i].number, boards[i].title, boards[i].date);
        }
    }

    static void onBoardView(String number) {
        System.out.println("[게시글 조회]");
        if (number == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        
        int i = getBoardIndex(number);
       
        if (i == -1) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            Board board = boards[i];
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.contents);
            System.out.printf("등록일: %s\n", board.date);
        }
    }
    static void onBoardUpdate(String number) {
        System.out.println("[게시글 변경]");
        if (number == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        
        int i = getBoardIndex(number);
        
        if (i == -1) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            Board board = boards[i];
            Board updateBoard = new Board();
            System.out.printf("제목(%s): ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s): ", board.contents);
            updateBoard.contents = keyScan.nextLine();
            System.out.printf("등록일(%s) ", board.date);
            updateBoard.date = keyScan.nextLine();
            updateBoard.number = i;
            boards[i] = updateBoard;
        }
    }
    static void onBoardDelete(String number) {
        System.out.println("[게시글 삭제]");
        if (number == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        
        int i = getBoardIndex(number);
        
       
        if (i == -1) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            if (Console.confirm("정말 삭제하시겠습니까?")) {
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            } 
        }
    }
    
}
