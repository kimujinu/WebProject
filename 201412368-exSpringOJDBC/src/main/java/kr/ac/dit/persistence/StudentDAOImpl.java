package kr.ac.dit.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.StudentVO;
@Repository //DAO클래스라는 의미.SQL문 실행하는
public class StudentDAOImpl implements StudentDAO {
	@Override //중복되는것을 허용하겠다는 의미
	public void insertStudent(StudentVO studentVO) throws Exception {
		String no = studentVO.getNo();
		String name = studentVO.getName();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "201412368", "201412368");
		PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?)");
		pstmt.setString(1, no);
		pstmt.setString(2, name);
		pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		}

	@Override
	public List<StudentVO> selectStudentList() throws Exception {
		// TODO Auto-generated method stub
		 List<StudentVO> items = new ArrayList<StudentVO>();

		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201412368","201412368"); // DB 접속

		   PreparedStatement pstmt = conn.prepareStatement("select * from student");
		   ResultSet rs = pstmt.executeQuery();// SQL문 실행

		   while(rs.next()) {
			   StudentVO item = new StudentVO();
			   item.setNo(rs.getString("no"));
			   item.setName(rs.getString("name"));
			  // 가져온 레코드 값 리스트에 세트
			   items.add(item);
		   } 
		   pstmt.close();
		   rs.close();
		   conn.close();
		   return items;
	}
	
	}

