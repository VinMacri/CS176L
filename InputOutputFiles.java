import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
//Vincent Macri
//CS 176L
//File Exception
/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
      PrintWriter outputFile = new PrintWriter("outlines.txt");
	   Boolean run = true;
	   while(run) {
	      
	      try {
	    	  Scanner in = new Scanner(System.in);
		      System.out.println("Please enter the path to open the input file for example C:\\Downloads\\lines.txt : ");
		      String fileName = in.nextLine();
		      File inputFile = new File(fileName);
		      Scanner reader = new Scanner(inputFile);
		      while(reader.hasNext()) {
		    	  String line = reader.nextLine();
		    	  if(line.length() > 0) {
		    		  String[] newLine = line.split(" ");
		    		  outputFile.println(newLine[1]);
		    	  }
		      }
		      run = false;
		      outputFile.close();
		      in.close();
		      reader.close();
	      }
		  catch(Exception FileNotFoundException){
			  System.out.println("File not found. Please try again.");
		  }  
	   }
   }
}
