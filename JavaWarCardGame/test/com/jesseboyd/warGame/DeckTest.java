package com.jesseboyd.warGame;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	Deck deck = new Deck();
	WarPlayer wp, wp2;
	List<WarPlayer> wpList;

	@Before
	public void setUp() {
		wp = new WarPlayer("Jesse Boyd");
		wp2 = new WarPlayer("Joe Watts");
		wpList = new ArrayList<>();
		wpList.add(wp);
		wpList.add(wp2);
		deck.create(4, 16, 2, wpList);
	}

	@Test
	public void testCanCreateDeck() {
		assertNotNull(deck);
	}

	@Test
	public void testDeckSize() {
		assertEquals(64, deck.getDeckOfCards().size());
	}

	
	@Test
	public void testShuffle() throws Exception {
		int originalCard = deck.getDeckOfCards().get(5);
		deck.shuffle();
		int shuffledCard = deck.getDeckOfCards().get(5);
		assertNotEquals(originalCard, shuffledCard);
	}

	@Test
	public void testDeckDeal() throws Exception {
		int[][] deltDeckArray = deck.deal();
		assertEquals(32, deltDeckArray.length);
	}
	
	@Test
	public void testDeckDealWith4Players() throws Exception {
		int[][] deltDeckArray2 = deck.deal();
		assertEquals(16, deltDeckArray2.length);
	}
	
	@Test
	public void testGetNextCard() throws Exception {
		deck.shuffle();
		deck.deal();
		deck.getNextCards();
		
	}

}
