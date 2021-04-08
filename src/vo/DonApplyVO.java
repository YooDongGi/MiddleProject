package vo;

public class DonApplyVO {
	private int mem_no;			  //회원번호
	private String don_conact;    //신청내용
	private String mem_field;	  //희망분야	
	private String mem_callmail;  //회원이메일
	private String mem_nm;		  //회원이름
	
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getDon_conact() {
		return don_conact;
	}
	public void setDon_conact(String don_conact) {
		this.don_conact = don_conact;
	}
	public String getMem_field() {
		return mem_field;
	}
	public void setMem_field(String mem_field) {
		this.mem_field = mem_field;
	}
	public String getMem_callmail() {
		return mem_callmail;
	}
	public void setMem_callmail(String mem_callmail) {
		this.mem_callmail = mem_callmail;
	}
	public String getMem_nm() {
		return mem_nm;
	}
	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}
  
}
