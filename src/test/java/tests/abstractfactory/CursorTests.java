package tests.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import packages.abstractfactory.*;

public class CursorTests {

	@Test
	public void MacCursor_getCursorName() {
		Cursor mac = new MacCursor(100, 100);
		assertEquals(mac.getCursorName(), "Mac Cursor");
	}
	
	@Test
	public void WindowsCurssor_getCursorName() {
		Cursor windows = new WindowsCursor(50, 50);
		assertEquals(windows.getCursorName(), "Windows Cursor");
	}

}
