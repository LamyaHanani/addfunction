package lamya;

import java.util.Scanner;
//import java.io.*; 
import javax.swing.JOptionPane;

public class sp {

	public static void main(String[] args) {
		int x=0,y=0,z=0;
		JOptionPane.showMessageDialog(null, "insert two integer numbers to find the summation for them  ");
	
	while(z==0) {
		Scanner ss = new Scanner(System.in);
	try {
		System.out.println("the first number");
		 x= ss.nextInt();
		 System.out.println("the second number");
			y=ss.nextInt();
	
	 JOptionPane.showMessageDialog(null, "the sum result is "+Integer.toString(x+y));
 
	 z=1;
	}
	catch( Exception e) {
		 JOptionPane.showMessageDialog(null, "please insert integer numbers");
		
	
	}
	}
}
	}

