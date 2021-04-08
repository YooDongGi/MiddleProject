package basket.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import web.IAction;

public class BasketDeleteAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int lec_title = Integer.parseInt(request.getParameter("lec_title"));
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int state = Integer.parseInt(request.getParameter("state"));
		
		BasketVO vo = new BasketVO();
		
		vo.setLec_title(lec_title);
		vo.setMem_no(mem_no);

		IBasketService service = BasketServiceImpl.getService();
		
		int cnt = service.deleteBasket(vo);
		
		return "/basket/basketList.do?state=" + state+ "&mem_no=" + mem_no;
	}

}
