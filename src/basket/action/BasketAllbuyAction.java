package basket.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.BasketServiceImpl;
import service.IBasketService;
import vo.BasketVO;
import vo.MyclassVO;
import web.IAction;

public class BasketAllbuyAction implements IAction {

	@Override
	public boolean isRedirect() {
		return true;
	}

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		int mem_no = Integer.parseInt(request.getParameter("mem_no"));
		
		System.out.println(mem_no);
		BasketVO vo = new BasketVO();
		vo.setMem_no(mem_no);
		vo.setState(1);
		
		IBasketService service = BasketServiceImpl.getService();
		
		List<BasketVO> list0 = service.getBasketList(vo);
		
		request.setAttribute("list0", list0);

		List<BasketVO> list1 = (List<BasketVO>)request.getAttribute("list0");	
		int count = 0;
		System.out.println(mem_no);	
		for(BasketVO basketVo1 : list1) {
			vo.setMem_no(mem_no);
			vo.setLec_title(basketVo1.getLec_title());
			vo.setState(9);
			service.moveBasket(vo);
		}

		
		//상태가 9인값들 조회
		vo.setMem_no(mem_no);
		vo.setState(9);

		List<BasketVO> list2 = service.getBasketList(vo);
		
		request.setAttribute("list2", list2);

		MyclassVO mvo = new MyclassVO();
		
		//조회값들을 저장
		List<BasketVO> list3 = (List<BasketVO>)request.getAttribute("list2");
		for(BasketVO basketVo : list3) {
			mvo.setMem_no(mem_no);
			mvo.setLec_title(basketVo.getLec_title());
			service.insertMyclass(mvo);
		}
		
		return "/basket/basketList.do?state=" + 1 + "&mem_no=" + mem_no;
	}

}

