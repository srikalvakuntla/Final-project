package projectGradle.view;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import projectGradle.model.*;
import projectGradle.controller.ControllerHardMouse;
import projectGradle.*;


public class Hard{

	// set the degrees of the T1
	public int t1 = -90;
	public int t11 = 3;
	
	// set the degrees of the T2
	public int t2=90;
	public int t22=0;
	
	//set the degree of s1
	public int s1=0;
	public int s11 =2;
	
	//set the degree of s2
	public int s2=0;
	public int s22 =2;
	
	//set the degree of s3
	public int s3=0;
	public int s33 =2;
	
	//set the degree of s4
	public int s4=0;
	public int s44 =2;
	
	
	public boolean easyGame1;
	public boolean mediumGame1;
	public boolean hardGame1 = true;
	public JFrame jframe;
	
	//bulbs 
	public boolean bulb1 =false;
	public boolean bulb2 =false;
	public boolean bulb3 =false;
	
	public JLabel labelPower = new JLabel();
	public JLabel labelbulb1 = new JLabel();
	public JLabel labelbulb2 = new JLabel();
	public JLabel labelbulb3 = new JLabel();
	public JLabel labelT1 = new JLabel();
	public JLabel labelT2 = new JLabel();
	public JLabel labels2 = new JLabel();
	public JLabel labels1 = new JLabel();
	public JLabel labels3 = new JLabel();
	public JLabel labels4 = new JLabel();
	
	
	//  next button
	public JButton next;
	
	
	public ArrayList<JLabel> arrayLabel = new ArrayList<JLabel>();
	public ArrayList<Integer> degree = new ArrayList<Integer>();
	public ArrayList<Boolean> arrayOnOff = new ArrayList<Boolean>();
	//contal off Image icons
	public ArrayList<ImageIcon> imageIcon = new ArrayList<ImageIcon>();
	// contains inverted image icons
	public ArrayList<ImageIcon> invertImageIcon = new ArrayList<ImageIcon>();

	public static void hard1(JFrame frame, boolean easyGame, boolean mediumGame){
		Hard hardObject = new Hard();
		hardObject.jframe = frame;
		hardObject.easyGame1=easyGame;
		hardObject.mediumGame1=mediumGame;
		frame.getContentPane().removeAll();
		
		hardObject.jframe=frame;
		hardObject.jframe.setTitle("Connnecting dots-Medium");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(107,146,255));
		
		//arraylist of image icons
		hardObject.imageIcon = (ArrayList<ImageIcon>)HardModel.hardImageIcon().clone();
		
		//arraylist of inverted image icons 
		hardObject.invertImageIcon = (ArrayList<ImageIcon>)HardModel.hardInvertedImageIcon().clone();
		
		
		
	
		
		//setting bounds
		hardObject.labelPower.setBounds(20, 100, 85, 55);
		hardObject.labelT1.setBounds(110, 90, 60, 70);
		hardObject.labelT2.setBounds(206, 90, 60, 70);
		hardObject.labels1.setBounds(120, 198, 40, 10);
		hardObject.labels2.setBounds(169, 121, 40, 10);
		hardObject.labelbulb1.setBounds(109, 210, 60, 85);
		hardObject.labelbulb2.setBounds(270,90,75,70);
		hardObject.labelbulb3.setBounds(215,240,70,73);
		hardObject.labels3.setBounds(225, 188, 40, 10);
		hardObject.labels4.setBounds(225, 220, 40, 10);
		
