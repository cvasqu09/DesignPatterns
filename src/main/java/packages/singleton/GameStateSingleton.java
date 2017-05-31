package packages.singleton;

public class GameStateSingleton {
	private static GameStateSingleton gameState = null;
	long startTime;
	long timeRunning;
	boolean isPlaying;
	private GameStateSingleton (){
		startTime = System.currentTimeMillis();
		isPlaying = false;
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
	
	public void startPlaying(){
		isPlaying = true;
	}
	
	public boolean isPlaying(){
		return isPlaying;
	}
}
