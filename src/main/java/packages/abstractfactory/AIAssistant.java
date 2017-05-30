package packages.abstractfactory;

import java.util.ArrayList;

public abstract class AIAssistant {
	protected String name;
	private ArrayList<String> languages = new ArrayList<String>();
	
	public AIAssistant(String n){
		name = n;
	}
	
	public void printLanguages(){
		for(int i = 0; i < languages.size(); i++){
			System.out.println(languages.get(i));
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void printName(){
		System.out.println(name);
	}
	
	public void addLanguage(String language){
		languages.add(language);
	}
	
	public abstract String welcomeMessage();
}
