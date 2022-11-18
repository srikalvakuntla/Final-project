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

public class SecondFrame extends JButton implements ActionListener{
JFrame mainFrame;
public JPanel secondPanel;

JLabel firstLabel;
JButton start;

JButton easy;
JButton medium;
JButton hard;
public SecondFrame(){
	//main panel creation
	this.secondPanel = new JPanel();
	this.secondPanel.setBackground(new Color(96,96,96));
	
	// Jlabel 
	this.firstLabel = new JLabel();
	this.firstLabel.setText("Select the game level");
	this.firstLabel.setPreferredSize(new Dimension(280, 400));
	this.firstLabel.setFont(new Font("Papyrus", Font.BOLD, 30));
	this.secondPanel.add(this.firstLabel);
	
	// add jbutton
	this.easy = new JButton("easy");
	this.easy.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.easy.setBounds(90, 230, 100, 50);
	this.easy.setBackground(new Color(133,255,124));
	this.easy.setOpaque(true);
	this.easy.setBorderPainted(true);
	this.easy.setBorder(BorderFactory.createLineBorder(Color.black,2));
	//this.easy.addActionListener(this);
	
	// add jbutton
	this.medium = new JButton("medium");
	this.medium.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.medium.setBounds(90, 290, 100, 50);
	this.medium.setBackground(new Color(124,252,255));
	this.medium.setOpaque(true);
	this.medium.setBorderPainted(true);
	this.medium.setBorder(BorderFactory.createLineBorder(Color.black,2));
	//this.medium.addActionListener(this);
	
	//hard button
	this.hard = new JButton("hard");
	this.hard.setFont(new Font("Papyrus", Font.PLAIN, 20));
	this.hard.setBounds(90, 350, 100, 50);
	this.hard.setBackground(new Color(255,124,124));
	this.hard.setOpaque(true);
	this.hard.setBorderPainted(true);
	this.hard.setBorder(BorderFactory.createLineBorder(Color.black,2));
	//this.hard.addActionListener(this);
	
	// add jbutton to the panel
	this.firstLabel.add(this.hard);
	
	// add jbutton to the panel
	this.firstLabel.add(this.medium);
	
	// add jbutton to the panel
	this.firstLabel.add(this.easy);
}
@Override
public void actionPerformed(ActionEvent action)
    {
		String input =action.getActionCommand();
		System.out.println(input);
		
}

}
