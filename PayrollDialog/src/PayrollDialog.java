
import javax.swing.JOptionPane;
 		/**
 			This program demonstrates using dialogs with
 			JOptionPane.  Converts string input to numeric. 		*/
//comments
 		public class PayrollDialog {
 			public static void main(String[] args) 	{
 				String inputString; 		// For reading input
 				String name; 			        // The user's name
 				int hours; 				// The number of hours worked
 				double payRate; 		        // The user's hourly pay rate
 				double grossPay; 		// The user's gross pay
                name = JOptionPane.showInputDialog("What is"+	"your name?", "Dania");
		        inputString  = JOptionPane.showInputDialog("How many hours " +
									                           "did you work this week? ","40");
                hours = Integer.parseInt(inputString);
    			inputString = JOptionPane.showInputDialog("What is your " + "hourly pay rate? ","12");
                payRate = Double.parseDouble(inputString);
                       // Calculate the gross pay.
           		grossPay = hours * payRate;
			     JOptionPane.showMessageDialog(null, "Hello " +name + ". Your gross pay is $" +
				                            				                           grossPay);
			System.exit(0);
 			} 		
 		}