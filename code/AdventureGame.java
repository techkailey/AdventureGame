// Adventure Game
// Kailey Bergeron 
// November 8th, 2021

import java.util.Scanner;

public class AdventureGame{
	// public variable currentRoom is inialize to zero
	public static int currentRoom = 0; 
	// create a String to return when RoomExits array is -1 (invalid direction)
	public static String bye = "You cannot go that way!";

	// create scanner to get user input
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){ 

		// declare a named constant for number of rooms
		final int NUMBER_OF_ROOMS = 6;
		// initialize array for directions
		char[] directions = {'n', 'e', 'w', 's'};

		// two dimensional array for inex (room numbers) and directions 
		int[][] roomExitsArray = {
			{-1,1,-1,-1},
			{4,2,0,-1},
			{5,-1,1,-1},
			{-1,4,-1,-1},
			{-1,5,3,1},
			{-1,-1,4,2}
		};

		// introduction to the beginning of the game 
		// asks the player to choose a directioon or quit
		System.out.println("You wake up in your cell; there is only a small bed and sink in the cell.");
		System.out.println("In the jail there are two hallways, the cafeteria, and the courtyard. Where would you like to go?");
		System.out.printf("n = north%n e = east%n w = west%n s = south%n q = quit game%n");

		// initialize boolean to default the game to true
		boolean play = true;

		// while loop begins
		while(play == true){
			// get user input for direction (n,e,w,s)
			char moveDirections = input.nextLine().charAt(0);
			// invoke method into while loop
			// prints out the description of the new room that the player enters and the exits available
			PlayerMovement(roomExitsArray, moveDirections, directions);
			// create a statement that allows the player to exit the game
			if(moveDirections == 'q'){
				System.out.println("Thank you for playing!");
				// if they enter 'q' the game will end and they will exit the loop 
				play = false;
			} // end of while loop 
		}
	} // end of main method 

	// create a method for Room Descriptions
	public static String RoomDescriptions(int index){
		// String array used to store the room descriptions of each room 
		String[] descriptions = new String[6];
		descriptions[0]= "You enter your dull cell, with only a sink and bed in the room. The only exit is east (the main hallway).";
		descriptions[1]= "You enter the wide main hallway, with gaurds standing at every exit. The exits are west (your cell), north (north hallway), and east (courtyard).";
		descriptions[2]= "You are now in the spacious courtyard; the whether is currently cold and dry. The exits are north (cafeteria) and west (hallway).";
		descriptions[3]= "You enter the showers; there is a row a showers on the right wall, and two guys chatting by the left wall. The only exit is east (north hallway).";
		descriptions[4]= "You enter the north hallway, there are inmates and guards standing around. The exits are south (main hallway), east (courtyard), and west (showers).";
		descriptions[5]= "You are in the cafeteria and it is Taco Tuesday. The exits are south (courtyard) and west (north hallway).";

		// return the index(room number)
		return descriptions[index];
	} // End of RoomDesciptions method

	// create a method to get the player's movement
	public static void PlayerMovement(int[][] roomExitsArray, char moveDirections, char[] directions){
		// if the currentRoom is the cell 
		if(currentRoom == 0){

			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					// if the direction is invalid the user will be notified
					if (roomExitsArray[0][i] == -1) {
						// prints String stored in bye
						System.out.println(bye);
						// resets the while loop back to the beginning
						break;
					}
					// prints the new room's description and exits available
					System.out.println(RoomDescriptions(roomExitsArray[0][i]));
					// updates current room value 
					currentRoom = roomExitsArray[0][i];
				}
			}
		}

		// if the currentRoom is main hallway 
		else if(currentRoom == 1){

			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					if (roomExitsArray[1][i] == -1) {
						System.out.println(bye);
						break;
					}
					System.out.println(RoomDescriptions(roomExitsArray[1][i]));
					currentRoom = roomExitsArray[1][i];
				}
			}
		}

		// if the currentRoom is courtyard
		else if(currentRoom == 2){

			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					if (roomExitsArray[2][i] == -1) {
						System.out.println(bye);
						break;
					}
					System.out.println(RoomDescriptions(roomExitsArray[2][i]));
					currentRoom = roomExitsArray[2][i];
				}
			}
		}

		// if the currentRoom is showers
		else if(currentRoom == 3){

			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					if (roomExitsArray[3][i] == -1) {
						System.out.println(bye);
						break;
					}
					System.out.println(RoomDescriptions(roomExitsArray[3][i]));
					currentRoom = roomExitsArray[3][i];
				}
			}
		}

		// if currentRoom is north hallway
		else if(currentRoom == 4){

			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					if (roomExitsArray[4][i] == -1) {
						System.out.println(bye);
						break;
					}
					System.out.println(RoomDescriptions(roomExitsArray[4][i]));
					currentRoom = roomExitsArray[4][i];
				}
			}
		}

		// if currentRoom is cafeteria
		else if(currentRoom == 5){
			for (int i = 0; i < directions.length; i++) {
				if (directions[i] == moveDirections) {
					if (roomExitsArray[5][i] == -1) {
						System.out.println(bye);
						break;
					}
					System.out.println(RoomDescriptions(roomExitsArray[5][i]));
					currentRoom = roomExitsArray[5][i];
				}
			}
		} 
	} // end of PlayerMovement method 
} // end of class AdventureGame



	
