package kr.ac.dit.persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.dit.domain.StudentVO;
@Repository //DAO클래스라는 의미.SQL문 실행하는
public class StudentDAOImpl implements StudentDAO {
	 @Autowired
	 JdbcTemplate jdbcTemplate;
	@Override //중복되는것을 허용하겠다는 의미
	public void insertStudent(StudentVO studentVO) throws Exception {
		  jdbcTemplate.update("insert into student values(?,?)", studentVO.getNo(), studentVO.getName()); 
		  //SQL문이 코드상에 있으면 유지보수에 어려움이 있음.
	 }
		

//	@Override
//	public List<StudentVO> selectStudentList() throws Exception {
//		// TODO Auto-generated method stub
//		 List<StudentVO> items = new ArrayList<StudentVO>();
//
//		   Class.forName("oracle.jdbc.driver.OracleDriver");
//		   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201412368","201412368"); // DB 접속
//
//		   PreparedStatement pstmt = conn.prepareStatement("select * from student");
//		   ResultSet rs = pstmt.executeQuery();// SQL문 실행
//
//		   while(rs.next()) {
//			   StudentVO item = new StudentVO();
//			   item.setNo(rs.getString("no"));
//			   item.setName(rs.getString("name"));
//			  // 가져온 레코드 값 리스트에 세트
//			   items.add(item);
//		   } 
//		   pstmt.close();
//		   rs.close();
//		   conn.close();
//		   return items;
//	}
	@SuppressWarnings("rawtypes")
	 @Override
	  public List<StudentVO> selectStudentList() throws Exception {
	  List<StudentVO> items = new ArrayList<StudentVO>();
	    List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from student");
	    								//queryForList select문을 읽어오는데 어러개의 결과를 읽어오는것
	    for (Map row : rows) { 
	      StudentVO item = new StudentVO(); 
	      item.setNo((String) row.get("no")); 
	      item.setName((String) row.get("name")); 
	      items.add(item); 
	    } 
	    return items;
	 }
	}
	
	

