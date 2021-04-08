package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import web.IAction;

public class BoardDeleteAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		int post_no = Integer.parseInt(request.getParameter("post_no"));
		
		IBoardService service = BoardServiceImpl.getService();
		
		service.deleteBoard(post_no);
		
		if(board_no == 1) {
			return "/board/NoticeBoard.do?board_no="+board_no;
		} else   {
			return "/board/QnABoard.do?board_no="+board_no;
		}
	}

}
