package vo;

public class ClassVO {//교육과정
	private int class_list;//단원
	private int lec_title;//강의코드
	private String class_nm;//단원명
	private String video;//동영상경로
	
	public int getClass_list() {
		return class_list;
	}
	public void setClass_list(int class_list) {
		this.class_list = class_list;
	}
	public int getLec_title() {
		return lec_title;
	}
	public void setLec_title(int lec_title) {
		this.lec_title = lec_title;
	}
	public String getClass_nm() {
		return class_nm;
	}
	public void setClass_nm(String class_nm) {
		this.class_nm = class_nm;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	
}
