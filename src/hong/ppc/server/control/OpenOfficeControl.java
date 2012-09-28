package hong.ppc.server.control;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class OpenOfficeControl extends AbstractControl{
	public OpenOfficeControl(Robot robot){
		this.robot = robot;
		this.KEY_START = KeyEvent.VK_F5;
		this.KEY_STOP = KeyEvent.VK_ESCAPE;
		this.KEY_PREVIOUS = KeyEvent.VK_LEFT;
		this.KEY_NEXT = KeyEvent.VK_RIGHT;
	}
}
