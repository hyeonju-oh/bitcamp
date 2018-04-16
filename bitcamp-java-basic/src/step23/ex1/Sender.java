// 상대편에게 연결을 요청하기 - 클라이언트 
package step23.ex1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.0.7", 8888);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        // 서버에서 데이터를 읽을 때까지 리턴하지 않는다.
        // 이런 메서드를 블로킹(blocking) 메서드라 부른다.
        out.println("오현주!!입니다~ 안녕하세요~");
        
        // 상대편에서 보낸 문자열을 한 줄 읽는다.
        // 상대편이 한 줄 데이터를 보낼 때까지 리턴하지 않는다.
        // 이런 메서드를 블로킹 메서드라 부른다.
        String str = in.nextLine();
        System.out.println(str);
        
        // 항상 입출력 도구는 사용 후 닫아야 한다.
        in.close();
        out.close();
        
        // 네트워크 연결도 닫는다.
        socket.close();
    }
}
