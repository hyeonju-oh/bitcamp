package bitcamp.java106.pms.servlet.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import bitcamp.java106.pms.dao.BoardDao;
import bitcamp.java106.pms.domain.Board;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

@WebServlet("/board/add")
public class BoardAddServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    BoardDao boardDao;
    
    @Override
    public void init() throws ServletException {
        // 1) 원래 코드는 InitServlet에서 스프링 IoC 컨테이너를 꺼냈다.
        // board = InitServlet.getApplicationContext().getBean(BoardDao.class);
        
        // 2) ServletContextListener의 구현체에서 스프링 IoC 컨테이너를 꺼냈다.
        // boardDao = ContextLoaderListener.getApplicationContext().getBean(BoardDoa.class);
        
        // 3) 실제 스프링 WebMVC 프레임워크에서는 ContextLoaderListener에
        //    getApplicationContext()가 없다.
        // 대신에 WebApplicationContextUtils라는 클래스에서
        // getWebApplicationContext() 메서드를 호출하여 꺼낸다.
        //
        // 이런 스프링 방식을 모방하기 위해 우리는 WebApplication ...
        
        ApplicationContext iocContainer = WebApplicationContextUtils.getWebApplicationContext(
                this.getServletContext());
        boardDao = iocContainer.getBean(BoardDao.class);
    }
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        try {
            Board board = new Board();
            board.setTitle(request.getParameter("title"));
            board.setContent(request.getParameter("content"));

            boardDao.insert(board);
            response.sendRedirect("list");
            
        } catch (Exception e) {
            RequestDispatcher 요청배달자 = request.getRequestDispatcher("/error");
            
            request.setAttribute("error", e);
            request.setAttribute("title", "게시물 등록 실패!");
            
            요청배달자.forward(request, response);
        }
    }

}

//ver 39 - forward 적용
//ver 38 - redirect 적용
//ver 37 - BoardAddController 클래스를 서블릿으로 변경
//         출력 결과를 HTML로 변경
//         자동 Refresh 태그 추가
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 add() 메서드를 추출하여 클래스로 정의. 






