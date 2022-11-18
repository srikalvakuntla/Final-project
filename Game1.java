import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Font;
import java.util.ArrayList; 

import java.util.Date; 
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;

public class Game1 extends JFrame{
JFrame mainFrame;
JPanel firstPanel;
JPanel secondPanel;
JLabel firstLabel;
JButton start;

public Game1(){
	
	
	// main frame creation
	this.mainFrame=FrameAndPanel.mainFrame1();
	
	//main panel creation
	this.firstPanel = FrameAndPanel.firstPanel1();
	
	// adding JPanel to the frame
	this.mainFrame.add(this.firstPanel);
	
	// Jlabel 
	this.firstLabel = FrameAndPanel.firstLabel1();
	this.firstPanel.add(this.firstLabel);
	
	// add jbutton
	this.start = FrameAndPanel.startButton1();
	this.start.addActionListener(e -> Level.levelSelection(this.mainFrame));
	
	//to start the game 
	FrameAndPanel.color1(this.firstPanel);
	
	// display the text
	FrameAndPanel.displayText(this.firstLabel);
	
	// add jbutton to the panel
	this.firstLabel.add(this.start);
		
	this.mainFrame.setVisible(true);
}



static void easyLevel(){
	Dummy easy = new Dummy();
	
}

}
