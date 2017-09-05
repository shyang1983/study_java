package com.springbook.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sun.xml.internal.ws.api.server.Container;


public class UserServiceClient {

	public static void main(String[] args) {
		// 1.Spring 컨테이너를 구동한다
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2.Spring 컨테이너로부터 필요한 객체를 요청한다.
		UserService userService = (UserService)container.getBean("userService");
		
		
		// 3. Spring 컨테이너를 종료한다.
		UserVO vo = new UserVO();
		vo.setId("user1");
		vo.setPassword("user1");
		
		UserVO user = userService.getUser(vo);
				
		if(!user.equals(null))
		{
			System.out.println(user.getName() + "님 환영합니다.");
		}else {
			System.out.println("로그인 실패");
		}
		
		container.close();
	}

}
