package service;

import java.sql.SQLException;
import java.util.List;

import vo.ClassVO;
import vo.LectureVO;
import vo.MyclassVO;


public interface ILectureService {
	public List<LectureVO> listAll(); 
	
	public int update(LectureVO vo);
	
	public List<LectureVO> listCategory(String str);
	
	public List<LectureVO> lectureDif(LectureVO vo);
	
	public List<LectureVO> lecture(int ti);
	
	public List<ClassVO> classList(int cl);
	
	public int lectureInsert(LectureVO vo);
	
	public int classInsert(ClassVO cvo);
	
	public int classUpdate(ClassVO cvo);
	
	public List<LectureVO> getsearchcategory(String str);
	
	public int check(MyclassVO vo) throws SQLException;
}
