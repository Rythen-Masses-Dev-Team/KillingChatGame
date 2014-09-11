/*
Auther... Nathan Cluff
data project started... sept. 8, 14
date finished ... N/A
 */


// Import the custom made Class form a jar
import  cs1.Keyboard;

import java.awt.geom.Arc2D.Double;
import java.io.*;


public class TestProject {

	public static void main(String[] args) throws InterruptedException {
		// Set This Int for How Much Time to make it sleep between Keybord Input
		int sleep1 = 2000;
		int sleep2 = 5000;
		float UInputFloat = 122443;
		
		
		System.out.println("Welcome To the Killing Chat!");
		Thread.sleep(sleep1);
		System.out.println("Please Wait Until We Find Somneone We Chat With...");
		Thread.sleep(sleep2);
		System.out.println("<<----------Your Now Connected With Someone--------->>");
		// InputName Telling the int name above
		String InputName = ("Stranger");
		// End Of InputName
		String InputChatting = InputName + " Is Typeing";
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("Hello My Name is " + InputName);
		System.out.println("<<------------>>");
		System.out.println("Whats Your Name");
		System.out.println("<--Type In And Press Enter-->");
		String UInputName = Keyboard.readString();
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		Thread.sleep(sleep1);
		System.out.println("Your Name is..." + UInputName + "?");
		System.out.println(InputChatting);
		Thread.sleep(sleep1);
		System.out.println(" I Like That Name...");
		Thread.sleep(sleep1);
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		// InputName Asking What you like to do
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("whats Your Favorate Thing To Do?");
		System.out.println("<--Type In And Press Enter-->");
		String UInputFavthing = Keyboard.readString();
		Thread.sleep(sleep1);
		System.out.println("So you like " + UInputFavthing);
		Thread.sleep(sleep1);
		// Input Name Likes Eating People
		System.out.println("I like Eating People. Do You Like That Toooooooo?");
		System.out.println("<--Type In And Press Enter-->"); String UInputEatingPeople = Keyboard.readString();
		Thread.sleep(sleep1);
		// InputName does Not Like the answer
		System.out.println("I Don't like that Anser " + UInputEatingPeople +", " + UInputName); Thread.sleep(2000);
		// InputName Theaens to eat the user
		Thread.sleep(sleep1);
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("You Know What I Do to you When I Don't Like An Anser like that, " + UInputName);
		System.out.println("<--Type In And Press Enter, Say What? or IDK-->");
		String UIwhatDoYouDo = Keyboard.readString();
		Thread.sleep(sleep1);
		System.out.println("I EAT THEM!!!!!!!!!!!!!!!!!");
		System.out.println(InputChatting);
		Thread.sleep(sleep1);
		System.out.println("But...");
		// TODO WITCH this One
		Thread.sleep(sleep2);
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("I Will Spare Your Life," + UInputName);
		Thread.sleep(sleep1);
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.print("IF you can guess this Number" + UInputName + "Then i will let you go... :D. OK?");
		
		String UInputOk = Keyboard.readString();
		System.out.println("<--Type In OK! And Press Enter-->");
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("Ok, Im Thinking of a Number of...");
		System.out.println("<--Type In OK! And Press Enter-->");
		System.out.println(" ");
		// TODO GET THIS ONE
		float UInputFloat1 = Keyboard.readFloat();
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("So you Number is.." + UInputFloat1 + "Huh? WRONG!");
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("Next one, " + UInputName);
		System.out.println(InputChatting);
		Thread.sleep(sleep2);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("DIE!");
		Thread.sleep(700);
		System.out.println("<<--------Disconnected With, " + UInputName + "--------->>");
		Thread.sleep(700);
		
				
		
	    
		
		
		
	}

}