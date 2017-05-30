package packages.abstractfactory;

public class MacOSFactory implements OSFactory{

	public Window createWindow() {
		return new MacWindow(1000, 1000);
	}

	public Cursor createCursor() {
		return new MacCursor(15, 15);
	}

	public AIAssistant createAssistant() {
		return new MacAIAssistant();
	}

}
