package basket.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import web.IAction;

public class BasketMoveAction implements IAction{

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int state = Integer.parseInt(request.getParameter("state"));
		int lec_title = Integer.parseInt(request.getParameter("lec_title"));
		
		BasketVO vo = new BasketVO();
		
		vo.setMem_no(mem_no);
		vo.setLec_title(lec_title);
		if(state == 1) {
			vo.setState(2);
		} else if(state == 2) {
			vo.setState(1);
		}
		
		IBasketService service = BasketServiceImpl.getService();
		
		service.moveBasket(vo);
		
		return "/basket/basketList.do?state=" + state+ "&mem_no=" + mem_no;
	}

}
