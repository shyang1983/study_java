package com.springbook.biz.board;

import java.util.List;

import com.springbook.biz.board.BoardVO;

public interface BoardService {

	//CRUD ����� �޼ҵ� ����
	//�۵��
	void insertBoard(BoardVO vo);

	//�ۼ���	
	void updateBoard(BoardVO vo);

	//�ۻ���	
	void deleteBoard(BoardVO vo);

	//�ۻ���ȸ	
	BoardVO getBoard(BoardVO vo);

	//�۸�� ��ȸ
	List<BoardVO> getBoardList(BoardVO vo);

}