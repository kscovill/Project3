package proj3;

/*The program starts by building a JFrame to display the information 
 * and gather input from the user on which user to gather information on. 
 *After the user specifies which employee they wish to know information about, 
 *the program gathers the information from the corresponding 
 *class using get methods and then set methods are used to change the 
 *textFields to the appropriate information. The gather Information button 
 *will pull the appropriate information while the close button will terminate the program.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// call on JFrame class
		FrameSet set = new FrameSet();
		
		//initialize a counter
		int count = 0;
		count++;
		
		//print the counter to a file
		try {
			File file10 = new File(".\\src\\proj3\\counter.out.txt");
			PrintWriter pw = new PrintWriter(file10);
			pw.println("Number of times ran: ");
			pw.print(count);
			pw.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
