package kr.ac.dit.persistence;
import java.util.List;

import kr.ac.dit.domain.BoardVO;
public interface BoardDAO { //DAO안에는 오직 SQL문을 실행하는 메소드만 있다. 
	public List<BoardVO> selectList() throws Exception;
	  public void insert(BoardVO boardVO) throws Exception;
	  public BoardVO select(int no) throws Exception;
	  public void update(BoardVO boardVO) throws Exception;
	 public void delete(int no) throws Exception;
}
