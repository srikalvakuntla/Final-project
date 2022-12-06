package projectGradle;

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

import projectGradle.controller.ControllerStartButton;


public class GameStart extends JFrame{
JFrame mainFrame;
JPanel firstPanel;
JPanel secondPanel;
JLabel firstLabel;
JButton start;

public GameStart(){
	// main frame creation
	this.mainFrame=FrameAndPanel.mainFrame1();
	
	//first panel creation
	this.firstPanel = FrameAndPanel.firstPanel1();
	
	//adding JPanel to the frame
	this.mainFrame.add(this.firstPanel);
	
	// Jlabel 
	this.firstLabel = FrameAndPanel.firstLabel1();
	this.firstPanel.add(this.firstLabel);
	
	// add jbutton
	this.start = FrameAndPanel.startButton1();
	
	ControllerStartButton.startButton(this.start, this.mainFrame);
	
	//to start the game 
	FrameAndPanel.color1(this.firstPanel);
	
	// display the text
	FrameAndPanel.displayText(this.firstLabel);
	
	// add jbutton to the panel
	this.firstLabel.add(this.start);
		
	this.mainFrame.setVisible(true);
}

}
