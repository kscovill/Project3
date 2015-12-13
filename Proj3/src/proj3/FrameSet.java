package proj3;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FrameSet extends JPanel{
	    


	public FrameSet(){
		GridLayout layout = new GridLayout(5,4,10,40);

        String labels[] = {"First:             ", "Last:           ", "Town:           ", "State:          ", "Zip Code:     ", "Address:    ", "Job Status: "};
        JLabel label1 = new JLabel(labels[0]);
        JLabel label2 = new JLabel(labels[1]);
        JLabel label3 = new JLabel(labels[2]);
        JLabel label4 = new JLabel(labels[3]);
        JLabel label5 = new JLabel(labels[4]);
        JLabel label6 = new JLabel(labels[5]);
        JLabel label7 = new JLabel(labels[6]);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);
        JTextField textField3 = new JTextField(10);
        JTextField textField4 = new JTextField(10);
        JTextField textField5 = new JTextField(10);
        JTextField textField6 = new JTextField(10);
        JTextField textField7 = new JTextField(10);
        
        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textField6.setEditable(false);
        textField7.setEditable(false);
        
        String[] employList = {"Choose an employee...", "John Doe", "Jane Doe", "Kyle Scovill", "David Nielson", "Conor Coutts", "Xavier DesCarts Boyle Franklyn Roosevelt Mississippi"};
        JComboBox box = new JComboBox(employList);
        box.setPreferredSize(new Dimension(390, 30));
        
        JButton button1 = new JButton("Gather Information");
        button1.setPreferredSize(new Dimension(300,40));
        JButton button2 = new JButton("Close");
        button2.setPreferredSize(new Dimension(80,40));
        // Add Components to this panel.
		
		 JFrame frame = new JFrame("Company Database");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	
		 //add components
		 frame.setLayout(new FlowLayout(FlowLayout.LEFT,10,25));
		 frame.add(box);
		 frame.add(label1);
		 frame.add(textField1);
		 frame.add(label2);
		 frame.add(textField2);
		 frame.add(label3);
		 frame.add(textField3);
		 frame.add(label4);
		 frame.add(textField4);
		 frame.add(label5);
		 frame.add(textField5);
		 frame.add(label6);
		 frame.add(textField6);
		 frame.add(label7);
		 frame.add(textField7);
		 frame.add(button1);
		 frame.add(button2);
		    
		 //display the window
		 frame.pack();
		 frame.setSize(410,340);
		 frame.setResizable(false);
		 frame.setLocationRelativeTo(null);
		 //frame.setMinimumSize(frame.setPreferredSize());
		 frame.setVisible(true);
		 
		 button1.addActionListener(
				new ActionListener() //adds a listener for when the button is pressed
				{
					@Override
					public void actionPerformed(ActionEvent event) // what happens after the yes is clicked
					{
					while(true){
						int combo = box.getSelectedIndex();
						switch(combo){
								case 0:
									textField1.setText("");
									textField2.setText("");
									textField3.setText("");
									textField4.setText("");
									textField5.setText("");
									textField6.setText("");
									textField7.setText("");
									JOptionPane.showMessageDialog(null, "PLEASE SELECT A VALID ENTRY...");
									return;
								case 1:
									String a = employee1.getName();
									String b = employee1.getLast();
									String c = employee1.getTown();
									String d = employee1.getState();
									String e = employee1.getZip();
									String f = employee1.getAdd();
									String g = employee1.getJob();
									textField1.setText(a);
									textField2.setText(b);
									textField3.setText(c);
									textField4.setText(d);
									textField5.setText(e);
									textField6.setText(f);
									textField7.setText(g);
									try {
										File file1 = new File(".\\src\\base\\John Doe.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a);
										pw.println(b);
										pw.println(c);
										pw.println(d);
										pw.println(e);
										pw.println(f);
										pw.println(g);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
								case 2:
									String a1 = employ3.getName();
									String b1 = employ3.getLast();
									String c1 = employ3.getTown();
									String d1 = employ3.getState();
									String e1 = employ3.getZip();
									String f1 = employ3.getAdd();
									String g1 = employ3.getJob();
									textField1.setText(a1);
									textField2.setText(b1);
									textField3.setText(c1);
									textField4.setText(d1);
									textField5.setText(e1);
									textField6.setText(f1);
									textField7.setText(g1);
									try {
										File file1 = new File(".\\src\\base\\Jane Doe.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a1);
										pw.println(b1);
										pw.println(c1);
										pw.println(d1);
										pw.println(e1);
										pw.println(f1);
										pw.println(g1);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
								case 3:
									String a2 = employee4.getName();
									String b2 = employee4.getLast();
									String c2 = employee4.getTown();
									String d2 = employee4.getState();
									String e2 = employee4.getZip();
									String f2 = employee4.getAdd();
									String g2 = employee4.getJob();
									textField1.setText(a2);
									textField2.setText(b2);
									textField3.setText(c2);
									textField4.setText(d2);
									textField5.setText(e2);
									textField6.setText(f2);
									textField7.setText(g2);
									try {
										File file1 = new File(".\\src\\base\\Kyle Scovill.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a2);
										pw.println(b2);
										pw.println(c2);
										pw.println(d2);
										pw.println(e2);
										pw.println(f2);
										pw.println(g2);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
								case 4:
									String a3 = employee5.getName();
									String b3 = employee5.getLast();
									String c3 = employee5.getTown();
									String d3 = employee5.getState();
									String e3 = employee5.getZip();
									String f3 = employee5.getAdd();
									String g3 = employee5.getJob();
									textField1.setText(a3);
									textField2.setText(b3);
									textField3.setText(c3);
									textField4.setText(d3);
									textField5.setText(e3);
									textField6.setText(f3);
									textField7.setText(g3);
									try {
										File file1 = new File(".\\src\\base\\David Nielson.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a3);
										pw.println(b3);
										pw.println(c3);
										pw.println(d3);
										pw.println(e3);
										pw.println(f3);
										pw.println(g3);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
								case 5:
									String a6 = employee6.getName();
									String b6 = employee6.getLast();
									String c6 = employee6.getTown();
									String d6 = employee6.getState();
									String e6 = employee6.getZip();
									String f6 = employee6.getAdd();
									String g6 = employee6.getJob();
									textField1.setText(a6);
									textField2.setText(b6);
									textField3.setText(c6);
									textField4.setText(d6);
									textField5.setText(e6);
									textField6.setText(f6);
									textField7.setText(g6);
									try {
										File file1 = new File(".\\src\\base\\Conor Coutts.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a6);
										pw.println(b6);
										pw.println(c6);
										pw.println(d6);
										pw.println(e6);
										pw.println(f6);
										pw.println(g6);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
								case 6:
									String a7 = employee7.getName();
									String b7 = employee7.getLast();
									String c7 = employee7.getTown();
									String d7 = employee7.getState();
									String e7 = employee7.getZip();
									String f7 = employee7.getAdd();
									String g7 = employee7.getJob();
									textField1.setText(a7);
									textField2.setText(b7);
									textField3.setText(c7);
									textField4.setText(d7);
									textField5.setText(e7);
									textField6.setText(f7);
									textField7.setText(g7);
									try {
										File file1 = new File(".\\src\\base\\Xavier-whatever-lol.out.txt");
										PrintWriter pw = new PrintWriter(file1);
										pw.println(a7);
										pw.println(b7);
										pw.println(c7);
										pw.println(d7);
										pw.println(e7);
										pw.println(f7);
										pw.println(g7);
										
										pw.close();
									}catch (FileNotFoundException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									return;
							}
						}
					}
				}
			);
					
		}

	

	

}
