package projectGradle.view;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import projectGradle.model.EasyModel;
import projectGradle.controller.ControllerEasyMouse;
import projectGradle.*;

public class Easy{
	 // As are used to store the degrees later they are updated in degree arraylist
	 public int s1 =0;
	 public int s2 =0;
	 public int s3 =0;
	 public int s4 =0;
	 
	 // to know the location of the switch we are using the even and odd comprasion
	 public int s11=2;
	 public int s21=2;
	 public int s31=2;
	 public int s41=2;
	 
	 
	 
	 // as we return the jframe we are copying the JFrame as a static
	 public JFrame jframe;
	 
	 // rather than passing these boolean again and again we are copying them into global vaiables
	 public boolean mediumGame1;
	 public boolean hardGame1;
	 
	 public boolean easyGame1=true;
	 
	 public JButton next;
	 
	 //ArrrayList of label
	 public  ArrayList<JLabel> arrayLabel = new ArrayList<JLabel>();
	 // Arraylist of degrees of switchs 
	 public ArrayList<Integer> degree = new ArrayList<Integer>();
	 //arrayList of boolean used to know if the previous switch is in on state or off state 
	 public ArrayList<Boolean> arrayOnOff = new ArrayList<Boolean>();
	 
	 public static void easy1(JFrame frame, boolean mediumGame, boolean hardGame ){
		// creating a easy object 
		Easy easyObject = new Easy();
		
		
		//copying the JFrame
		easyObject.jframe=frame;
		easyObject.jframe.setTitle("Connnecting dots-Easy");
		
		//copying the game status of medium and hard 
		easyObject.mediumGame1=mediumGame;
		easyObject.hardGame1=hardGame;
		
		//deleting all the panels on the jFrame
		frame.getContentPane().removeAll();
		
		//new JPanel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(107,146,255));
		
		//Back JButton used to go back to the level panel
		JButton back = new JButton("Back");
		back.setFont(new Font("Papyrus", Font.PLAIN, 20));
		back.setBounds(30, 500, 100, 50);
		back.setBackground(new Color(255,168,168));
		back.setOpaque(true);
		back.setBorderPainted(true);
		back.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		//creating the next button
		easyObject.next = new JButton("next");
		easyObject.next.setFont(new Font("Papyrus", Font.PLAIN, 20));
		easyObject.next.setBounds(270, 500, 100, 50);
		easyObject.next.setBackground(new Color(255,168,168));
		easyObject.next.setOpaque(true);
		easyObject.next.setBorderPainted(true);
		easyObject.next.setBorder(BorderFactory.createLineBorder(Color.black,2));
		easyObject.next.setEnabled(!easyObject.easyGame1);
		
		// as we didn't finished the game it will pass the true in the place of easy game status 
		back.addActionListener(e -> Level.levelSelection(frame, easyObject.easyGame1,mediumGame,hardGame));
		
		//reset button is used to reset the game 
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Papyrus", Font.PLAIN, 20));
		reset.setBounds(150, 500, 100, 50);
		reset.setBackground(new Color(247,255,0));
		reset.setOpaque(true);
		reset.setBorderPainted(true);
		reset.setBorder(BorderFactory.createLineBorder(Color.black,2));
		// it calls the medium method in mediumm class
		reset.addActionListener(e -> Easy.easy1(frame,mediumGame,hardGame));
		

		
		//Jlabel array contains all Jlabels
		//arrayLabel -> {power, switch1,switch2,switch3,switch4, bulb }
		easyObject.arrayLabel = (ArrayList<JLabel>)EasyModel.easyLabel().clone();
		
		
		// easyDegree method return the Arraylist of degrees 
		//degree -> {0,0,0,0}
		easyObject.degree = (ArrayList<Integer>)EasyModel.easyDegree().clone();
		
		
		//easyBoolean method return arraylist of boolean values
		easyObject.arrayOnOff =(ArrayList<Boolean>)EasyModel.easyBoolean().clone();
		//arrayOnOff -> {true,false,false,false,false,false}
		
		// adding the labels to teh panel
		panel.add(easyObject.arrayLabel.get(0));
		panel.add(easyObject.arrayLabel.get(1));
		panel.add(easyObject.arrayLabel.get(2));
		panel.add(easyObject.arrayLabel.get(3));
		panel.add(easyObject.arrayLabel.get(4));
		panel.add(easyObject.arrayLabel.get(5));
		panel.add(back);
		panel.add(reset);
		panel.add(easyObject.next);
		
		// adding panel to frame
		easyObject.jframe.add(panel);
		easyObject.jframe.pack();
		easyObject.jframe.setVisible(true);
		easyObject.jframe.setResizable(true);
		
		ControllerEasyMouse.easyMouse(easyObject);
	}
}
