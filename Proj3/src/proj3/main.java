package proj3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		FrameSet set = new FrameSet();
		int i = 0;
		i++;
		try {
			File file1 = new File(".\\src\\base\\output.out.txt");
			PrintWriter pw = new PrintWriter(file1);
			pw.println("Number of times ran: ");
			pw.print(i);
			pw.close();
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
