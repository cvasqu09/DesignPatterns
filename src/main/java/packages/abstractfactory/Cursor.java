package packages.abstractfactory;

public class Cursor {
	private String cursorName;
	private float sizeX;
	private float sizeY;
	
	public Cursor(float x, float y){
		sizeX = x;
		sizeY = y;
	}

	public String getCursorName() {
		return cursorName;
	}

	protected void setCursorName(String cursorName) {
		this.cursorName = cursorName;
	}

	public float getSizeX() {
		return sizeX;
	}

	public void setSizeX(float sizeX) {
		this.sizeX = sizeX;
	}

	public float getSizeY() {
		return sizeY;
	}

	public void setSizeY(float sizeY) {
		this.sizeY = sizeY;
	}
	
	
	
}
