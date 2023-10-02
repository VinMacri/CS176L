package edu.monmouth.Donations;
//Vincent Macri
//CS 176L
//Donations
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class DonationsTester {

	public static void main(String[] args)throws FileNotFoundException {
		String cat = "";
		Double amount = 0.0;
		File myFile = new File("Donations.txt");
		System.out.println("Would you like to process donations now? (enter 'yes' to continue): ");
		Scanner in = new Scanner(System.in);
		if(in.next().toLowerCase().equals("yes")) {
			Donations giveToMe = new Donations();
			in.close();
			Scanner reader = new Scanner(myFile);
			while(reader.hasNext()) {
				String line = reader.nextLine();
				if(line.equals("<EOF>")) {
					break;
				}
				else {
					String[] splitLine = line.split(">");
					if(splitLine[0].startsWith("<individual")){
						cat = "individual";
						amount = Double.parseDouble(splitLine[1]);
						giveToMe.processDonations(cat, amount);
					}
					else if(splitLine[0].startsWith("<business")){
						cat = "business";
						amount = Double.parseDouble(splitLine[1]);
						giveToMe.processDonations(cat, amount);
					}
					else if(splitLine[0].startsWith("<other")){
						cat = "other";
						amount = Double.parseDouble(splitLine[1]);
						giveToMe.processDonations(cat, amount);
					}
				}
			}
			reader.close();
			giveToMe.getStatistics();
		}
		else {
			System.out.println("Ending now without processing donations");
		}
	}

}
