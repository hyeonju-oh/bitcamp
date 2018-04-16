// 상대편으로부터 연결 요청 받기 - 서버(server)
package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver {
    public static void main(String[] args) throws Exception {
        // 다른 컴퓨터의 연결 요청을 기다린다.
        ServerSocket serverSocket = new ServerSocket(8888);
        
        // 연결하기 위해 대기하고 있는 컴퓨터 중에서 한 개를 연결 허락 한다.
        Socket socket = serverSocket.accept();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        
        // 상대편에서 보낸 문자열을 한 줄 읽는다.
        // 상대편이 한 줄 데이터를 보낼 때까지 리턴하지 않는다.
        // 이런 메서드를 블로킹 메서드라 부른다.
        String str = in.nextLine();
        System.out.printf("상대편> %s\n", str);

        // 서버에서 데이터를 읽을 때까지 리턴하지 않는다.
        // 이런 메서드를 블로킹(blocking) 메서드라 부른다.
        out.println("나는 오현주입니다! 반갑습니다~");
        
        // 항상 입출력 도구는 사용 후 닫아야 한다.
        in.close();
        out.close();
        
        // 네트워크 연결도 닫는다.
        socket.close();
        serverSocket.close();
    }
}
