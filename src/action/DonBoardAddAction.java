package action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import service.BoardServiceImpl;
import service.IBoardService;
import vo.PostVO;
import web.IAction;

public class DonBoardAddAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		String realPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\LearningMarket\\WebContent\\donvideo";
//		String realPath = "C:\\Users\\db490\\java\\8\\Test\\WebContent\\cvideo";
		// 위 경로의 디렉토리가 존재하지 않으면 새로 생성
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
				
		// 파일크기 제한 설정 (15mb)
		int sizeLimit = 1000 * 1024 * 1024;

		// MultipartRequest 객체를 생성하면 파일 업로드 수행
		MultipartRequest multpartRequest = new MultipartRequest(request, realPath, sizeLimit, "utf-8",
				new DefaultFileRenamePolicy());
		// 업로드한 파일명 가져오기
		String fileName = multpartRequest.getFilesystemName("file");
		
		int board_no = Integer.parseInt(multpartRequest.getParameter("board_no"));
		String post_title = multpartRequest.getParameter("post_title");
		String post_cont = multpartRequest.getParameter("post_cont");
		int mem_no = Integer.parseInt(multpartRequest.getParameter("mem_no"));
		String do_video = fileName;
		
		PostVO vo = new PostVO();
		vo.setMem_no(mem_no);
		vo.setBoard_no(board_no);
		vo.setPost_title(post_title);
		vo.setPost_cont(post_cont);
		vo.setDo_video(do_video);
		
		
		IBoardService service = BoardServiceImpl.getService();
		
		
		int cnt = service.insertBoard(vo);
		
		return "/board/DonBoard.do?board_no="+board_no;
		
	}

}
