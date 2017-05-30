package packages.abstractfactory;

public abstract class OperatingSystem {
	private String name;
	private Cursor cursor;
	private AIAssistant assistant;
	private Window window;
	
	abstract void printOSInfo();

	public Cursor getCursor() {
		return cursor;
	}

	public AIAssistant getAssistant() {
		return assistant;
	}

	public Window getWindow() {
		return window;
	}

}
