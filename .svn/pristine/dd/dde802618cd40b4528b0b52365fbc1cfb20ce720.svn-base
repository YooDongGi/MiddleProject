package board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BoardServiceImpl;
import service.IBoardService;
import vo.ReplyVO;
import web.IAction;

public class ReplyAddAction implements IAction{

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
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		String reply_cont = request.getParameter("reply_cont");

		
		ReplyVO vo = new ReplyVO();
		vo.setPost_no(post_no);
		vo.setReply_cont(reply_cont);
		vo.setMem_no(mem_no);
		
		IBoardService service = BoardServiceImpl.getService();
		
		service.insertReply(vo);
		
		if(board_no == 3) {
			return "/board/DonBoardView.do?board_no="+board_no+"&post_no="+post_no;
		}else {
		return "/board/BoardView.do?board_no="+board_no+"&post_no="+post_no;
		}
	}

}
