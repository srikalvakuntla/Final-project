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


import projectGradle.model.GameEndModel;

public class SecondFrame {
public JFrame mainFrame;
public JPanel secondPanel;

public JLabel firstLabel;
public JButton start;

public JButton easy;
public JButton medium;
public JButton hard;
public JButton resetGame;
public JButton endGame;
public SecondFrame(boolean easyGame, boolean mediumGame, boolean hardGame){
	//main panel creation
	this.secondPanel = new JPanel();
	this.secondPanel.setBackground(new Color(96,96,96));
	this.secondPanel.setLayout(null);
	
	
	// Jlabel 
	this.firstLabel = new JLabel();
	this.firstLabel.setText("Select the game level");
	this.firstLabel.setBounds(45,200, 300, 50);
	this.firstLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
	this.secondPanel.add(this.firstLabel);
	
	
	// add jbutton
	this.easy = new JButton("easy");
	this.easy.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.easy.setBounds(150, 250, 100, 50);
	this.easy.setBackground(new Color(133,255,124));
	this.easy.setOpaque(true);
	this.easy.setBorderPainted(true);
	this.easy.setBorder(BorderFactory.createLineBorder(Color.black,2));
	// check if easy game is over or not
	if(GameEndModel.easyGameEnd(easyGame)){
		//highlights the border and disable the button
		this.easy.setBorder(BorderFactory.createLineBorder(Color.white,4));
		this.easy.setEnabled(easyGame);
}
	
	
	// add jbutton
	this.medium = new JButton("medium");
	this.medium.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.medium.setBounds(150, 310, 100, 50);
	this.medium.setBackground(new Color(124,252,255));
	this.medium.setOpaque(true);
	this.medium.setBorderPainted(true);
	this.medium.setBorder(BorderFactory.createLineBorder(Color.black,2));
	// if medium game is end then mediumGame become false 
	if(GameEndModel.mediumGameEnd(mediumGame)){
		//highlights the border and disable the button
		this.medium.setBorder(BorderFactory.createLineBorder(Color.white,4));
		this.medium.setEnabled(mediumGame);
}
	
	
	//hard button
	this.hard = new JButton("hard");
	this.hard.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.hard.setBounds(150, 370, 100, 50);
	this.hard.setBackground(new Color(255,124,124));
	this.hard.setOpaque(true);
	this.hard.setBorderPainted(true);
	this.hard.setBorder(BorderFactory.createLineBorder(Color.black,2));
	// if hard game is end then hardGame become false
	if(GameEndModel.hardGameEnd(hardGame)){
		//highlights the border and disable the button
		this.hard.setBorder(BorderFactory.createLineBorder(Color.white,4));
		this.hard.setEnabled(hardGame);
}
	
	// add jbutton to the panel
	this.secondPanel.add(this.hard);
	
	// add jbutton to the panel
	this.secondPanel.add(this.medium);
	
	// add jbutton to the panel
	this.secondPanel.add(this.easy);
	
	
	//if all 3 levels are completed 
	if(GameEndModel.endGame(easyGame,mediumGame,hardGame)){
		// display the message 
		JLabel gameEnd = new JLabel();
		gameEnd.setText("you Won the Game");
		gameEnd.setFont(new Font("Papyrus", Font.BOLD, 40));
		gameEnd.setForeground (Color.white);
		gameEnd.setBounds(25,10, 350, 50);
		this.secondPanel.add(gameEnd);
		
		//reset button is used to reset the game 
		this.resetGame = new JButton("Reset");
		this.resetGame.setFont(new Font("Papyrus", Font.PLAIN, 20));
		this.resetGame.setBounds(50,100, 100, 50);
		this.secondPanel.add(this.resetGame);
		
		// close is used to close the Jframe completely 
		this.endGame = new JButton("Close");
		this.endGame.setFont(new Font("Papyrus", Font.PLAIN, 20));
		this.endGame.setBounds(250,100, 100, 50);
		this.secondPanel.add(this.endGame);
		
	}
}
}
