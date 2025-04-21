package card;

public class Main {
	public static void main(String[] args) {
		play();
	}
	
	static void play() {
		Player[] players = new Player[4];
		Deck deck = new Deck();
		deck.shuffle();
		players[0] = new Player("새똥이");
		players[1] = new Player("개똥이");
		players[2] = new Player("소똥이");
		players[3] = new Player("말똥이");
		
		for(int i = 0; i < players.length; i++) {
			for(int j = 0; j < players[i].cards.length; j++) {
				players[i].cards[j] = deck.pick();
			}
		}

		for(Player p : players) {
			System.out.println(p);
		}
		
		players[0].cards[0] = deck.pick();
		players[1].cards[0] = deck.pick();
		
		players[0].cards[0] = deck.pick();
		players[0].cards[1] = deck.pick();
		players[0].cards[2] = deck.pick();
		players[0].cards[3] = deck.pick();
		players[0].cards[4] = deck.pick();
		
		System.out.println(players[0]);
	}
}
