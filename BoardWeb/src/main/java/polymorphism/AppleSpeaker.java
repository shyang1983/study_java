package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		// TODO Auto-generated constructor stub
		System.out.println("===> AppleSpeaker 按眉积己");
	}

	@Override
	public void volumUp() {
		// TODO Auto-generated method stub		
		System.out.println("AppleSpeaker-- 家府 棵赴促 ");
	}

	@Override
	public void volumDown() {
		// TODO Auto-generated method stub
		System.out.println("AppleSpeaker-- 家府 郴赴促 ");
	}

}
