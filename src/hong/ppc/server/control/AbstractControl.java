package hong.ppc.server.control;

import java.awt.Robot;

public abstract class AbstractControl {
	protected int KEY_START;
	protected int KEY_STOP;
	protected int KEY_PREVIOUS;
	protected int KEY_NEXT;

	public static final int COM_START = 1;
	public static final int COM_STOP = 2;
	public static final int COM_PREVIOUS = 3;
	public static final int COM_NEXT = 4;
	
	protected Robot robot;

	public void start() {
		System.out.println(" KEY_START ");
		KeyPress.pressKey(robot, KEY_START);
	}

	public void stop() {
		System.out.println(" KEY_STOP ");
		KeyPress.pressKey(robot, KEY_STOP);
	}

	public void previous() {
		System.out.println(" KEY_PREVIOUS ");
		KeyPress.pressKey(robot, KEY_PREVIOUS);
	}

	public void next() {
		System.out.println(" KEY_NEXT ");
		KeyPress.pressKey(robot, KEY_NEXT);
	}
}
