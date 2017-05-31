package packages.singleton;

public class TestThread implements Runnable{
	private String name;
	private ThreadableGameStateSingleton gs;
	
	public TestThread(String name){
		this.name = name;
		gs = ThreadableGameStateSingleton.getInstance();
	}
	
	
	public void run() {
		System.out.println("Thread name: " + name);
		System.out.println("Reference: " + gs.toString());
		System.out.println("Count: " + ThreadableGameStateSingleton.getCount());
	}
}
