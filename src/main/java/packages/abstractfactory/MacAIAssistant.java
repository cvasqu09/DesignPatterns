package packages.abstractfactory;

public class MacAIAssistant extends AIAssistant{

	public MacAIAssistant(String n) {
		super(n);
		addLanguage("English");
		addLanguage("Spansih");
		addLanguage("German");
		
	}

	@Override
	public String welcomeMessage() {
		return "Welcome -Siri";
	}

}
