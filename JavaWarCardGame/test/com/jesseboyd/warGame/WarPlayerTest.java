package com.jesseboyd.warGame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WarPlayerTest {

	WarPlayer wp;

	@Before
	public void setUP() {
		wp = new WarPlayer("Jesse Boyd");
	}

	@Test
	public void testPlayerName() {
		assertEquals("Jesse Boyd", wp.getName());
	}
	
	@Test
	public void testSetPlayerScore() throws Exception {
		wp.setScrore(10);
		assertEquals(10, wp.getScrore());
	}

}
