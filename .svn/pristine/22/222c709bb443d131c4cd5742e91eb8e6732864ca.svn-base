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

public class LectureUpdate implements IAction  {
	private static final long serialVersionUID = 1L;
       
	@Override
	public boolean isRedirect() {
		// TODO Auto-generated method stub
		return true;
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
		int lec_title = Integer.parseInt(multpartRequest.getParameter("lec_title"));
		// 업로드한 파일명 가져오기
		String fileName = null;
		if(multpartRequest.getFilesystemName("file")!=null) {
		fileName = multpartRequest.getFilesystemName("file");
		}else if(multpartRequest.getFilesystemName("file")==null){
		fileName =  multpartRequest.getParameter("preview_video");
		}
		System.out.println(realPath+"\\"+fileName + ","+lec_title);
		
		request.setCharacterEncoding("utf-8");
		
		
		String intro		 =	multpartRequest.getParameter("intro");
		String lec_nm 		 =	multpartRequest.getParameter("lec_nm");
		int price	 	 =	Integer.parseInt(multpartRequest.getParameter("price"));
		String detail_cont 	 =	multpartRequest.getParameter("detail_cont");
		
		detail_cont   = detail_cont.replace("\r\n","<br>");
		
		ILectureService service = LectureServiceImpl.getService();
		LectureVO vo = new LectureVO();

		vo.setLec_title(lec_title);
		vo.setIntro(intro);
		vo.setLec_nm(lec_nm);
		vo.setPrice(price);
		vo.setDetail_cont(detail_cont);
		vo.setPreview_video(fileName);
		
		
		int cnt = service.update(vo);
		
	
		request.setAttribute("Lec_title",lec_title);
		return "/lecture/lecture.do?Lec_title=" + lec_title;
		
	}
}


