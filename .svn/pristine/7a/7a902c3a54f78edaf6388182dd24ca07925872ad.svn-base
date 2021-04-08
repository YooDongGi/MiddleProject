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

public class LectureListAction implements IAction {

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		// 실제 처리할 내용을 기술하고
		// 처리가 끝난 후에 보여줄 View페이지를 반환하면 된다.
		ILectureService service = LectureServiceImpl.getService();
		
		String category = request.getParameter("cate");
//		System.out.println(category);
		
		
		
		List<LectureVO> lectureList = null; 
		if(category ==null) {
			//category가 null이면 모든 강의
			lectureList = service.listAll();
			
		}else {
			// null이 아닐경우 category에 맞는 강의를 list에 저장
			lectureList = service.getsearchcategory(category);
		}
		
		request.setAttribute("lectureList", lectureList);
		request.setAttribute("cate", category);
		return "/lecture/lectureList.jsp";
	}

}

