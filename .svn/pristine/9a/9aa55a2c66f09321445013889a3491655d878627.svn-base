package service;

import java.util.List;

import vo.BasketVO;
import vo.MyclassVO;

public interface IBasketService {

	/**
	 * 회원번호에 맞는 장바구니 목록을 출력하는 메소드
	 * @param mem_no	회원 번호
	 * @return			장바구니 목록
	 */
	public List<BasketVO> getBasketList(BasketVO vo);
	
	
	/**
	 * 수강 바구니 담기
	 * @param vo	수강바구니에 담을 내용
	 * @return		
	 */
	public int insertBasket(BasketVO vo);
	
	/**
	 * 수강 바구니에서 강의 중복 검사
	 * @param vo	
	 * @return
	 */
	public int getBasketCount(BasketVO vo);
	
	/**
	 * 수강바구니 - 위시리스트 이동 메소드
	 * @param vo	등록되어 있는 정보
	 * @return		실패하면 0
	 */
	public int moveBasket(BasketVO vo);
	
	/**
	 * 바구니 삭제
	 * @param vo	삭제할 내용
	 * @return		삭제된 수
	 */
	public int deleteBasket(BasketVO vo);
	
	public int insertMyclass(MyclassVO mvo);
}
