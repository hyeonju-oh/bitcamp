// 서버 + 키보드 입력 + 무한반복
package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver3 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        // 다른 컴퓨터의 연결 요청을 기다린다.
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        while (true) {
            String str = in.nextLine();
            System.out.println(str);
            
            System.out.print("입력> ");
            String input = keyScan.nextLine();
            out.println(input);
            
            if (str.equals("quit"))
                break;
        }
        
        // 항상 입출력 도구는 사용 후 닫아야 한다.
        in.close();
        out.close();
        
        // 네트워크 연결도 닫는다.
        socket.close();
        serverSocket.close();
        keyScan.close();
    }
}
