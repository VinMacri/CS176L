package medals;
import java.util.*;
//Vincent Macri and Jason Galvao
//CS 176L
//2D ArrayList Assignment
public class Medals {
	
	public static void main(String[] args) {
		//Initializing All ArrayLists
		ArrayList<String> countryList = new ArrayList<String>(Arrays.asList("Canada","Italy","Germany","Japan","Kazakhstan","Russia","South Korea","United States"));
		ArrayList<Integer> goldList = new ArrayList<Integer>(Arrays.asList(0,0,0,1,0,3,0,1));
		ArrayList<Integer> silverList = new ArrayList<Integer>(Arrays.asList(3,0,0,0,0,1,1,0));
		ArrayList<Integer> bronzeList = new ArrayList<Integer>(Arrays.asList(0,1,1,0,1,1,0,1));
		ArrayList<ArrayList<Integer>> medalList = new ArrayList<ArrayList<Integer>>(Arrays.asList(goldList,silverList,bronzeList));
	
		//Printing out countries and their medals
		System.out.format("%15s%10s%10s%10s%10s", "Country","Gold","Silver","Bronze","Total");
		System.out.println("");
		for(int a = 0; a < countryList.size();a++) {
			int total = medalList.get(0).get(a) + medalList.get(1).get(a) + medalList.get(2).get(a);
			System.out.format("%15s%10d%10d%10d%10d", countryList.get(a), medalList.get(0).get(a), medalList.get(1).get(a), medalList.get(2).get(a), total);
			System.out.println("");
		}

		
		//totaling how many of each type of medal there are and printing it out at bottom of table
		int goldTotal = 0;
		for(int i = 0; i < goldList.size();i++) {
			goldTotal += goldList.get(i);
		}
		int silverTotal = 0;
		for(int i = 0; i < silverList.size();i++) {
			silverTotal += silverList.get(i);
		}
		int bronzeTotal = 0;
		for(int i = 0; i < bronzeList.size();i++) {
			bronzeTotal += bronzeList.get(i);
		}
		int total = goldTotal + silverTotal + bronzeTotal;
		System.out.format("%15s%10d%10d%10d%10d", "Total", goldTotal, silverTotal, bronzeTotal, total);
		
	}
}