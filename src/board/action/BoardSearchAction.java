package board.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import vo.PostVO;
import web.IAction;

public class BoardSearchAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int board_no = Integer.parseInt(request.getParameter("board_no"));
		String post_title = request.getParameter("gsearch");
		
		PostVO vo = new PostVO();
		vo.setBoard_no(board_no);
		vo.setPost_title(post_title);
		
		IBoardService service = BoardServiceImpl.getService();
		
		List<PostVO> list = service.boardSearch(vo);
		
		
		request.setAttribute("list", list);
		request.setAttribute("board_no", board_no);
		
		if(board_no == 1) {
			
			return "/board/NoticeBoard.jsp";
		} else {
			return "/board/QnABoard.jsp";
		}
	}

}
