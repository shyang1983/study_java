package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sun.xml.internal.ws.api.server.Container;


public class BoardServiceClient {

	public static void main(String[] args) {
		// 1.Spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2.Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		
		// 3. Spring �����̳ʸ� �����Ѵ�.
		BoardVO vo = new BoardVO();
		vo.setTitle("�ӽ� ����");
		vo.setWirter("�缼��");
		vo.setContent("����..");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board:boardList) {
			System.out.println("---> " + board.toString());
		}
		
		container.close();
	}

}
