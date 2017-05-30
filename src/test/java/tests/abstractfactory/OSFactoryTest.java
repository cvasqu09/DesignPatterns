package tests.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import packages.abstractfactory.*;

public class OSFactoryTest {

	@Test
	public void WindowsOSFactory_createWindow_getName() {
		OSFactory winFactory = new WindowsOSFactory();
		Window winWindow = winFactory.createWindow();
		assertEquals(winWindow.getName(), "Windows Window");
	}
	
	@Test
	public void MacOSFactory_createWindow_getName() {
		OSFactory macFactory = new MacOSFactory();
		Window macWindow = macFactory.createWindow();
		assertEquals(macWindow.getName(), "Mac Window");
	}
	
	@Test
	public void WindowsOSFactory_createCursor_getCursorName(){
		OSFactory winFactory = new WindowsOSFactory();
		Cursor winCursor = winFactory.createCursor();
		assertEquals(winCursor.getCursorName(), "Windows Cursor");
	}
	
	@Test
	public void MacOSFactory_createCursor_getName(){
		OSFactory macFactory = new MacOSFactory();
		Cursor macCursor = macFactory.createCursor();
		assertEquals(macCursor.getCursorName(), "Mac Cursor");
	}
	
	@Test
	public void WindowsOSFactory_createAssistant_welcomeMessage(){
		OSFactory winFactory = new WindowsOSFactory();
		AIAssistant winAssistant = winFactory.createAssistant();
		assertEquals(winAssistant.welcomeMessage(), "Windows AI " + winAssistant.getName());
	}
	
	@Test
	public void MacOSFactory_createAssistant_welcomeMessage(){
		OSFactory macFactory = new MacOSFactory();
		AIAssistant macAssistant = macFactory.createAssistant();
		assertEquals(macAssistant.welcomeMessage(), "Welcome -" + macAssistant.getName());
	}

}
