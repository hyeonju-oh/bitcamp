package bitcamp.java106.board;

import java.util.Scanner;

import bitcamp.java106.board.controller.BoardController2;
import bitcamp.java106.board.util.Console2;

public class App2 {
    static Scanner keyScan = new Scanner(System.in);
    
    static String option = null;
    
    static void onQuit() {
        System.out.println("안녕히가세요!");
    }
    
    public static void main(String[] args) {
        BoardController2.keyScan = keyScan;
        Console2.keyScan = keyScan;
        while (true) {
            String[] arr = Console2.prompt();
            String menu = arr[0];
            
            if (arr.length == 2) {
                option = arr[1];
            } else
                option = null;
            
            if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.startsWith("board/")) {
                BoardController2.service(menu, option);
            } else {
                System.out.println("잘못 입력");
            }
            System.out.println();
        }
        
    }
}
