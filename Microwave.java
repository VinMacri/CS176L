package edu.monmouth.microwave;
//Vincent Macri
//CS 176L
//Microwave
public class Microwave {
	private int power;
	private int time;
	
	//Constructor which sets microwave object to power level 1 and 0 seconds
	public Microwave() {
		reset();
	}
	
	//Alternates between power level 1 and power level 2 when called
	public String power() {
		if (power == 1) {
			power = 2;
		}
		else if (power == 2) {
			power = 1;
		}
		return "Power Button was pressed. Power is level " + power;
	}
	
	//Adds 30 seconds to time when called
	public String time() {
		time+=30;
		return "Time Button was pressed. Time is " + time + " seconds";
	}
	
	//resets time to 0 seconds and power level to 1
	public String reset() {
		power = 1;
		time = 0;
		return "Reset Button was pressed. Time is " + time + " seconds and Power is level " + power;
	}
	
	//Returns statement showing the cook time and power level
	public String start() {
		return "Cooking for " + time + " seconds at level " + power;
	}
}
