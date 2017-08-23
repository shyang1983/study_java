package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}

	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumUp()
	 */
	@Override
	public void volumUp() {
		System.out.println("SonySpeaker  소리를 올린다");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumDown()
	 */
	@Override
	public void volumDown() {
		System.out.println("SonySpeaker  소리를 내린다");
	}
}
