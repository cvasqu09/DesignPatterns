package packages.abstractfactory;

public class WindowsAIAssistant extends AIAssistant{

	public WindowsAIAssistant(String n) {
		super(n);
		addLanguage("English");
		addLanguage("German");
		addLanguage("Spanish");
		addLanguage("French");
	}

	@Override
	public String welcomeMessage() {
		return "Windows AI Cortana";
	}
	

	
}
