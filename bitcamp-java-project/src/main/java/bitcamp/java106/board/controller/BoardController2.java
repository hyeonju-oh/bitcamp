package bitcamp.java106.board.controller;

import java.util.Scanner;

import bitcamp.java106.board.domain.Board2;
import bitcamp.java106.board.util.Console2;


public class BoardController2 {
    static Board2[] boards = new Board2[1000];
    static int boardIndex = 0;
    public static Scanner keyScan;
    
    public static void service(String menu, String option) {
        if (menu.equals("board/add")) {
            BoardController2.onBoardAdd();
        } else if (menu.equals("board/list")) {
            BoardController2.onBoardList();
        } else if (menu.equals("board/view")) {
            BoardController2.onBoardView(option);
        } else if (menu.equals("board/update")) {
            BoardController2.onBoardUpdate(option);
        } else if (menu.equals("board/delete")) {
            BoardController2.onBoardDelete(option);
        }
    }
    static int getBoardIndex(String option) {
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (boards[i].number == Integer.parseInt(option)) {
                return i;
            }                
        } 
        return -1;
    }
    static void onBoardAdd() {
        System.out.println("[게시글 등록]");
        Board2 board = new Board2();                
        System.out.print("제목? ");
        board.title = keyScan.nextLine();
        System.out.print("내용? ");
        board.context = keyScan.nextLine();
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
                    boards[i].number, boards[i].context, boards[i].date);
        }
    }
    static void onBoardView(String option) {
        System.out.println("[게시글 조회]");
        if (option == null) {
            System.out.println("index값 입력해");
            return;
        }
        
        int i = getBoardIndex(option);
        
        if (i == -1) {
            System.out.println("같은 index값이 없음");
        } else {
            Board2 board = boards[i];
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.context);
            System.out.printf("등록일: %s\n", board.date);
        }
    }
    static void onBoardUpdate(String option) {
        System.out.println("[게시글 변경]");
        if (option == null) {
            System.out.println("index값 입력해");
            return;
        }        
        int i = getBoardIndex(option);
        if (i == -1) {
            System.out.println("같은 index값이 없음");
        } else {
            Board2 board = boards[i];
            System.out.printf("제목(%s): ", board.title);
            board.title = keyScan.nextLine();
            System.out.printf("내용(%s): ", board.context);
            board.context = keyScan.nextLine();
            System.out.printf("등록일(%s): ", board.date);
            board.date = keyScan.nextLine();
            boards[i] = board;
        }
    }
    static void onBoardDelete(String option) {
        System.out.println("[게시글 삭제]");
        if (option == null) {
            System.out.println("index값 입력해");
            return;
        }
        
        int i = getBoardIndex(option);
        
        if (i == -1) {
            System.out.println("같은 index값이 없음");
        } else {
            if (Console2.confirm("정말 삭제하시겠습니까?")) {
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            }
        }
    }
    
}
