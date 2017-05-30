package packages.abstractfactory;

public class WindowsOSFactory implements OSFactory{
    public WindowsOSFactory(){
    	
    }
	
	public Window createWindow() {
		return new WindowsWindow(500, 500);
	}

	public Cursor createCursor() { 
		return new WindowsCursor(10, 10);
	}

	public AIAssistant createAssistant() {
		return new WindowsAIAssistant();
	}
}
