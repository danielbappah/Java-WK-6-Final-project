package WK6;


//This is the creation of the Card class:
public class Card {

	
	private int value;
	public String name;
	
	//This code creates an array of strings that contain
	//the string names of all possible card types (values):
	private String cardTypes[]= new String[]{
		"two", "three", "four", "five", "six", "seven",
		"eight", "nine", "ten", "jack", "queen", "king", "ace" };
	
	//The method below takes a drawn card by calling
	//the drawnCard method from the Deck class, and
	//checking to see if it matches with a card type
	//from the cardType array above, and then sets the
	//value of the card to an integer between 2 and 14:
	public int setValue(String drawnCard) {
		for(int i=0; i <13; i++) {
		
	//This line checks to see if the card name contains
	//any of the cardTypes in the cardType array:
			if (drawnCard.contains(cardTypes[i])) {
				
	//Since the cardType array is zero based and the 
	//card values start from 2, the number 2 is added
	//to the array index of the card type and assigned
	//as the value of the card because the card names are
	//listed (sorted) in order in the array:
				value = i+2;}}
		System.out.println(value);
		return value;
	}
	
	//This is the getter for the name of a card:
	public void getName(String name) {
		this.name = name;
	}
	
	//This method prints information (name) of a card:
	public void describe(String name) {
		System.out.print(name+",");
	}
	
	
}
