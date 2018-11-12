package kr.ac.dit.persistence;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
public interface MemberDAO { //DAO안에는 오직 SQL문을 실행하는 메소드만 있다. 
	  public void insert(MemberVO memberVO) throws Exception;
	  public MemberVO select(LogonDTO logonDTO) throws Exception;
}
