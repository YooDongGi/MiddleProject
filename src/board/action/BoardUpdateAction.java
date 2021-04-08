package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import vo.PostVO;
import web.IAction;

public class BoardUpdateAction implements IAction{

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
		
		String post_title = request.getParameter("post_title");
		String post_cont = request.getParameter("post_cont");
		
		System.out.println("수정된 내용 : " + post_title);
		System.out.println("수정된 내용 : " + post_cont);
		
		PostVO vo = new PostVO();
		vo.setPost_no(post_no);
		vo.setPost_title(post_title);
		vo.setPost_cont(post_cont);
		
		IBoardService service = BoardServiceImpl.getService();
		
		service.updateBoard(vo);
		
		if(board_no == 1) {
			return "/board/NoticeBoard.do?board_no="+board_no;
		} else   {
			return "/board/QnABoard.do?board_no="+board_no;
		}
	}

}
