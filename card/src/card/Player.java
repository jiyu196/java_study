package card;

import java.util.Arrays;

public class Player {
	Card[] cards = new Card[5]; //카드5장 null값 들어가있음. 
	String name;

	Player(String name) {
		this.name = name;
	}
	
	public String toString() {
		return Arrays.toString(cards);
	}
}
