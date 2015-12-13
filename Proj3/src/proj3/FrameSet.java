package proj3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
        String[] employList = {"John Doe", "Jane Doe", "Kyle Scovill", "David Nielson", "Conor Coutts", "Xavier DesCarts Boyle Franklyn Roosevelt Mississippi"};
        JComboBox box = new JComboBox(employList);
        box.setPreferredSize(new Dimension(390, 30));
        
        JButton button1 = new JButton("Gather Information");
        button1.setPreferredSize(new Dimension(390,40));
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
		    
		 //display the window
		 frame.pack();
		 frame.setSize(410,340);
		 frame.setResizable(false);
		 frame.setLocationRelativeTo(null);
		 //frame.setMinimumSize(frame.setPreferredSize());
		 frame.setVisible(true);
	}
	
	

	

}
