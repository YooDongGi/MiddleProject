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
import vo.ClassVO;
import web.IAction;


public class ClassInsert implements IAction  {
	private static final long serialVersionUID = 1L;
       
	@Override
	public boolean isRedirect() {
		return true;
	}

    public String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	request.setCharacterEncoding("utf-8");
//    	String realPath = "C:\\A_TeachingMaterial\\4.MiddleProject\\workspace\\servletTest3\\WebContent\\cvideo";
    	String realPath = "C:\\Users\\db490\\java\\8\\Test\\WebContent\\cvideo";
		
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
		
		System.out.println(fileName);
		int Lec_title = Integer.parseInt(multpartRequest.getParameter("Lec_title"));
		System.out.println(Lec_title);
		String class_nm1 =(String) multpartRequest.getParameter("Main");
		String class_nm2 = multpartRequest.getParameter("Middle");
		String class_nm3 = multpartRequest.getParameter("Subclass");
		String class_nm4 = multpartRequest.getParameter("class_nm");
		
		String class_nm = class_nm1 + class_nm2 + class_nm3 + class_nm4;
		
		request.setCharacterEncoding("utf-8");
		
		ClassVO cvo = new ClassVO();
		
		cvo.setLec_title(Lec_title);
		cvo.setClass_nm(class_nm);
		cvo.setVideo(fileName);
		
		
		ILectureService service = LectureServiceImpl.getService();
		int class_list =service.classInsert(cvo);
		
		
		return "/lecture/lecture.do?Lec_title="+Lec_title;
		
    }	
}
