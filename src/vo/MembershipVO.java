package vo;

public class MembershipVO {//맴버쉽
	private int mem_no;//회원번호
	private String memship_s_date;//시작일
	private String memship_e_date;//종료일
	private int memship_price;//맴버쉽비용
	
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getMemship_s_date() {
		return memship_s_date;
	}
	public void setMemship_s_date(String memship_s_date) {
		this.memship_s_date = memship_s_date;
	}
	public String getMemship_e_date() {
		return memship_e_date;
	}
	public void setMemship_e_date(String memship_e_date) {
		this.memship_e_date = memship_e_date;
	}
	public int getMemship_price() {
		return memship_price;
	}
	public void setMemship_price(int memship_price) {
		this.memship_price = memship_price;
	}
	
	
}
