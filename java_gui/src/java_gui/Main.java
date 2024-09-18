package java_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
	/*	         //********frame and label*********
    
	// frame : a gui window to add components to 	
		
	
	myframe1 frame = new myframe1();//create a frame
   
	// Jlabel : a gui diplay area for a string of text, an image, or both
	
	JLabel label = new JLabel();//create a label
	label.setText("we are in Good's hands!");//set text of label
	frame.add(label); //add label to our frame
	
	ImageIcon image = new ImageIcon("///C:/java_eclipse/java_gui/src/java_gui/photo_png.png");
	label.setIcon(image);//add image to our label 
	label.setHorizontalTextPosition(JLabel.CENTER);//la position horizontal de texte par rapport à la photo: LEFT?CENTER?RIGHT of imageicon
	label.setVerticalTextPosition(JLabel.TOP); 
	label.setForeground(new Color(0x00FF00)); //change the color of test
	label.setFont(new Font(" ",Font.ITALIC,30));//type of police
	label.setIconTextGap(0); //the gap betwen the text and image  
	label.setBackground(new Color(0x123456));//set background color
	label.setOpaque(true);//display background color
	
	Border border = BorderFactory.createLineBorder(Color.green, 4); // define a border to our label(cadre, limite) 
	label.setBorder(border); // set border
	label.setHorizontalAlignment(JLabel.CENTER);// if we use no layout manager no need to this function
	//for now the label takes the full size of the frame --> frame=label
	//when we change the color of label's background. the back of the frame also changed
	//that's because of the layout manager wish is in default mode: BorderLayout.
	//we can set the default layout manager to null, then we can choose the size and the placement of our label
	
	
	//frame.setLayout(null);// if we run the program the label won't display, we shoud define the size and dimension 
	
	//label.setBounds(100,0, 800, 800);
	
	
	// we can change the size of the frame and make it exactly the same of the label.
	// the function frame.pack
	//frame.pack();
	//we mast before frame.pack all the contents to our frame
	
	*/
	                 //*************JPanel********************
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.DARK_GRAY);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(new Color(0x123456));
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(new BorderLayout());
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(new Color(0x000000));
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());//to use the same default layout manager of the frame.(now the label added will takes left center of the panel) and if we change the color of the label, those of panel will change to 
		greenPanel.setLayout(null);//now we need to define the size and the dimensions of the label to add (label.setBounds).
	    
		ImageIcon icon = new ImageIcon("///C:/java_eclipse/java_gui/src/java_gui/image.jpeg");
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.TOP);    //no need to this two functions because of greenPanel.setLayout(null)
		//label.setHorizontalAlignment(JLabel.LEFT); // now i can resize and move the label in the panel as i want  
		label.setBounds(100, -12, 300, 300);
	
		
		
		
        JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(null);////now we need to define the size and the dimensions of the panels to add(display) (greenPanel.setBounds).
	    frame.setSize(750,750);
	    frame.setVisible(true);	
	    frame.getContentPane().setBackground(new Color(0x123));
	    greenPanel.add(label);
	    frame.add(redPanel);
	    frame.add(bluePanel);
	    frame.add(greenPanel);

	
	
	
	
	
	
	
	
	}

}
