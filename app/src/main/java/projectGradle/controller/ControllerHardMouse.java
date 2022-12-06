package projectGradle.controller;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

import projectGradle.model.*;
import projectGradle.*;
import projectGradle.view.*;

public class ControllerHardMouse{
	
	public static void resetBackJButton(JButton reset, JButton back, Hard hardObject){
		back.addActionListener(e -> Level.levelSelection(hardObject.jframe,hardObject.easyGame1,hardObject.mediumGame1,hardObject.hardGame1));
		reset.addActionListener(e -> Hard.hard1(hardObject.jframe,hardObject.easyGame1,hardObject.mediumGame1));
		
	}
	
	public static void hardMouse(Hard hardObject){
	//checking the mouse listner for T switch
		hardObject.labelT1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            hardObject.t1+=90;
            // as T1 status of T1 effects 3 switch it needs to be checked 3 times
            hardObject.degree.set(0,hardObject.t1);
            hardObject.degree.set(4,hardObject.t1);
            hardObject.degree.set(9,hardObject.t1);
           
            hardObject.t11++;
            //T1 has 4 different bounds whne it rotates
            if(hardObject.t11==1){
				hardObject.labelT1.setBounds(99, 90, 60, 70);
			}
			else if (hardObject.t11==2){
				hardObject.labelT1.setBounds(100, 70, 70, 60);
				
			}
			else if (hardObject.t11==3){
				hardObject.labelT1.setBounds(110, 90, 60, 70);
				
			}
			
			else{
				hardObject.labelT1.setBounds(100, 124, 70, 60);
				hardObject.t11=0;
			}
			// checking 3 times
			callingChecking(1,hardObject,4);	
			callingChecking(5,hardObject,9);
			callingChecking(10,hardObject,16);	
			
			
        }
		 });
		 // checking the switch t2
		 hardObject.labelT2.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
             
            // the status of T2 effects the 2 switchs
            hardObject.t2+=90;
            hardObject.degree.set(6,hardObject.t2);
            hardObject.degree.set(11,hardObject.t2);
			
            hardObject.t22++;
            //there 4 bounds to T2
            if(hardObject.t22==1){
				
				hardObject.labelT2.setBounds(205, 70, 70, 60);
			}
			else if (hardObject.t22==2){
				hardObject.labelT2.setBounds(240, 95, 60, 70);
				
			}
			else if (hardObject.t22==3){
				hardObject.labelT2.setBounds(205, 122, 70, 60);
			}
			else{
				
				hardObject.labelT2.setBounds(205, 90, 60, 70);
				hardObject.t22=0;
			}
			//T2 effects 2 switchs 
			callingChecking(7,hardObject,9);
			callingChecking(12,hardObject,16);	
       }
		 });
		 
		
		 // mouse listner for switch s1
		hardObject.labels1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent e) {
			// seting the degrees 
			hardObject.s1+=90;
			hardObject.degree.set(1,hardObject.s1);
			
            if(hardObject.s11%2==0){
				hardObject.labels1.setBounds(135, 178, 10, 40);
			}
			else{
				hardObject.labels1.setBounds(120, 198, 40, 10);
			}
			hardObject.s11++;
			
			callingChecking(2,hardObject,4);	
	 }
		 });
	
	//adding the mouse listner for s2
	hardObject.labels2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
			
			hardObject.s2+=90;
			// s2 switch effects the 2 other switchs 
			hardObject.degree.set(5,hardObject.s2);
			hardObject.degree.set(10,hardObject.s2);
           
            if(hardObject.s22%2==0){
				
				hardObject.labels2.setBounds(180, 110, 10, 40);
				//labels2.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s2));
			}
			else{
				
				hardObject.labels2.setBounds(169, 121, 40, 10);
				//labels2.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s2));
			}
			
			hardObject.s22++;
			//System.out.println(intersects(labelT1, labels2));	
			callingChecking(6,hardObject,9);
			callingChecking(11,hardObject,16);
		  }
		 });
		 // mouse listner for s3
		hardObject.labels3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
			
			hardObject.s3+=90;
			hardObject.degree.set(12,hardObject.s3);
           
            if(hardObject.s33%2==0){
				
				hardObject.labels3.setBounds(240, 173, 10, 40);
				hardObject.labels3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s3));
			}
			else{
				
				hardObject.labels3.setBounds(225, 188, 40, 10);
				hardObject.labels3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s3));
			}
			
			hardObject.s33++;
			//
			callingChecking(13,hardObject,16);
		  }
		 });
		 //s4 switch
		hardObject.labels4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
			
			hardObject.s4+=90;
			hardObject.degree.set(13,hardObject.s4);
           
            if(hardObject.s44%2==0){
				
				hardObject.labels4.setBounds(240, 205, 10, 40);
				hardObject.labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s4));
			}
			else{
				
				hardObject.labels4.setBounds(225, 220, 40, 10);
				hardObject.labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), hardObject.s4));
			}
			
			hardObject.s44++;
			
			callingChecking(14,hardObject,16);
		  }
		 });
	}
	
	static void callingChecking(int startIndex,Hard hardObject,int endIndex){
		// checking if the switch touch each other
		HardModel.checkh1(startIndex,hardObject,endIndex);
		
		// if all 3 bulbs are ON thengame end
		if (hardObject.bulb1 & hardObject.bulb2 & hardObject.bulb3){
			// set the game to false as it is ended 
			hardObject.hardGame1=false;
			hardObject.next.setEnabled(!hardObject.hardGame1);
			
			// if medium game isn't finished the next will redirects to medium
			if(hardObject.mediumGame1){
				hardObject.next.addActionListener(e -> Medium.medium1(hardObject.jframe, hardObject.easyGame1,hardObject.hardGame1));
			}
			// if hard game isn't finished the next will redirects to hard
			else if(hardObject.easyGame1){
				hardObject.next.addActionListener(e -> Easy.easy1(hardObject.jframe, hardObject.mediumGame1,hardObject.hardGame1));
			}
			// if all 3 games are completed then Done will redirects to levelselction panel 
			else{
				hardObject.next.setText("Done");
				hardObject.next.addActionListener(e -> Level.levelSelection(hardObject.jframe,hardObject.easyGame1,hardObject.mediumGame1, hardObject.hardGame1));
			}
		}
	}
}
