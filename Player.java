package WK6;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

//This is the creation of the Player class:
public class Player {

//These are the fields of the class comprising of a 
//list of strings for the hand of drawn cards, a int
//for storing a players score, and a string for storing
//a players name:
	List<String> hand = new ArrayList<String>();
	private int score;
	private String name;
	
//This method takes in a hand of cards and a score and
//sets the score to zero. It then calls the describe 
//method of the Card class to give a description (name)
//of each card in the hand, and prints out the name of 
//the player and the cards in the hand:
	
	public void describe(List <String> hand, int score) {
		this.score = score;
		score = 0;
		System.out.println("\n"+name+" has these cards: ");
		
		//Creation of an instance of the Card class:
		Card handCards = new Card();
		
		//Using enhanced for loop to describe each card
		//in the hand using the instance of Card above:
		for(String card: hand) {
		handCards.describe(card);
		}
	}
	
//This method takes in a hand of cards and returns
//the first (top) card in the hand after removing it
//from the deck.
//Could have also called the draw method from the Deck
//class to accomplish this:
	public String flip(List<String> hand) {
		String topCard = hand.get(0);
		hand.remove(0);
		return topCard; 
		//If we used the draw method:
		/*Deck deck = new Deck();
		String card = deck.draw(hand);
		return card;*/
	}
	
	//This method draws cards from a deck and adds
	//the drawn cards to a player's hand:
	public void draw(List<String> deck) {
		
		//Creation of an instance of a Deck and
		//storing the cards in the deck ( that was passed 
		//into the method) in the instance of the created deck:
		Deck thisDeck = new Deck();
		thisDeck.cards = deck;
		
		//Calling the draw method from the Deck class
		//to pull out the first (top) card and adding
		//the card to the player's hand:
		hand.add(thisDeck.draw(deck));
	}
	
	//Method to increment a player's score by one point:
	public int incrementScore() {
		score += 1;
		return score;
	}

	//Setter for a player's name:
	public void setName(String name) {
		this.name = name;
	}

}
