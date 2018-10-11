package kr.ac.dit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.dit.domain.StudentVO;
import kr.ac.dit.persistence.StudentDAO;
@Service //이 클래스들은 서비스클래스들이다.(비지니스 로직이 포함된 클래스)

	public class StudentServiceImpl implements StudentService { //실 내용 
	@Autowired //인젝션 받고있음 studentDAO를 root-context.xml에서 
	private StudentDAO studentDAO;
	public void createStudent(StudentVO studentVO) throws Exception {
		studentDAO.insertStudent(studentVO);
		
	}
	public List<StudentVO> readStudentList() throws Exception {
		return studentDAO.selectStudentList();
	}
}
