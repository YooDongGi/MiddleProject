package dao;

import java.sql.SQLException;
import java.util.List;

import vo.ClassVO;
import vo.LectureVO;


public interface ILectureDao {
	public List<LectureVO> listAll() throws SQLException;
	
	public int update(LectureVO vo) throws SQLException;
	
	public List<LectureVO> listCategory(String str) throws SQLException;
	
	public List<LectureVO> lectureDif(LectureVO vo) throws SQLException;
	
	public List<LectureVO> lecture(int ti) throws SQLException;;
	
	public List<ClassVO> classList(int cl) throws SQLException;
	
	public int lectureInsert(LectureVO vo) throws SQLException;
	
	public int classInsert(ClassVO cvo) throws SQLException;
	
	public int classUpdate(ClassVO cvo) throws SQLException;
	
	public List<LectureVO> getsearchcategory(String str) throws SQLException;
}
