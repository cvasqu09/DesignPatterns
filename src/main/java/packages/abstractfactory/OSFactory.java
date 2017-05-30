package packages.abstractfactory;

public interface OSFactory {
	Window createWindow();
	Cursor createCursor();
	AIAssistant createAssistant();
}
