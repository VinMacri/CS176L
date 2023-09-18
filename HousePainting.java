//Vincent Macri
//Cs176
//House Painting

import java.util.Scanner;

public class HousePainting {
	
	public static void main(String[] args) {
		//creating scanner
		Scanner input = new Scanner(System.in);
		
		//getting cost
		System.out.print("Enter the cost per square foot: ");
		double cost = input.nextDouble();
		
		//basic measurements
		System.out.print("Enter length of house: ");
		double length = input.nextDouble();
		System.out.print("Enter width of house: ");
		double width = input.nextDouble();
		System.out.print("Enter height of house: ");
		double height = input.nextDouble();
		
		//Window Measurements
		System.out.print("Enter the number of windows in the house: ");
		double numWindows = input.nextInt();
		System.out.print("Enter the length of the window: ");
		double windowLength = input.nextDouble();
		System.out.print("Enter the width of the window: ");
		double windowHeight = input.nextDouble();
		double windowDimension = windowHeight*windowLength;
		
		
		//Door measurements 
		System.out.print("Enter the number of doors in the house: ");
		double numDoors = input.nextInt();
		System.out.print("Enter the length of the door: ");
		double doorLength = input.nextDouble();
		System.out.print("Enter the width of the door: ");
		double doorHeight = input.nextDouble();
		double doorDimension = doorHeight*doorLength;
		
		
		//Calculations
		double sideArea = length*width; //600
		double peakSideArea = sideArea + ((length*(height-width))/2); //800
		double doorArea = numDoors * doorDimension; //80
		double windowArea = numWindows * windowDimension; //36
		double totalSurfaceArea = ((2*(sideArea)) + (2*(peakSideArea))) - (doorArea + windowArea);
		double totalCost = totalSurfaceArea*cost;
		
		//Print to console
		System.out.println("Your total printable surface area is " + totalSurfaceArea + " total square feet");
		System.out.format("Your estimate is $%.2f", totalCost);
		
	}

}
