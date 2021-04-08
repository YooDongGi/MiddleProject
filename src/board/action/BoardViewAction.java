package board.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import vo.PostVO;
import vo.ReplyVO;
import web.IAction;

public class BoardViewAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int boardno = Integer.parseInt(request.getParameter("board_no"));
		int postno = Integer.parseInt(request.getParameter("post_no"));
		
		IBoardService boardservice = BoardServiceImpl.getService();
		
		PostVO vo = boardservice.getBoardView(postno);
		
		List<ReplyVO> list = boardservice.getReplyView(postno);
		
		request.setAttribute("board_no", boardno);
		request.setAttribute("post_no", postno);
		request.setAttribute("boardView", vo);
		request.setAttribute("replyView", list);
		
		return "/board/BoardView.jsp";
	}

}
