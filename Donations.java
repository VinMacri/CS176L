package edu.monmouth.Donations;
//Vincent Macri
//CS 176L
//Donations

public class Donations {
	private int numIndividual;
	private int numBusiness;
	private int numOther;
	private double amtIndividual;
	private double amtBusiness;
	private double amtOther;
	
	public Donations() {
		
	}
	public void processDonations(String cat, double donation) {
		if(cat.equals("individual")) {
			if(donation > 0) {
				numIndividual++;
			}
			else {
				numIndividual--;
			}
			amtIndividual += donation;
		}
		else if(cat.equals("business")) {
			if(donation > 0) {
				numBusiness++;
			}
			else {
				numBusiness--;
			}
			amtBusiness += donation;
		}
		else if(cat.equals("other")) {
			if(donation > 0) {
				numOther++;
			}
			else {
				numOther--;
			}
			amtOther += donation;
		}
	}
	public void getStatistics() {
		System.out.println("Individual: #:"+numIndividual + " $" + amtIndividual);
		System.out.println("Business: #:"+numBusiness + " $" + amtBusiness);
		System.out.println("Other: #:"+numOther + " $" + amtOther);
	}

}
