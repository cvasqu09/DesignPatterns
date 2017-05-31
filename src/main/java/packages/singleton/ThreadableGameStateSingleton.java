package packages.singleton;

public class ThreadableGameStateSingleton {
	private static ThreadableGameStateSingleton gameState = null;
	private static int count = 0;
	
	long startTime;
	long timeRunning;
	static boolean isPlaying;
	
	private ThreadableGameStateSingleton (){
		startTime = System.currentTimeMillis();
		isPlaying = false;
		count++;
	}
	
	// Use the synchronized keyword to make sure threads do not access at once.
	public static synchronized ThreadableGameStateSingleton getInstance(){
		if(gameState == null){
			gameState = new ThreadableGameStateSingleton();
		}
		return gameState;
	}
	
	public long runningTime(){
		return System.currentTimeMillis() - startTime;
	}
	
	public static int getCount(){
		return count;
	}
	
	public void startPlaying(){
		isPlaying = true;
	}
	
	public void stopPlaying(){
		isPlaying = false;
	}
	
	public boolean isPlaying(){
		return isPlaying;
	}
	
	public static void reset(){
		gameState = null;
		count = 0;
		isPlaying = false;
	}
}
