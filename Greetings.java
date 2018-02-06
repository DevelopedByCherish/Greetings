/*
 * Cherish Shanks
 * Greetings 
 * 6/8/2016
 */


import java.util.*;

public class Greetings {

	public static void main(String[] args) {
		 // instantiate standard input object
		   Scanner keyboard = new Scanner(System.in);
		   
		   String name;
         System.out.println("What is your name? ");
		   name = keyboard.nextLine();
		   

		   System.out.println("Hello " + name );
		  // System.out.println(); 
		  
		   String reply =null;
		   String joke;
		   String Feel = null;
		   String tellJoke = null;
		   int num = 0;
		   
		   
		   int rate;
		   System.out.println("Rate how you are feeling today "
		   		+ " 1 = Horrible "
		   		+ " 2 = Not that well"
		   		+ " 3 = Okay"
		   		+ " 4 = Great "
		   		+ " 5 = Fantastic");
		   rate = keyboard.nextInt();
		   
		   
		   switch (rate)
		   {
		   case 1: case 2: reply = "Not good!";
		   break;
		   case 3: reply = " okay I guess";
		   case 4: case 5: reply = "great!";
		   break;
		   }
		   System.out.println("That's " + reply);
		   
		   switch(rate)
		   {
		   case 1: case 2: case 3: Feel = " you feel better";
		   break;
		   case 4: case 5: Feel = " you feel even better";
		   }
		  
		   System.out.println("Here is a Joke to make" +Feel+ "?");
		   System.out.println();
		   
		   System.out.println("Did you hear about the hungry clock? He went back four seconds." );
		   System.out.println();
		   
		   System.out.println("Hope that joke made"+ Feel+ ".");

	}

}