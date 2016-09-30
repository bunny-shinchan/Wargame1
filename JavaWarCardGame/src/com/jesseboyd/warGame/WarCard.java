package com.jesseboyd.warGame;

public class WarCard implements Card {

	private int cardValue;
	
	public WarCard(int cardValue){
//		if(cardValue < 1 || cardValue > 16 ){
//			throw new IllegalArgumentException("Card Value Outside of range");
//		}
		this.cardValue = cardValue;
	}

	public int getValue() {
		return cardValue;
	}

}
