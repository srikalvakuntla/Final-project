package projectGradle.view;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import projectGradle.model.MediumModel;

import projectGradle.controller.ControllerMediumMouse;

public class Medium{
	// degrees of the first bulb switchs 
	 public int s1 =0;
	 public int s2 =0;
	 public int s3 =0;
	 public int s4 =0;
	 
	 // degrees of the second bulb switch
	 public int p2 =90;
	 public int p3 =90;
	 public int p4 =90;
	 
	 // used to chnage ethe directions of the boundary
	 public int s11=2;
	 public int s21=2;
	 public int s31=2;
	 public int s41=2;
	 
	 // used to change the boundaries
	 public int p11=2;
	 public int p21=2;
	 public int p31=2;
	 public int p41=2;
	 
	 public JFrame jframe;
	 public boolean easyGame1;
	 public boolean hardGame1;
	 public boolean mediumGame1 = true;
	 
	 public JButton next;
	 
	 public boolean bulb1;
	 public boolean bulb2;
	 
	 public ArrayList<JLabel> arrayLabel = new ArrayList<JLabel>();
	 public ArrayList<Integer> degree = new ArrayList<Integer>();
	 public ArrayList<Boolean> arrayOnOff = new ArrayList<Boolean>();
	 public ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
	 
	 public static void medium1(JFrame frame,boolean easyGame, boolean hardGame){
		
		
		Medium mediumObject = new Medium();
		
		// making fram static variable
		mediumObject.jframe= frame;
		
		// deleting the panels on jframe
		frame.getContentPane().removeAll();
		// re-entering the Jframe title
		mediumObject.jframe=frame;
		mediumObject.jframe.setTitle("Connnecting dots-Medium");
		
		//get the boolean values of easygame and hardgame
		mediumObject.easyGame1=easyGame;
		mediumObject.hardGame1=hardGame;
		
		// if 2 bulbs are true then game will end 
		mediumObject.bulb1=false;
		mediumObject.bulb2=false;
		
		// creating the back button
		JButton back = new JButton("Back");
		back.setFont(new Font("Papyrus", Font.PLAIN, 20));
		back.setBounds(30, 500, 100, 50);
		back.setBackground(new Color(255,168,168));
		back.setOpaque(true);
		back.setBorderPainted(true);
		back.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		// creating the reset button
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Papyrus", Font.PLAIN, 20));
		reset.setBounds(150, 500, 100, 50);
		reset.setBackground(new Color(247,255,0));
		reset.setOpaque(true);
		reset.setBorderPainted(true);
		reset.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		ControllerMediumMouse.resetBackJbutton(reset,back, mediumObject);
		
		// creating the next button
		mediumObject.next = new JButton("next");
		mediumObject.next.setFont(new Font("Papyrus", Font.PLAIN, 20));
		mediumObject.next.setBounds(270, 500, 100, 50);
		mediumObject.next.setBackground(new Color(255,168,168));
		mediumObject.next.setOpaque(true);
		mediumObject.next.setBorderPainted(true);
		mediumObject.next.setBorder(BorderFactory.createLineBorder(Color.black,2));
		// it will enable only if the game is ended 
		mediumObject.next.setEnabled(!mediumObject.mediumGame1);
		
		
		
		//new JPanel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(107,146,255));
		
		// creating the image icons to easly accesing the different bulbs 
		mediumObject.images = (ArrayList<ImageIcon>)MediumModel.mediumImage().clone();
		
		// returns list of Jlabel in a arraylist
		mediumObject.arrayLabel = (ArrayList<JLabel>)MediumModel.mediumLable().clone();
		
		// returns boolean values of a switchs and bulbs and powersupply in an array
		mediumObject.arrayOnOff = (ArrayList<Boolean>)MediumModel.mediumBoolean().clone();
		
		// returns the degrees of switchs in an array list 
		mediumObject.degree = (ArrayList<Integer>)MediumModel.mediumDegree().clone();
		
		// adding Jlabels to the panels
		panel.add(mediumObject.arrayLabel.get(0));
		panel.add(mediumObject.arrayLabel.get(1));
		panel.add(mediumObject.arrayLabel.get(2));
		panel.add(mediumObject.arrayLabel.get(3));
		panel.add(mediumObject.arrayLabel.get(4));
		panel.add(mediumObject.arrayLabel.get(5));
		
		panel.add(mediumObject.arrayLabel.get(6));
		panel.add(mediumObject.arrayLabel.get(7));
		panel.add(mediumObject.arrayLabel.get(8));
		panel.add(mediumObject.arrayLabel.get(9));
		panel.add(mediumObject.arrayLabel.get(10));
		
		// adding switchs to the panel
		panel.add(back);
		panel.add(reset);
		panel.add(mediumObject.next);
		
		//adding panel to the frame
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
		
		ControllerMediumMouse.mediumMouse(mediumObject);
		
}
}
