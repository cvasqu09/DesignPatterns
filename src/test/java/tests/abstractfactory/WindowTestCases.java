package tests.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import packages.abstractfactory.*;

public class WindowTestCases {

	@Test
	public void WindowsWindow_renderBatch_firstItem() {
		Window windows = new WindowsWindow(500, 200);
		assertEquals(windows.getBatch().get(0), "Windows Wallpaper");
	}
	
	@Test
	public void WindowsWindow_renderBatch_secondItem() {
		Window windows = new WindowsWindow(500, 200);
		assertEquals(windows.getBatch().get(1), "Taskbar");
	}
	
	@Test
	public void WindowsWindow_renderBatch_thirdItem() {
		Window windows = new WindowsWindow(500, 200);
		assertEquals(windows.getBatch().get(2), "Desktop Icons");
	}
	
	@Test
	public void MacWindow_renderBatch_firstItem() {
		Window mac = new MacWindow(500, 200);
		assertEquals(mac.getBatch().get(0), "Mac wallpaper");
	}
	
	@Test
	public void MacWindow_renderBatch_secondItem() {
		Window mac = new MacWindow(500, 200);
		assertEquals(mac.getBatch().get(0), "Desktop Icons");
	}
	
	@Test
	public void MacWindow_renderBatch_thirdItem() {
		Window mac = new MacWindow(500, 200);
		assertEquals(mac.getBatch().get(0), "Mac wallpaper");
	}
	
	

}
