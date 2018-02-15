/*
 * Cherish Shanks
 * Greetings 
 * 6/8/2016 to present
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

		  
		   String reply =null;
		   String joke;
         String joke2;
		   String Feel = null;

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
         
         if (tellJoke == 1){
         
         System.out.println("Want to hear another Joke? 1 = yes 2 = no");
         tellJoke = keyboard.nextInt();
         
         switch(tellJoke)
         {
         case 1: joke2 = "I brought some shoes from a drug dealer yesterday, I don't know what he laced them with but I've been tripping all day!";
         break;
         case 2: joke2 = "Okay well I hope that first joke made "+ Feel+ " !!!";
         break;
         default: joke2 = "I'm not sure if that was a yes or no but here is the Joke anyways!";

         }
         System.out.println(joke2);
         
          if (tellJoke == 1)
         {
         System.out.println("");
         System.out.println("Hope those joke made "+ Feel+ ".");
         System.out.println("");

         }

          }
         

         
        } 
	}