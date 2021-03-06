package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTv ��ü ����");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTv ��ü ����(2)");
		this.speaker = speaker;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setSpeaker(Speaker speaker){
		System.out.println("===> setSpeaker() ȣ�� ");
		this.speaker = speaker;
	}
	
	public void setPrice(int price){
		System.out.println("===> setPrice() ȣ�� ");
		this.price = price;
	}
	
	
	public void powerOn() {
		System.out.println("SamsungTV --- ���� �Ҵ�. (����:" + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV --- ���� ����");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub		
		speaker.volumUp();		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumDown();
	}
}