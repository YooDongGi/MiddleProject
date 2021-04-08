package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import web.IAction;

public class ReplyDeleteAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		int post_no= Integer.parseInt(request.getParameter("post_no"));
		int reply_no = Integer.parseInt(request.getParameter("reply_no"));
		
		IBoardService service = BoardServiceImpl.getService();
		
		service.deleteReply(reply_no);
		
		
		return "/board/BoardView.do?board_no="+board_no+"&post_no="+post_no;
	}

}
