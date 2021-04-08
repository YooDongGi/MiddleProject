package dao;

import java.sql.SQLException;
import java.util.List;

import com.ibatis.sqlmap.client.SqlMapClient;

import ibatis.config.SqlMapClientFactory;
import vo.ClassVO;
import vo.LectureVO;


public class LectureDaoImpl implements ILectureDao{
	private SqlMapClient smc;
	private static ILectureDao dao;
	
	private LectureDaoImpl() {
		smc = SqlMapClientFactory.getSqlMapClient();
	}
	public static ILectureDao getDao() {
		if(dao == null) dao = new LectureDaoImpl();
		
		return dao;
		
	}

	
	@Override
	public List<LectureVO> listAll() throws SQLException{
		
	return smc.queryForList("lecture.listAll");
	}
	@Override
	public int update(LectureVO vo) throws SQLException {
		return smc.update("lecture.update",vo);
	}
	
	@Override
	public List<LectureVO> listCategory(String str) throws SQLException {
		return smc.queryForList("lecture.listCategory",str);
	}
	@Override
	public List<LectureVO> lectureDif(LectureVO vo) throws SQLException {
		
		return smc.queryForList("lecture.lectureDif",vo);
	}
	@Override
	public List<LectureVO> lecture(int ti) throws SQLException {
		return smc.queryForList("lecture.lecture",ti);
	}
	@Override
	public List<ClassVO> classList(int cl) throws SQLException {
		return smc.queryForList("lecture.classList",cl);
	}
	@Override
	public int lectureInsert(LectureVO vo) throws SQLException {
		return (Integer) smc.insert("lecture.lectureInsert",vo);
	}
	
	@Override
	public int classInsert(ClassVO cvo) throws SQLException {
		return (Integer) smc.insert("lecture.classInsert",cvo);
	}
	
	@Override
	public int classUpdate(ClassVO cvo) throws SQLException {
		return (Integer) smc.update("lecture.classUpdate",cvo);
	}
	@Override
	public List<LectureVO> getsearchcategory(String str) throws SQLException {
		
		return smc.queryForList("lecture.getsearchcategory",str);
	}
	
	

}
