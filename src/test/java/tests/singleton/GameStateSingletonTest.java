package tests.singleton;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import packages.singleton.GameStateSingleton;

public class GameStateSingletonTest {

	/* Need this in order to ensure each test starts
	 * with an uninitialized singleton */
	@Before
	public void resetSingleton() {
		GameStateSingleton.reset();
	}
	
	@Test
	public void getCount_0() {
		assertEquals(0, GameStateSingleton.getCount());
	}
	
	@Test
	public void getCount_1(){
		GameStateSingleton gs_1 = GameStateSingleton.getInstance();
		GameStateSingleton gs_2 = GameStateSingleton.getInstance();
		GameStateSingleton gs_3 = GameStateSingleton.getInstance();
		assertEquals(1, GameStateSingleton.getCount());
	}
	
	@Test
	public void isPlaying_false(){
		GameStateSingleton gs = GameStateSingleton.getInstance();
		assertEquals(false, gs.isPlaying());
	}
	
	@Test
	public void isPlaying_true(){
		GameStateSingleton gs = GameStateSingleton.getInstance();
		gs.startPlaying();
		GameStateSingleton gs2 = GameStateSingleton.getInstance();
		assertEquals(true, gs2.isPlaying());
	}

}
