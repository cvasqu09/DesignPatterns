package packages.abstractfactory;

import java.util.ArrayList;

public abstract class Window {
	private float width;
	private float height;
	protected String name;
	
	protected ArrayList<String> renderBatch = new ArrayList<String>();
	
	public Window(float w, float h){
		width = w;
		height = h;
	}
	
	public float getWidth(){
		return width;
	}
	
	public float getHeight(){
		return height;
	}
	
	public String getName(){
		return name;
	}
	
	abstract void render();
	
	public ArrayList<String> getBatch(){
		return renderBatch;
	}
}
