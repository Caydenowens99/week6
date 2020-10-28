import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List <Card> cards = new ArrayList <Card>();
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw () {
		//cards.remove(0);
		return cards.remove(0);
	}

	public Deck() {
		for (int i =0; i < 52; i ++) {
			cards.add(new Card());
		}
		int name = 0;
		int cardValue = 2;
		for (Card card : cards) {
			card.setValue(cardValue);
			if (name ==0) {
				card.setName("Diamonds ");
			}
			else if (name ==1) {
				card.setName("Hearts ");
			}
			else if (name == 2) {
				card.setName("Spades ");
			}
			else if (name == 3) {
				card.setName("Clubs ");
			}
			cardValue++;
			if (cardValue > 14) {
				cardValue = 2;
				name ++;
			}
		}	
	
	
	}

	


}
	