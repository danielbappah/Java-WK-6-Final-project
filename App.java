package WK6;

public class App {

	public static void main(String[] args) {
		
		//Creation of an instance of a Deck.
		//This deck is populated with the standard deck
		//of cards when created:
		Deck standardDeck = new Deck();	
		
		//Printing out the cards in the deck:
		System.out.println("Here are the cards in the standard deck:");
		System.out.println(standardDeck.cards);
		
			
		//Calling the shuffle method of the Deck class
		//to shuffle the cards in the standard deck above,
		//and printing out the shuffled cards:
		 standardDeck.shuffle(standardDeck.cards);
		 System.out.println("\nHere are the cards in the shuffled standard deck:");
		System.out.println(standardDeck.cards);
	
		
		//Creation of two instances of a Player:
		Player Player1 = new Player();
		Player Player2 = new Player();
		
		//This code loops 26 times for each player (52
		//times in all, since the standard deck has 52
		//cards) and calls the draw method from the Player
		//class each time resulting in the creation of
		//a hand for each player;
		for (int i=0; i<26;i++) {
			Player1.draw(standardDeck.cards);
			Player2.draw(standardDeck.cards);
		}
		
		//Using setters to set each player's name:
		Player1.setName("Player1");
		Player2.setName("Player2");
		
		//Using a constructor to call the describe method 
		//from the Player class to print the player's name, 
		//list the cards in the hand, and set their score to zero:
		Player1.describe(Player1.hand,0);
		System.out.println();
		Player2.describe(Player2.hand,0);
		System.out.println("\n");
		
		//Creating and initializing ints to track the 
		//total points of each player:
		int p1TotalPoints =0;
		int p2TotalPoints =0;
		
		//An instance of a Card is created for each 
		//player. When a card is flipped by a player,
		//the card will be stored in this instance and
		//the value will be set:
		Card p1Card = new Card();
		Card p2Card = new Card();
		
		//This is the loop for the actual game play.
		//Since each player has 26 cards the loop runs 
		//26 times:
		for (int i=0; i<26;i++) {
			System.out.println("FOR ROUND : "+(i+1));
			
		//Calling the flip method of the Player class
		//to flip a player's card (from the hand), then 
		//using the instance of the Card created above  
		//to set the value of the flipped card:
			String flippedCard1 = Player1.flip(Player1.hand);
			System.out.println("Player 1 flipped a "+(flippedCard1) + " which has the value:");
			int x = p1Card.setValue(flippedCard1);
			
			String flippedCard2 = Player2.flip(Player2.hand);
			System.out.println("Player 2 flipped a "+(flippedCard2) + " which has the value:");
			int y = p2Card.setValue(flippedCard2);
			
		//The conditionals below compare the value of the
		//two flipped cards above and increments one player's
		//score or leaves both scores unchanged depending
		//on the values of the cards:
			if (x > y) {
				p1TotalPoints = Player1.incrementScore();
				System.out.println("Player 1 received a point");
				
			}
			else if (y > x) {
				p2TotalPoints = Player2.incrementScore();
				System.out.println("Player 2 received a point");
				
			}
			else {
				System.out.println("No point awarded");
			}
			System.out.println();
			
			//Updated scores are printed after each 
			//round of play:
			System.out.println("Updated Sccores: ");
			System.out.println("Player 1 has "+p1TotalPoints+ " Points");
			System.out.println("Player 2 has "+p2TotalPoints+ " Points");
			System.out.println();
		}
		
		//After all iterations of game play is completed,
		//the code below prints out the final score:
		System.out.println("The Final Score is:");
		System.out.println("Player 1 : " + p1TotalPoints +" Points");
		System.out.println("Player 2 : " + p2TotalPoints +" Points");
		
		//The conditionals below compare the two players' final
		//scores and pronounces a winner or a draw depending
		//on the scores:
		if(p1TotalPoints > p2TotalPoints ) {
			System.out.println("\nPlayer 1 wins !!!");
			System.out.println("Congratulations Player 1 !!!");
		}
		
		else if(p1TotalPoints < p2TotalPoints ) {
			System.out.println("\nPlayer 2 wins !!!");
			System.out.println("Congratulations Player 2 !!!");
		}
		
		else {System.out.println("\nThe match ended in a draw");
		       System.out.println("Thanks for playing.");
		}
}

	
}
		

