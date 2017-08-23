
package polymorphism;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired
	//@Qualifier("apple")
	//@Resource(name="apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV  °´Ã¼ »ý¼º");
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTV --- Àü¿ø ÄÒ´Ù");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTV --- Àü¿ø ²ö´Ù");
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