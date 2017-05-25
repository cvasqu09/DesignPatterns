package packages.abstractfactory;

import java.util.ArrayList;

public class AIAssistant {
	private String name;
	private ArrayList<String> languages = new ArrayList<String>();
	
	public AIAssistant(String n){
		name = n;
	}
	
	public void printLanguages(){
		for(int i = 0; i < languages.size(); i++){
			System.out.println(languages.get(i));
		}
	}
	
	public void printName(){
		System.out.println(name);
	}
}
