package proj3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		FrameSet set = new FrameSet();
		int count = 0;
		count++;
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
