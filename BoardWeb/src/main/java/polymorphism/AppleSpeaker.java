package polymorphism;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===> AppleSpeaker ��ü����");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub		
		System.out.println("AppleSpeaker-- �Ҹ� �ø��� ");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker-- �Ҹ� ������ ");
	}

}
