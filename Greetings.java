/*
 * Cherish Shanks
 * Greetings 
 * 6/8/2016
 */


import java.util.*;
import java.io.*;

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
		  // String tellJoke = null;
		   int num = 0;
         //boolean yes = true;
         //boolean no = false;
		   
		   
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
		   case 1: case 2: case 3: Feel = "you feel better";
		   break;
		   case 4: case 5: Feel = "you feel even better";
		   }
         
         int tellJoke;
         System.out.println("Want to hear a Joke to make "+ Feel+ "? 1 = yes 2 = no");
         tellJoke = keyboard.nextInt();
         
         
         switch(tellJoke)
         {
         case 1: joke = "Did you hear about the hungry clock? He went back four seconds.";
         break;
         case 2: joke = "Okay well I hope something make "+ Feel+ " today!!!";
         break;
         default: joke = "I'm not sure if that was a yes or no but here is the Joke anyways!";
         }
         
         System.out.println(joke);
         System.out.println("");
         
         if (tellJoke == 1)
         {
         System.out.println("Hope that joke made "+ Feel+ ".");

         }
         else if (tellJoke == 2)
         {
         System.out.println("Well I hope "+ Feel);
         }
         else 
         {
         System.out.println("Hope that joke made"+ Feel+ ".");
         }
         
	}

}