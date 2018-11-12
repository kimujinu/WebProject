package kr.ac.dit.service;
import java.util.List;

import kr.ac.dit.domain.BoardVO;
import kr.ac.dit.domain.LogonDTO;
import kr.ac.dit.domain.MemberVO;
public interface MemberService { //추상 메서드
	  public void createMember(MemberVO memberVO) throws Exception;
	  public MemberVO readMember(LogonDTO logonDTO) throws Exception;
}
