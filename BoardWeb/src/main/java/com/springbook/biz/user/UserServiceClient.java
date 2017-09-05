package com.springbook.biz.user;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sun.xml.internal.ws.api.server.Container;


public class UserServiceClient {

	public static void main(String[] args) {
		// 1.Spring �����̳ʸ� �����Ѵ�
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2.Spring �����̳ʷκ��� �ʿ��� ��ü�� ��û�Ѵ�.
		UserService userService = (UserService)container.getBean("userService");
		
		
		// 3. Spring �����̳ʸ� �����Ѵ�.
		UserVO vo = new UserVO();
		vo.setId("user1");
		vo.setPassword("user1");
		
		UserVO user = userService.getUser(vo);
				
		if(!user.equals(null))
		{
			System.out.println(user.getName() + "�� ȯ���մϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
		
		container.close();
	}

}
