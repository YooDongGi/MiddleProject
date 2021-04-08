package lecture.action;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import service.ILectureService;
import service.LectureServiceImpl;
import vo.LectureVO;
import web.IAction;

public class LectureInsert implements IAction  {
	private static final long serialVersionUID = 1L;
       
	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return false;
	}

    public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	request.setCharacterEncoding("utf-8");
    	
//    	String realPath = "D:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\servletTest3\\WebContent\\video";
    	String realPath = "C:\\Users\\db490\\java\\8\\Test\\WebContent\\cvideo";
    	
		// 위 경로의 디렉토리가 존재하지 않으면 새로 생성
		File dir = new File(realPath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
				
		// 파일크기 제한 설정 (15mb)
		int sizeLimit = 150 * 1024 * 1024;

		// MultipartRequest 객체를 생성하면 파일 업로드 수행
		MultipartRequest multpartRequest = new MultipartRequest(request, realPath, sizeLimit, "utf-8",
				new DefaultFileRenamePolicy());
		// 업로드한 파일명 가져오기
		String fileName = multpartRequest.getFilesystemName("file");
		
		
		int mem_no = Integer.parseInt(multpartRequest.getParameter("mem_no"));
		String category = multpartRequest.getParameter("category");
		String intro = multpartRequest.getParameter("intro");
		String lec_nm = multpartRequest.getParameter("lec_nm");
		int price = Integer.parseInt(multpartRequest.getParameter("price"));
		String detail_cont = multpartRequest.getParameter("detail_cont");
		
		detail_cont = detail_cont.replace("\r\n","<br>");
		
		request.setCharacterEncoding("utf-8");
		
		LectureVO vo = new LectureVO();
		vo.setMem_no(mem_no);
		vo.setCategory(category);
		vo.setIntro(intro);
		vo.setLec_nm(lec_nm);
		vo.setPrice(price);
		vo.setDetail_cont(detail_cont);
		vo.setPreview_video(fileName);
		
		
		ILectureService service = LectureServiceImpl.getService();
		int lec_title = service.lectureInsert(vo);
		request.setAttribute("lec_title",lec_title);
		
		return "/lecture/lectureList.do";
		
	}

}


