package basket.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import web.IAction;

public class BasketListAction implements IAction{

	@Override
	public boolean isRedirect() {
		return false;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		int state = Integer.parseInt(request.getParameter("state"));
		
		
		BasketVO vo = new BasketVO();
		vo.setMem_no(mem_no);
		vo.setState(state);
		
		IBasketService service = BasketServiceImpl.getService();
		
		List<BasketVO> list = service.getBasketList(vo);
		
		request.setAttribute("list", list);
		request.setAttribute("state", state);
		
		return "/basket/BasketList.jsp";
	}

}
