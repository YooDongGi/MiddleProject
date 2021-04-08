package lecture.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ILectureService;
import service.LectureServiceImpl;
import vo.ClassVO;
import vo.LectureVO;
import web.IAction;

public class LectureAction implements IAction {

		@Override
		public boolean isRedirect() {
			return false;
		}

		@Override
		public String process(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			// 실제 처리할 내용을 기술하고
			// 처리가 끝난 후에 보여줄 View페이지를 반환하면 된다.
			
			request.setCharacterEncoding("utf-8");
			
			int Lec_title = 0;
			
			
			Lec_title = Integer.parseInt(request.getParameter("Lec_title"));
			
			ILectureService service = LectureServiceImpl.getService();	

			List<LectureVO> lectureList = service.lecture(Lec_title);
			
			request.setAttribute("lectureList", lectureList);

			List<ClassVO> classList = service.classList(Lec_title);
			request.setAttribute("lectureList2", classList);
			
			
	
			return "/lecture/lecture.jsp";
		}

	}