package java_gui;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class myframe1 extends JFrame  {

 myframe1()
 {
	 this.setSize(500, 500);//set x dimension and y dimension of the frame
	 this.setTitle("We are in Good's hands"); //set title of frame
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stop running the application 
	 this.setResizable(true);//prevent frame from being resized 
	 this.setVisible(true);//make this visible
	     
	 ImageIcon image = new ImageIcon("///C:/java_eclipse/java_gui/src/java_gui/photo_png.png");//create an ImageIcon
     this.setIconImage(image.getImage()); // change the icon of the frame
		
     this.getContentPane().setBackground(new Color(0x123)); //choose a color of the frame
			 
	 
	 
	 
	 
	 
	 
	 
 }
	
	
	
}
