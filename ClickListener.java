import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Vincent Macri
//CS 176L
//Click Listener for Interface v2
/**
 * 
   An action listener that prints a message.
*/
public class ClickListener implements ActionListener, Measurable
{
   private String metric;
   private Measurable[] object;
   private int score;
   private String data;
   private String dataType;

   public ClickListener(String metric, Measurable[] object, String dataType)
   {
      this.metric = metric;
      this.object = object;
      this.dataType = dataType;
   }
   public double getMeasure() {
		return score;
	}
   public void actionPerformed(ActionEvent a)
   {
	   if(metric.equals("Minimum")) {
		   data = Double.toString(Data.min(object));
	
	   }
	   else if(metric.equals("Maximum")) {
		   data = Double.toString(Data.max(object));
	   }
	   else if(metric.equals("Average")) {
		   data = Double.toString(Data.average(object));
	   }
      System.out.println("The " + metric.toLowerCase() + " " + dataType + " is " + data);
   }
}
