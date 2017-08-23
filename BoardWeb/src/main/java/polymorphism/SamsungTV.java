package polymorphism;

public class SamsungTV implements TV {
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("===> SamsungTv 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTv 객체 생성(2)");
		this.speaker = speaker;
	}
	
	public Speaker getSpeaker() {
		return speaker;
	}

	public int getPrice() {
		return price;
	}

	public void setSpeaker(Speaker speaker){
		System.out.println("===> setSpeaker() 호출 ");
		this.speaker = speaker;
	}
	
	public void setPrice(int price){
		System.out.println("===> setPrice() 호출 ");
		this.price = price;
	}
	
	
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다. (가격:" + price + ")");
	}

	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다");
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