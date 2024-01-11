package WK6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//This is the creation of the Deck class:
public class Deck {
	
//The enum class is used below to set all possible
//suits and ranks of cards:
	enum Suit {
		club, diamond, heart, spade
	}

	enum Rank {
		two, three, four, five, six, seven, eight, nine, ten,
		jack, queen, king, ace 
	}

//The code below creates a list of strings
//and loops through the enum classes of Suits and
//Ranks to assign a name to each card and adds the (each)
//card to the list. This results in a list that contains
//every card in the standard 52 playing card deck:
	List<String> cards = new ArrayList<String>();{
	for (Suit suit: Suit.values()) {
		for(Rank rank: Rank.values()) {
			cards.add(rank + " of " + suit);
	}
	}
	}

	//This methods uses the Collections shuffle method 
	//to shuffle a deck of cards:
	public void shuffle(List<String> cards1) {
		Collections.shuffle(cards1);
	}
	
	//This method takes in a deck of cards and returns
	//the first (top) card in the deck after removing it
	//from the deck:
	public String draw(List<String> cards1) {
		String topCard = cards1.get(0);
		cards1.remove(0);
		return topCard;
	}
}
