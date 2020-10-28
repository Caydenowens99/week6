
public class Card {

	int value;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setValue(int cardValue) {
		this.value = cardValue;
		
		if (value == 2) {
			this.name = "Two";
		}
		else if (value == 3) {
			this.name = "Three";
		}
		else if (value == 4) {
			this.name = "Four"	;
		}
		else if (value == 5) {
			this.name = "Five";
		}
		else if (value == 6) {
			this.name = "Six";
		}
		else if (value == 7) {
			this.name = "Seven";
		}
		else if (value == 8) {
			this.name = "Eight";
		}
		else if (value == 9) {
			this.name = "Nine";
		}
		else if (value == 10) {
			this.name = "Ten";
		}
		else if (value == 11) {
			this.name = "Jack";
		}
		else if (value == 12) {
			this.name = "Queen";
		}
		else if (value == 13) {
			this.name = "King";
		}
		else if (value == 14) {
			this.name = "Ace";
		}
		
	}
	public int getValue() {
		return value;
	}
	public void describe() {
		System.out.println("The card is  " + name + "of" + " " + value )	; 	
}
}
