package com.jesseboyd.warGame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class WarAppTest {
	
	WarApp war, war2;
	WarPlayer wp, wp2;
	List<WarPlayer> wpList;
	
	@Before
	public void setUp(){
		war = new WarApp();
		wp = new WarPlayer("Jesse Boyd");
		wp2 = new WarPlayer("Joe Watts");
		wpList = new ArrayList<>();
		wpList.add(wp);
		wpList.add(wp2);	
	}

	@Test
	public void VisualTest() {
		war.play(4, 16, 2, wpList);
	}

	@Test
	public void testCreatePlayer() throws Exception {
		war2 = new WarApp();
		war2.createPlayerAndAddToList("Cowboy");
		war2.createPlayerAndAddToList("Alien");		
		assertEquals("Alien", war2.getPlayerList().get(1).getName());
	}
	
}
