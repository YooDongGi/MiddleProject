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

public class LectureCategory implements IAction {

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
			
			String category = request.getParameter("category");
			
			System.out.println(category);
			ILectureService service = LectureServiceImpl.getService();
			List<LectureVO> lectureList = service.listCategory(category);

			request.setAttribute("category",category);
			request.setAttribute("lectureList", lectureList);

			
			
			return "/lecture/lectureList.jsp";
		}

	}