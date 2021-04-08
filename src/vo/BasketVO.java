package vo;

public class BasketVO {//장바구니 리스트
	private int mem_no;//회원번호
	private int lec_title;//강의코드
	private String basket_date;//장바구니등록일
	private int state;//상태
	
	private String lec_nm;	// 강의 제목
	private int price;		// 가격
	private String image;	// 이미지 경로
	
	
	// 추가된 것 
	private String category;	// 분류
	
	
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public int getLec_title() {
		return lec_title;
	}
	public void setLec_title(int lec_title) {
		this.lec_title = lec_title;
	}
	public String getBasket_date() {
		return basket_date;
	}
	public void setBasket_date(String basket_date) {
		this.basket_date = basket_date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getLec_nm() {
		return lec_nm;
	}
	public void setLec_nm(String lec_nm) {
		this.lec_nm = lec_nm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
