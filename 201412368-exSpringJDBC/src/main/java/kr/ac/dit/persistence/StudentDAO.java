package kr.ac.dit.persistence;
import java.util.List;

import kr.ac.dit.domain.StudentVO;
public interface StudentDAO { //DAO안에는 오직 SQL문을 실행하는 메소드만 있다. 
	public void insertStudent(StudentVO studentVO) throws Exception;
	public List<StudentVO> selectStudentList() throws Exception;
}
