import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
   This program demonstrates the measurable Country class.
*/
//Vincent Macri
//CS 176L
//Interface v2
public class MeasurableTester
{
	public static final int FRAME_WIDTH = 250;
	public static final int FRAME_HEIGHT = 250;
	public static void main(String[] args)
	{
	   String metricToUse = "";
	   JFrame frame = new JFrame();
	   JPanel panel = new JPanel();
	   Scanner in = new Scanner(System.in);
       boolean correctInput = false;
       Measurable[] countries = new Measurable[3];
       countries[0] = new Country("Uruguay", 176220);
       countries[1] = new Country("Thailand", 513120);
       countries[2] = new Country("Belgium", 30510);
       Measurable[] bank = new Measurable[3];
       bank[0] = new BankAccount(176220);
       bank[1] = new BankAccount(513120);
       bank[2] = new BankAccount(30510);
       Measurable[] quiz = new Measurable[5];
       quiz[0] = new Quiz(95);
       quiz[1] = new Quiz(80);
       quiz[2] = new Quiz(90);
       quiz[3] = new Quiz(50);
       quiz[4] = new Quiz(75);
       
       while(!correctInput) {
	       System.out.println("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		   int input = in.nextInt();
		   if(input == 1) {
			   metricToUse = "Maximum";
			   correctInput = true;
		   }
		   else if(input == 2) {
			   metricToUse = "Minimum";
			   correctInput = true;
			   }
		   else if(input == 3) {
			   metricToUse = "Average";
			   correctInput = true;
		   }
       }
       JButton button = new JButton("Get " + metricToUse + " Balance");
       ActionListener balanceListener = new ClickListener(metricToUse, bank, "balance");
       button.addActionListener(balanceListener);
       JButton button2 = new JButton("Get " + metricToUse + " Area");
       ActionListener areaListener = new ClickListener(metricToUse, countries, "area");
       button2.addActionListener(areaListener);
       JButton button3 = new JButton("Get " + metricToUse + " Quiz Score");
       ActionListener quizListener = new ClickListener(metricToUse, quiz, "quiz score");
       button3.addActionListener(quizListener);
      
       panel.add(button);
       panel.add(button2);
       panel.add(button3);
       frame.add(panel);
       
	   frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setVisible(true);
	   in.close();

   }
}
