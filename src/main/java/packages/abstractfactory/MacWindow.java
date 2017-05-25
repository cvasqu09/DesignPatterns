package packages.abstractfactory;

public class MacWindow extends Window{
	private boolean isHoveringOnTaskBar = false;
	public MacWindow(float w, float h) {
		super(w, h);
		name = "Mac Window";
		renderBatch.add("Mac wallpaper");
		renderBatch.add("Desktop Icons");
		renderBatch.add("Mac wallpaper");
	}

	@Override
	void render() {
		if(isHoveringOnTaskBar){
			System.out.println("Rendering taskbar");
		}
		
		for(int i = 0; i < renderBatch.size(); i++){
			System.out.println(renderBatch.get(i));
		}
	}
	
	public void setHoveringOnTaskBar(boolean b){
		isHoveringOnTaskBar = b;
	}

}
