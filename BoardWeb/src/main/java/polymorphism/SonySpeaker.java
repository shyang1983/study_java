package polymorphism;

public class SonySpeaker implements Speaker {
	public SonySpeaker() {
		System.out.println("===> SonySpeaker ��ü ����");
	}

	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumUp()
	 */
	@Override
	public void volumUp() {
		System.out.println("SonySpeaker  �Ҹ��� �ø���");
	}
	
	/* (non-Javadoc)
	 * @see polymorphism.Speaker#volumDown()
	 */
	@Override
	public void volumDown() {
		System.out.println("SonySpeaker  �Ҹ��� ������");
	}
}
