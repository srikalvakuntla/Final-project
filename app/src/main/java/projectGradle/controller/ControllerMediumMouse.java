package projectGradle.controller;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import projectGradle.model.MediumModel;

import projectGradle.model.MediumModel;
import projectGradle.*;
import projectGradle.view.*;

public class ControllerMediumMouse{
	
	public static void resetBackJbutton(JButton reset, JButton back, Medium mediumObject){
		
		reset.addActionListener(e -> Medium.medium1(mediumObject.jframe,mediumObject.easyGame1,mediumObject.hardGame1));
		back.addActionListener(e -> Level.levelSelection(mediumObject.jframe, mediumObject.easyGame1, mediumObject.mediumGame1, mediumObject.hardGame1));
		
	}
	public static void mediumMouse(Medium mediumObject){
		// first switch 
		mediumObject.arrayLabel.get(1).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            
            
            mediumObject.s1+=90;
            mediumObject.degree.set(0,mediumObject.s1);
            
            if(mediumObject.s11%2==0){
				
				mediumObject.arrayLabel.get(1).setBounds(90, 100, 10, 40);
			}
			else{
				
				mediumObject.arrayLabel.get(1).setBounds(78, 120, 36, 10);
			}
			
			// if send starting index and end the first bulb and 1 is used to know which bulb to choose 
			callingChecking(1,6,mediumObject,1);
			
			mediumObject.s11++;
        }
    });
		// second switch
		mediumObject.arrayLabel.get(2).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            
            
            mediumObject.s2+=90;
            mediumObject.degree.set(1,mediumObject.s2);
            
            if(mediumObject.s21%2==0){
				
				mediumObject.arrayLabel.get(2).setBounds(90, 136, 10, 40);
			}
			else{
				mediumObject.arrayLabel.get(2).setBounds(78, 158, 36, 10);
			}
			
			callingChecking(2,6,mediumObject,1);
			mediumObject.s21++;
        }
    });
	
	// 3rd switch
	mediumObject.arrayLabel.get(3).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           
            
            mediumObject.s3+=90;
            mediumObject.degree.set(2,mediumObject.s3);
            
            if(mediumObject.s31%2==0){
				mediumObject.arrayLabel.get(3).setBounds(90, 172, 10, 40);
			}
			else{
				mediumObject.arrayLabel.get(3).setBounds(78, 196, 36, 10);
				
			}
			callingChecking(3,6,mediumObject,1);
			
			mediumObject.s31++;
        }
    });
    //4th switch
    mediumObject.arrayLabel.get(4).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            mediumObject.s4+=90;
            mediumObject.degree.set(3,mediumObject.s4);
            
            if(mediumObject.s41%2==0){
				
				mediumObject.arrayLabel.get(4).setBounds(90, 206, 10, 40);
			}
			else{
				
				mediumObject.arrayLabel.get(4).setBounds(78, 224, 36, 10);
			}
			
			callingChecking(4,6,mediumObject,1);
			
			mediumObject.s41++;
        }
    });
	
	
	
		
	// 1st switch in second bulb
	mediumObject.arrayLabel.get(7).addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		mediumObject.p2+=90;
		
		mediumObject.degree.set(6,mediumObject.p2);
		if(mediumObject.p21%2==0){
			//labelp2.setIcon(new RotatedIcon(p2, 90));
			mediumObject.arrayLabel.get(7).setBounds(130, 364, 40, 10);
		}
		else{
			mediumObject.arrayLabel.get(7).setBounds(150, 350, 10, 36);
			
		}
		// 3 represents the sencond bulb 
		callingChecking(7,11,mediumObject,3);
			
		
		mediumObject.p21++;
	}
});
	
	// 2nd switch in 2nd bulb
	mediumObject.arrayLabel.get(8).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            mediumObject.p3+=90;
            mediumObject.degree.set(7,mediumObject.p3);
            if(mediumObject.p31%2==0){
				mediumObject.arrayLabel.get(8).setBounds(165, 364, 40, 10);
			}
			else{
				mediumObject.arrayLabel.get(8).setBounds(186, 350, 10, 36);
				
			}
			callingChecking(8,11,mediumObject,3);
			mediumObject.p31++;
        }
    });
    // 3rd switch
    mediumObject.arrayLabel.get(9).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            mediumObject.p4+=90;
            mediumObject.degree.set(8,mediumObject.p4);
            if(mediumObject.p41%2==0){
				
				mediumObject.arrayLabel.get(9).setBounds(200, 364, 40, 10);
			}
			else{
				
				mediumObject.arrayLabel.get(9).setBounds(222, 350, 10, 36);
			}
			
			callingChecking(9,11,mediumObject,3);
			
			mediumObject.p41++;
        }
    });
	
	}

	static void callingChecking(int startIndex,int endIndex,Medium mediumObject,int bulb){
		//it will check wether the on jlabel touches the other and update the jlabel 
		MediumModel.checkm1(startIndex,mediumObject,endIndex,bulb);
		
		// if both the bulbs are ON then game is ended
		if (mediumObject.bulb1 & mediumObject.bulb2){
			
			// as game end make the mediumGame1 to false
			mediumObject.mediumGame1=false;
			// enable the next button
			mediumObject.next.setEnabled(!mediumObject.mediumGame1);
			
			// if hardgame isn't completed then "next" will call the hard game
			if(mediumObject.hardGame1){
				mediumObject.next.addActionListener(e -> Hard.hard1(mediumObject.jframe, mediumObject.easyGame1,mediumObject.mediumGame1));
			}
			// if easy game isn't completed then "next" will call the easy game
			else if(mediumObject.easyGame1){
				mediumObject.next.addActionListener(e -> Easy.easy1(mediumObject.jframe, mediumObject.mediumGame1, mediumObject.hardGame1));
			}
			// if all the games are completed then the "next" is changed as " done" and it will call the levelselection method  
			else{
				mediumObject.next.setText("Done");
				mediumObject.next.addActionListener(e -> Level.levelSelection(mediumObject.jframe,mediumObject.easyGame1,mediumObject.mediumGame1, mediumObject.hardGame1));
			}
			
		}
}
}
