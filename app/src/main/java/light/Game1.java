package light;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Game1 extends JButton implements ActionListener{
JFrame mainFrame;
JPanel firstPanel;
JPanel secondPanel;
JLabel firstLabel;
JButton start;

JButton easy;
JButton medium;
JButton hard;
public Game1(){
	
	
	// main frame creation
	this.mainFrame = new JFrame("Connecting dots");
	this.mainFrame.setPreferredSize(new Dimension(400, 600));
	this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.mainFrame.pack();
	this.mainFrame.setVisible(true);
	this.mainFrame.setResizable(true);
	
	//main panel creation
	this.firstPanel = new JPanel();
	this.firstPanel.setBackground(new Color(0,0,0));
	this.mainFrame.add(this.firstPanel);
	
	this.secondPanel = new JPanel();
	this.secondPanel.setBackground(new Color(0,0,0));
	
	// Jlabel 
	this.firstLabel = new JLabel();
	this.firstLabel.setPreferredSize(new Dimension(330, 400));
	this.firstLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
	this.firstPanel.add(this.firstLabel);
	
	// add jbutton
	this.start = new JButton("Start");
	start.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.start.setBounds(115, 250, 100, 60);
	this.start.addActionListener(this);
	
	//to start the game 
	color1();
	
	// display the text
	displayText();
	
	// add jbutton to the panel
	this.firstLabel.add(this.start);
		
}
@Override
public void actionPerformed(ActionEvent action)
    {
		String input =action.getActionCommand();
		 mainFrame.dispose();
		 SecondFrame a= new SecondFrame();
		
		
}




public void color1(){
	for ( int i=0; i<=100;i++){
		this.firstPanel.setBackground(new Color((int)(2.55*i),(int)(2.55*i),0));
	try
      {
        Thread.sleep(20);   
        
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
  }
}

public void color2(){
	for ( int i=255; i>=0;i--){
		System.out.println(i);
		this.secondPanel.setBackground(new Color(i,0,255));
		
	try
      {
        Thread.sleep(20);   
        
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
  }
}


public void displayText(){
	String welcome ="Welcome to LIGHT game";
	String welcome1="";
	for( int i =0;i<welcome.length();i++){
		 try
      {
        Thread.sleep(50);   
        
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
		welcome1=welcome1+String.valueOf(welcome.charAt(i));
		this.firstLabel.setText(welcome1);
	}
	
	
}

}

