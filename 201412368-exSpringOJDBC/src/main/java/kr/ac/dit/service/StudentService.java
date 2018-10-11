package kr.ac.dit.service;
import java.util.List;

import kr.ac.dit.domain.StudentVO;
public interface StudentService { //추상 메서드
	public void createStudent(StudentVO studentVO) throws Exception;
	public List<StudentVO> readStudentList() throws Exception;
}
