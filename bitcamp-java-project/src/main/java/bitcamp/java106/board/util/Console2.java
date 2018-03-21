package bitcamp.java106.board.util;

import java.util.Scanner;

public class Console2 {
    public static Scanner keyScan;
    public static String[] prompt() {
        System.out.print("명령> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }
    public static boolean confirm(String message) {
        System.out.printf("%s(y/N) ", message);
        String str = keyScan.nextLine();
        if (str.equals("y")) 
            return true;
        else 
            return false;
    }
}