		//adding the imag icons to label
		hardObject.labelPower.setIcon(new RotatedIcon(new ImageIcon("power.png"), 270));
		hardObject.labelT1.setIcon(new RotatedIcon(new ImageIcon("tswitch.png"),270));
		hardObject.labelT2.setIcon(new RotatedIcon(new ImageIcon("tswitch.png"),90));
		hardObject.labels2.setIcon(new ImageIcon("offswitch.png"));
		hardObject.labels1.setIcon(new ImageIcon("offswitch.png"));
		hardObject.labels3.setIcon(new ImageIcon("offswitch.png"));
		hardObject.labels4.setIcon(new ImageIcon("offswitch.png"));
		hardObject.labelbulb1.setIcon(new ImageIcon("bulb.png"));
		hardObject.labelbulb2.setIcon(new ImageIcon("bulbL.png"));
		hardObject.labelbulb3.setIcon(new ImageIcon("bulb.png"));
		
		
		// arraylist of degrees
		hardObject.degree = (ArrayList<Integer>)HardModel.hardDegree().clone();
		
		// arraylist of boolean values
		hardObject.arrayOnOff = (ArrayList<Boolean>)HardModel.hardBoolean().clone();	
			
		// First array
		hardObject.arrayLabel.add(hardObject.labelPower);
		hardObject.arrayLabel.add(hardObject.labelT1);
		hardObject.arrayLabel.add(hardObject.labels1);
		hardObject.arrayLabel.add(hardObject.labelbulb1);
		
		// second array
		hardObject.arrayLabel.add(hardObject.labelPower);
		hardObject.arrayLabel.add(hardObject.labelT1);// number 5 others will be 4 
		hardObject.arrayLabel.add(hardObject.labels2);
		hardObject.arrayLabel.add(hardObject.labelT2);
		hardObject.arrayLabel.add(hardObject.labelbulb2);
		
		// third array
		hardObject.arrayLabel.add(hardObject.labelPower);
		hardObject.arrayLabel.add(hardObject.labelT1);
		hardObject.arrayLabel.add(hardObject.labels2);
		hardObject.arrayLabel.add(hardObject.labelT2);
		hardObject.arrayLabel.add(hardObject.labels3);
		hardObject.arrayLabel.add(hardObject.labels4);
		hardObject.arrayLabel.add(hardObject.labelbulb3);
		
		//back switch
		JButton back = new JButton("Back");
		back.setFont(new Font("Papyrus", Font.PLAIN, 20));
		back.setBounds(30, 500, 100, 50);
		back.setBackground(new Color(255,168,168));
		back.setOpaque(true);
		back.setBorderPainted(true);
		back.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		//reset switch
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Papyrus", Font.PLAIN, 20));
		reset.setBounds(150, 500, 100, 50);
		reset.setBackground(new Color(247,255,0));
		reset.setOpaque(true);
		reset.setBorderPainted(true);
		reset.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		ControllerHardMouse.resetBackJButton(reset,back,hardObject);
		
		// next switch
		hardObject.next = new JButton("next");
		hardObject.next.setFont(new Font("Papyrus", Font.PLAIN, 20));
		hardObject.next.setBounds(270, 500, 100, 50);
		hardObject.next.setBackground(new Color(255,168,168));
		hardObject.next.setOpaque(true);
		hardObject.next.setBorderPainted(true);
		hardObject.next.setBorder(BorderFactory.createLineBorder(Color.black,2));
		hardObject.next.setEnabled(!hardObject.hardGame1);
		
		//adding the labels to the panels
		panel.add(hardObject.labelPower);
		panel.add(hardObject.labelbulb1);
		panel.add(hardObject.labelbulb2);
		panel.add(hardObject.labelbulb3);
		panel.add(hardObject.labelT1);
		panel.add(hardObject.labelT2);
		panel.add(hardObject.labels2);
		panel.add(hardObject.labels3);
		panel.add(hardObject.labels4);
		panel.add(hardObject.labels1);
		panel.add(back);
		panel.add(reset);
		panel.add(hardObject.next);
		
		
		
		hardObject.jframe.add(panel);
		hardObject.jframe.pack();
		hardObject.jframe.setVisible(true);
		hardObject.jframe.setResizable(true);
		
		ControllerHardMouse.hardMouse(hardObject);
	}
		
		
}
