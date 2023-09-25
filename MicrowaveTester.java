package edu.monmouth.microwave;
//Vincent Macri
//CS 176L
//Microwave Tester

import java.util.Scanner;

public class MicrowaveTester {

	public static void main(String[] args) {
		Microwave myMicrowave = new Microwave();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 't' to add 30 seconds.");
		System.out.println("Enter 'p' to change power level.");
		System.out.println("Enter 'r' to reset to 0 seconds and power level 1.");
		System.out.println("Enter 's' to start microwave.");
		System.out.println("Enter 'q' to quit program.");
		
		
		boolean run = true;
		while(run) {
			String input = in.nextLine();
			if (input.toLowerCase().equals("t")){
				System.out.println(myMicrowave.time());
			}
			else if (input.toLowerCase().equals("p")){
				System.out.println(myMicrowave.power());
			}
			else if (input.toLowerCase().equals("r")){
				System.out.println(myMicrowave.reset());
			}
			else if (input.toLowerCase().equals("s")){
				System.out.println(myMicrowave.start());
			}
			else if (input.toLowerCase().equals("q")) {
				System.out.println("Thank You! Goodbye!");
			}
		}
		in.close();
		

	}

}
