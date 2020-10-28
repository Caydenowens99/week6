
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		game("Barack", "Trump");
		System.out.println();
		
	}
	
	public static void game (String p1, String p2) {
		Card p1card;
		Card p2card;
		
		Deck deck = new Deck();
		
		Player playerone = new Player();
		Player playertwo = new Player();
		
		deck.shuffle();
		for (int i = 0; i < 26; i ++) {
			playerone.draw(deck);
			playertwo.draw(deck);
		}
		playerone.describe(p1);
		System.out.println();
		playertwo.describe(p2);
		
		
		for (int i = 0; i < 26; i++) {
			p1card = playerone.flip();
			p2card = playertwo.flip();
			if (p1card.getValue() > p2card.getValue()) {
				playerone.incrementScore();
			}
			else if (p1card.getValue() < p2card.getValue()) {
				playertwo.incrementScore();
			}
		}
		System.out.println();
		System.out.println("Score for " + " "+ p1 + " " + "is" + " " + playerone.getScore());
		System.out.println("Score for " + " " + p2 + " " + "is" + " "+  playertwo.getScore());
		
		if (playerone.getScore() > playertwo.getScore()) {
			System.out.println(p1 + " " + "has won the game" + " "+ playerone.getScore() + " "+ "to" + " " +  playertwo.getScore());
		}
		else if (playertwo.getScore() > playerone.getScore()) {
			System.out.println(p2 + " "+  "has won the game"  + " " + playertwo.getScore() + " " + "to" + " " + playerone.getScore());
		}
		else {
			System.out.println("The game is tied" + " " + playerone.getScore() + " " +"to" + " " + playertwo.getScore());
		}
	}
}
