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



public class FrameAndPanel{


	static JFrame mainFrame1(){
		JFrame mainFrame = new JFrame("Connecting dots");
		mainFrame.setPreferredSize(new Dimension(400, 600));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.pack();
		mainFrame.setVisible(true);
		mainFrame.setResizable(true);
		return mainFrame;
	}


	static JPanel firstPanel1(){
		JPanel firstPanel = new JPanel();
		firstPanel.setBackground(new Color(96,96,96));
		return firstPanel;
	}
	
	static JLabel firstLabel1(){
		JLabel firstLabel = new JLabel();
		firstLabel.setPreferredSize(new Dimension(330, 400));
		firstLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
		return firstLabel;
	}
	
	static JButton startButton1(){
		JButton start = new JButton("Start");
		start.setFont(new Font("Papyrus", Font.PLAIN, 20));
		start.setBounds(115, 250, 100, 60);
		return start;
	}
	
	static void color1(JPanel firstPanel){
	for ( int i=0; i<=100;i++){
		firstPanel.setBackground(new Color((int)(2.55*i),(int)(2.55*i),0));
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
	static void displayText(JLabel firstLabel){
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
		firstLabel.setText(welcome1);
	}
	
	
}


}
