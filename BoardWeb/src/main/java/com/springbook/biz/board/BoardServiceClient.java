package com.springbook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sun.xml.internal.ws.api.server.Container;


public class BoardServiceClient {

	public static void main(String[] args) {
		// 1.Spring 컨테이너를 구동한다
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2.Spring 컨테이너로부터 필요한 객체를 요청한다.
		BoardService boardService = (BoardService)container.getBean("boardService");
		
		
		// 3. Spring 컨테이너를 종료한다.
		BoardVO vo = new BoardVO();
		vo.setTitle("임시 제목");
		vo.setWirter("양세희");
		vo.setContent("내용..");
		boardService.insertBoard(vo);
		
		List<BoardVO> boardList = boardService.getBoardList(vo);
		for(BoardVO board:boardList) {
			System.out.println("---> " + board.toString());
		}
		
		container.close();
	}

}
