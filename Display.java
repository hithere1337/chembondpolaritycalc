import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Display extends JComponent implements ActionListener
{
	
	public static void test()
	{
		new Display();
	}

	public static void main(String[] args)
	{
		test();
	}

	public Display()
	{
		JFrame frame = new JFrame("Chemical Bond Polarity Calculator"); 
		Calculator c = new Calculator();
		
		JButton b=new JButton("Calculate");
		b.setBounds(100, 140, 130, 35);    

		JLabel text1 = new JLabel();        
		text1.setText("Element 1: ");
		text1.setBounds(18, 12, 100, 100);
		
		JLabel text2 = new JLabel();        
		text2.setText("Element 2: ");
		text2.setBounds(18, 12, 200, 200);

		JTextField element1= new JTextField();
		element1.setBounds(100, 50, 130, 30);
		
		JTextField element2= new JTextField();
		element2.setBounds(100, 100, 130, 30);
		
		//the result
		JLabel result1 = new JLabel();        
        result1.setBounds(18, 180, 225, 100);
        
        //top line of explanation
        JLabel result2 = new JLabel();
        result2.setBounds(18, 205, 300, 100);
        
        //second line of explanation
        JLabel result3 = new JLabel();
        result3.setBounds(18, 220, 300, 100);
        
        //last line of explanation
        JLabel result4 = new JLabel();
        result4.setBounds(18, 235, 300, 100);

		frame.add(text1);
		frame.add(text2);
		frame.add(element1);
		frame.add(element2);
		frame.add(result1);
		frame.add(result2);
		frame.add(result3);
		frame.add(result4);
		frame.add(b);    
		frame.setSize(300, 350);    
		frame.setLayout(null);    
		frame.setVisible(true);    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

		b.addActionListener(new ActionListener() {
			
			/*
			 * On button press:
			 * Checks if element symbol is valid
			 * Checks if element has custom EN value (noble gas or unknown)
			 * Calculates electronegativity difference, explains result
			 * Resets entry box on successful calculation
			 */
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.resetAll();
				c.setElement1(element1.getText());
				c.setElement2(element2.getText());
				c.results();
				//if element symbol is invalid
				if(c.calcEN(element1.getText()) < 0 || c.calcEN(element2.getText()) < 0) {
					result1.setForeground(Color.red);
					result2.setForeground(Color.red);
					result3.setForeground(Color.red);
					result1.setText("Error:");
					result2.setText("Please enter a valid element symbol");
					result3.setText("(no spaces, numbers, symbols)");
					result4.setText("");
				}
				//element is noble gas or has unknown EN value. 
				else if(c.calcEN(element1.getText()) == 100 || c.calcEN(element2.getText()) == 100) { //elements with undefined EN values
					result1.setForeground(Color.red);
					result2.setForeground(Color.red);
					result3.setForeground(Color.red);
					result1.setText("Error:");
					result2.setText("One of these elements is a noble gas");
					result3.setText("or has an unknown electronegativity value.");
					result4.setText("");
				}
				//ionic
				else if(c.getENdiff() >= 1.67) {
					result1.setForeground(Color.black);
					result2.setForeground(Color.black);
					result3.setForeground(Color.black);
					result1.setText(c.results());
					result2.setText("The bond between "+formatElement(element1.getText())+" and "+formatElement(element2.getText())+" is");
					result3.setText("ionic: electronegativity difference");
					result4.setText("is greater than or equal to 1.67.");
					element1.setText("");
					element2.setText("");
				}
				//polar covalent
				else if(c.getENdiff() < 1.67 && c.getENdiff() > 0.4) {
					result1.setForeground(Color.black);
					result2.setForeground(Color.black);
					result3.setForeground(Color.black);
					result1.setText(c.results());
					result2.setText("The bond between "+formatElement(element1.getText())+" and "+formatElement(element2.getText())+" is");
					result3.setText("polar covalent: electronegativity");
					result4.setText("difference is between 0.4 and 1.67.");
					element1.setText("");
					element2.setText("");
				}
				//nonpolar covalent
				else if(c.getENdiff() < 0.4 && c.getENdiff() >= 0.0) {
					result1.setForeground(Color.black);
					result2.setForeground(Color.black);
					result3.setForeground(Color.black);
					result1.setText(c.results());
					result2.setText("The bond between "+formatElement(element1.getText())+" and "+formatElement(element2.getText())+" is");
					result3.setText("nonpolar covalent: electronegativity");
					result4.setText("difference is less than or equal to 0.4.");
					element1.setText("");
					element2.setText("");
				}
			}          
		});
	}
	
	/*
	 * Formats element correctly: he -> He
	 */
	public String formatElement(String e) {
		String element = "";
		//if 2 letter element, format correctly, else put into all uppercase
		//no need to check for good element
		if(e.length()==2) {
			element = e.substring(0, 1).toUpperCase()+e.substring(1).toLowerCase();
		}
		else {
			return e.toUpperCase();
		}
		return element;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//method stub
	}
}
