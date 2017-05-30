package packages.abstractfactory;

public class WindowsAIAssistant extends AIAssistant{

	public WindowsAIAssistant() {
		super("Cortana");
		addLanguage("English");
		addLanguage("German");
		addLanguage("Spanish");
		addLanguage("French");
	}

	@Override
	public String welcomeMessage() {
		return "Windows AI " + name ;
	}
	

	
}
