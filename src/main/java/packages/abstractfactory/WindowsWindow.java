package packages.abstractfactory;

public class WindowsWindow extends Window {

	public WindowsWindow(float w, float h) {
		super(w, h);
		name = "Windows Window";
		renderBatch.add("Windows Wallpaper");
		renderBatch.add("Taskbar");
		renderBatch.add("Desktop Icons");
	}

	@Override
	void render() {
		for(int i = 0; i < renderBatch.size(); i++){
			System.out.println(renderBatch.get(i));
		}
	}
}
