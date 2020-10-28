import java.util.ArrayList;
import java.util.List;

public class Player {

	private List <Card> hand = new ArrayList<>();
	private int score = 0;
	String name;
		
	
	public String describe (String p1) {
		System.out.println("Player's name is:  " + p1 + ". The cards in " + p1 +"'s" +  " hand are as follows:  " + "  ");
		for(Card card : hand) {
		card.describe();
		}
		return "Player's name is:  " + this.name + ". The cards in " + this.name +  " hand are as follows:  " + "  ";
	}

	
	public Card flip() {
		Card top = hand.get(0);
		hand.remove(0);
		return top;
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		score++;
	}
	public String getName () {
		return name; }
	public void setName (String name) {
		this.name = name;
	}

	
	public int getScore() {
		return this.score;
	}
	public int setScore(int score) {
		return score;
	}
	
}
