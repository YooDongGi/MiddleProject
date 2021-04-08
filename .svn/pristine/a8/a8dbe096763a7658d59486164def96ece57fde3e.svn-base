package service;

import java.sql.SQLException;
import java.util.List;

import dao.ILectureDao;
import dao.LectureDaoImpl;
import vo.ClassVO;
import vo.LectureVO;

public class LectureServiceImpl implements ILectureService{
	private ILectureDao dao;
	private static ILectureService service;
	
	private LectureServiceImpl() {
			dao = LectureDaoImpl.getDao();
	}
	
	public static ILectureService getService() {
		if(service == null) service = new LectureServiceImpl();
		return service;
	}
	
	@Override
	public List<LectureVO> listAll(){
		
		List<LectureVO> list = null;
		
		try {
			list = dao.listAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
		
	}

	@Override
	public int update(LectureVO vo) {
		int res = 0;
		
		try {
			res = dao.update(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	@Override
	public List<LectureVO> listCategory(String str) {
		List<LectureVO> categorylist = null;
		
		try {
			categorylist = dao.listCategory(str);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return categorylist;
	}

	@Override
	public List<LectureVO> lectureDif(LectureVO vo) {
		List<LectureVO> lecturedifList = null;
		
		try {
			lecturedifList = dao.lectureDif(vo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lecturedifList;
	}

	@Override
	public List<LectureVO> lecture(int ti) {
		List<LectureVO> lecture = null;
		
		try {
			lecture = dao.lecture(ti);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lecture;
	}

	@Override
	public List<ClassVO> classList(int cl) {
		List<ClassVO> classList = null;
		
		try {
			classList = dao.classList(cl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return classList;
	}

	@Override
	public int lectureInsert(LectureVO vo) {
			int cnt = 0;
		try {
			cnt = dao.lectureInsert(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int classInsert(ClassVO cvo) {
		int cnt = 0;
		try {
			cnt = dao.classInsert(cvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int classUpdate(ClassVO cvo) {
		int cnt = 0;
		try {
			cnt = dao.classUpdate(cvo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public List<LectureVO> getsearchcategory(String str) {
		List<LectureVO>  list = null;
		
		try {
			list = dao.getsearchcategory(str);
		} catch (Exception e) {
			list = null;
			e.printStackTrace();
		}
		return list;
	}
}