package tests.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import packages.singleton.GameStateSingleton;
import packages.singleton.TestThread;
import packages.singleton.ThreadableGameStateSingleton;

public class ThreadableGameStateSingletonTest {
	
	/* Need this in order to ensure each test starts
	 * with an uninitialized singleton */
	@Before
	public void resetSingleton() {
		GameStateSingleton.reset();
	}
	
	@Test
	public void getCount_1(){
		Thread t1 = new Thread(new TestThread("Thread one"));
		Thread t2 = new Thread(new TestThread("Thread two"));
		t1.start();
		t2.start();
		assertEquals(1, ThreadableGameStateSingleton.getCount());
	}
	
	@Test
	public void isPlaying_true(){
		ThreadableGameStateSingleton gs = ThreadableGameStateSingleton.getInstance();
		gs.startPlaying();
		Thread t1 = new Thread(new TestThread("Thread one"));
		Thread t2 = new Thread(new TestThread("Thread two"));
		t1.start();
		t2.start();
		assertEquals(true, gs.isPlaying());
	}
	
	@Test
	public void isPlaying_false(){
		ThreadableGameStateSingleton gs = ThreadableGameStateSingleton.getInstance();
		gs.startPlaying();
		Thread t1 = new Thread(new TestThread("Thread one"));
		Thread t2 = new Thread(new TestThread("Thread two"));
		gs.stopPlaying();
		t1.start();
		t2.start();
		assertEquals(false, gs.isPlaying());
	}

}
