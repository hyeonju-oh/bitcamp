package bitcamp.java106.board;
import java.util.Scanner;
import bitcamp.java106.board.domain.Board;

public class App {
    static Scanner keyScan = new Scanner(System.in);

    static Board[] boards = new Board[1000];
    static int boardIndex = 0;  
    static String option = null;      
    
    static String[] prompt() {
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }

    static boolean confirm(String message) {
        System.out.printf("%s (y/N) ", message); 
        String input = keyScan.nextLine().toLowerCase();
        if (input.equals("y")) 
            return true;
        else
            return false;
    }
    
    static int getBoardIndext(String title) {        
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (title.equals(boards[i].title)) {
                return i;
            }
        }
        return -1;
    }
    
    static void onQuit() {
        System.out.println("안녕히 가세요!");
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
        boards[boardIndex++] = board; 
    }

    static void onBoardList() {
        System.out.println("[게시글 목록]");
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            System.out.printf("%d, %s, %s\n", 
                i, boards[i].title, boards[i].date);
        }
    }

    static void onBoardView() {
        System.out.println("[게시글 조회]");
        if (option == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        Board board = null;
        for (int i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (option.equals(boards[i].title)) {
                board = boards[i];
                break;
            }
        }
        if (board == null) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            System.out.printf("제목: %s\n", board.title);
            System.out.printf("내용: %s\n", board.contents);
            System.out.printf("등록일: %s\n", board.date);
        }
    }
    static void onBoardUpdate() {
        System.out.println("[게시글 변경]");
        if (option == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        Board board = null;
        int i;
        for (i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (option.equals(boards[i].title)) {
                board = boards[i];
                break;
            }
        }
        if (board == null) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            Board updateBoard = new Board();
            System.out.printf("제목(%s): ", board.title);
            updateBoard.title = keyScan.nextLine();
            System.out.printf("내용(%s): ", board.contents);
            updateBoard.contents = keyScan.nextLine();
            System.out.printf("등록일(%s) ", board.date);
            updateBoard.date = keyScan.nextLine();
            boards[i] = updateBoard;
        }
    }
    static void onBoardDelete() {
        System.out.println("[게시글 삭제]");
        if (option == null) {
            System.out.println("제목을 입력하세요");
            return;
        }
        Board board = null;
        int i;
        for (i = 0; i < boardIndex; i++) {
            if (boards[i] == null) continue;
            if (option.equals(boards[i])) {
                board = boards[i];
                break;
            }
        }
        if (i == -1) {
            System.out.println("해당 제목의 게시글이 없습니다.");
        } else {
            if (confirm("정말 삭제하시겠습니까?")) {
                boards[i] = null;
                System.out.println("삭제하였습니다.");
            } 
        }
    }
    
    
    public static void main(String[] args) {
        
         
        while (true) {
            
            String[] arr = prompt();
            String menu = arr[0];
            
            if (arr.length == 2) {
                option = arr[1];
            }

            if (menu.equals("board/add")){
                onBoardAdd();                
            } else if (menu.equals("board/list")) {
                onBoardList();
            } else if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.equals("board/view")) {
                onBoardView();
            } else if (menu.equals("board/update")) {
                onBoardUpdate();
                
            } else if (menu.equals("board/delete")) {
                onBoardDelete();
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }
            System.out.println();
        } 
        
    }
}