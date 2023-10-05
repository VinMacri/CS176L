package edu.monmouth.ArrayAssignment1;
//Vincent Macri
//CS 176L
//Array Assignment 1

public class ArrayAssignment1 {

	public static void main(String[] args) {
		double[] data = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146}; 
		
		//Enhanced for loop to print out each element in the array
		for(double num : data) {
			System.out.print(num + "  ");
		}
		
		System.out.println(""); //printing to create a new line
		double largest = data[0];
		int numNegative = 0;
		
		//for loop to test for largest number in loop and count how many negative numbers there are
		for(int i = 0; i < data.length; i++) {
			if(data[i]>largest){
				largest = data[i];
			}
			if(data[i]<0) {
				numNegative++;
			}
		}
		
		System.out.println("The largest element in the array is "+ largest);
		System.out.println("There are "+numNegative+" negative numbers is the array");
	}

}
