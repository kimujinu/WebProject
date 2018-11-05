package kr.ac.dit.service;
import java.util.List;

import kr.ac.dit.domain.BoardVO;
public interface BoardService { //추상 메서드
	 public List<BoardVO> listArticle() throws Exception;

	  public void createArticle(BoardVO boardVO) throws Exception;

	  public BoardVO readArticle(int no) throws Exception;

	  public void updateArticle(BoardVO boardVO) throws Exception;

	  public void deleteArticle(int no) throws Exception;
}
