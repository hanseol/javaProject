package nestedClasses;

import nestedClasses.Button.OnClickListener;

public class MessageListener implements OnClickListener {

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
