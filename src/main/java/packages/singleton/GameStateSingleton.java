package packages.singleton;

public class GameStateSingleton {
	private static GameStateSingleton gameState = null;
	private static int count = 0;
	
	long startTime;
	long timeRunning;
	static boolean isPlaying;
	
	private GameStateSingleton (){
		startTime = System.currentTimeMillis();
		isPlaying = false;
		count++;
	}
	
	public static GameStateSingleton getInstance(){
		if(gameState == null){
			gameState = new GameStateSingleton();
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
	
	public boolean isPlaying(){
		return isPlaying;
	}
	
	public static void reset(){
		gameState = null;
		count = 0;
		isPlaying = false;
	}
}
