package hong.ppc.server.control;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class KeyPress {

	public static void pressKey(Robot robot, int keyvalue) {
		robot.keyPress(keyvalue);
		robot.keyRelease(keyvalue);
	}

	public static void pressKeyWithShift(Robot robot, int keyvalue) {
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(keyvalue);
		robot.keyRelease(keyvalue);
		robot.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void closeApplication(Robot robot) {
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		// for linux
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
	}

}