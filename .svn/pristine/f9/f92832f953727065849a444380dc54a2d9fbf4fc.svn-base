package lecture.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ILectureService;
import service.LectureServiceImpl;
import vo.LectureVO;
import web.IAction;

public class LectureDif implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// 실제 처리할 내용을 기술하고
		// 처리가 끝난 후에 보여줄 View페이지를 반환하면 된다.

		request.setCharacterEncoding("UTF-8");
		
		//0.클라이언트 데이터 가져오기
		String category = request.getParameter("cate");
		String lec_nm = request.getParameter("dif");
		
		LectureVO vo = new LectureVO();
		
		vo.setCategory(category);
		vo.setLec_nm(lec_nm);
		
		ILectureService service = LectureServiceImpl.getService();
		List<LectureVO> list = service.lectureDif(vo);
		
		request.setAttribute("cate",category);
		request.setAttribute("lectureList",list);

		
		return "/lecture/lectureList.jsp";
	}

}