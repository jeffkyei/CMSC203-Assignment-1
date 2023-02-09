
/*
 * Class: CMSC203 
 * Instructor: Ahmed Tarek
 * Description: Help with Wifi Diagnosis
 * Project #: 1
 * Due: 2/9/2021
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Jeffrey Kyei-Asare
*/

package jkyeiasare;

//import scanner
import java.util.Scanner;

public class WifiDiagnosis {
	
	//main method
	public static void main(String[] args) {
		
		//Scanner object
		Scanner userInput = new Scanner(System.in);
		
		//Intro message + First step
		System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.");
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet (yes or no)?");
		
		//Ask + Read input for step 1
		String connected = userInput.nextLine();
		
		// Computer is working
		if (connected.equals("yes")) {
			System.out.println("Rebooting your computer seemed to work.");
		}
		
		//Ask + Read input for step 2
		else {
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet (yes or no)?");
			connected = userInput.nextLine();
			
			//// Computer is working
			if (connected.equals("yes")) {
				System.out.println("Rebooting your router seemed to work.");
			}
			
			//Ask + Read input for step 3
			else {
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power.");
				System.out.println("Now are you able to connect with the internet (yes or no)?");
				connected = userInput.nextLine();
				
			    //Computer is working
				if (connected.equals("yes")) {
					System.out.println("Checking the routers cables seemed to work.");
				}
				
				//Ask + Read input for step 4
				else {
					System.out.println("Fourth step: move your computer closer ot the router");
					System.out.println("Now are you able to connect with the internet (yes or no)?");
					connected = userInput.nextLine();
					
					//Computer is working
					if (connected.equals("yes")) {
						System.out.println("Moving your computer closer seemed to work.");
					}
					
					//Ask + Read input for step 5
					else {
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router");
					}
				}
			}
			
		}
		}
}
