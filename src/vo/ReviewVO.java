package vo;

public class ReviewVO {//강의리뷰
	private int review_no;//수강평번호
	private int myclass_no;//수강번호
	private String review_cont;//수강평내용
	private int grade;//평점
	private String review_date;//수강평등록일
	
	public int getReview_no() {
		return review_no;
	}
	public void setReview_no(int review_no) {
		this.review_no = review_no;
	}
	public int getMyclass_no() {
		return myclass_no;
	}
	public void setMyclass_no(int myclass_no) {
		this.myclass_no = myclass_no;
	}
	public String getReview_cont() {
		return review_cont;
	}
	public void setReview_cont(String review_cont) {
		this.review_cont = review_cont;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getReview_date() {
		return review_date;
	}
	public void setReview_date(String review_date) {
		this.review_date = review_date;
	}
	
	
}
