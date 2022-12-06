package projectGradle.controller;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;


import projectGradle.model.EasyModel;
import projectGradle.*;
import projectGradle.view.*;

public class ControllerEasyMouse{


	public static void easyMouse(Easy easyObject){
		// creating the mouse actionlistener
		easyObject.arrayLabel.get(1).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            
            // incrementing the position of the switch
            easyObject.s1+=90;
            //update the degree in arrayList
            easyObject.degree.set(0,easyObject.s1);
            
            //it will enter if condition when s11 is even. As s11 is 2 at the starting it will enter the if condition 
            //enters the if condition alternatively
            if(easyObject.s11%2==0){
				// bourders are updated 
				easyObject.arrayLabel.get(1).setBounds(160, 100, 10, 40);
			}
			else{
				// when s11 is 3,5,7,9 then it goes to else
				//bourders update again
				easyObject.arrayLabel.get(1).setBounds(148, 120, 36, 10);
			}
			// as the s1 is clicking we don't have to check the power suppy 
			callingChecking(1,easyObject);
			// s11 is incremented to enter the if condition alternatively
			easyObject.s11++;
        }
    });
		
		// when second switch is clicked
		easyObject.arrayLabel.get(2).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
           
            // degree is incremented to 90
            easyObject.s2+=90;
            //update the degree in degree arraylist
            easyObject.degree.set(1,easyObject.s2);
            
            // change the boarder of label
            if(easyObject.s21%2==0){
				
				// change the layout to 90 degrees 
				easyObject.arrayLabel.get(2).setBounds(160, 136, 10, 40);
			}
			else{
				
				// change the boarder layout to 180 degrees 
				easyObject.arrayLabel.get(2).setBounds(148, 158, 36, 10);
			}
			
			// as the second switch don't effect the first switch we don't have to update the first swicth when second switch is clicked
			//So we have to check the buttons after second switch so the starting index is 2
			callingChecking(2,easyObject);
			easyObject.s21++;
        }
    });
	
	// 3rd Jbutton 
	easyObject.arrayLabel.get(3).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // switch3 degree is incremented by 90
            easyObject.s3+=90;
            easyObject.degree.set(2,easyObject.s3);
            
            if(easyObject.s31%2==0){
				easyObject.arrayLabel.get(3).setBounds(160, 172, 10, 40);
			}
			else{
				easyObject.arrayLabel.get(3).setBounds(148, 196, 36, 10);
				
			}
			// check the switches from the 3rd switch
			callingChecking(3,easyObject);
			easyObject.s31++;
        }
    });
    //4th switch
    easyObject.arrayLabel.get(4).addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            
            easyObject.s4+=90;
            easyObject.degree.set(3,easyObject.s4);
            
            if(easyObject.s41%2==0){
				
				easyObject.arrayLabel.get(4).setBounds(160, 206, 10, 40);
			}
			else{
				
				easyObject.arrayLabel.get(4).setBounds(148, 224, 36, 10);
			}
			
			
			callingChecking(4,easyObject);
			easyObject.s41++;
        }
    });
	
	}
	
	public static void callingChecking(int startIndex,Easy easyObject){
		
		//this method will return true if the bulb glows 
		if (EasyModel.switchCheck(startIndex,easyObject)){	
			// as the game is end set the easyGame1 to false 
			easyObject.easyGame1=false;
			// enable the next button
			easyObject.next.setEnabled(!easyObject.easyGame1);
			
			// if medium game isn't finished then "next" Jbutton will open medium game
			if(easyObject.mediumGame1){
				easyObject.next.addActionListener(e -> Medium.medium1(easyObject.jframe,easyObject.easyGame1,easyObject.hardGame1));
			}
			// if hard game isn't finished then "next" Jbutton will open hard game
			else if(easyObject.hardGame1){
				easyObject.next.addActionListener(e -> Hard.hard1(easyObject.jframe,easyObject.easyGame1,easyObject.mediumGame1));
			}
			// if all games are completed then "next" text on Jbutton is changed to Done and returns to level panel
			else{
				easyObject.next.setText("Done");
				easyObject.next.addActionListener(e -> Level.levelSelection(easyObject.jframe,easyObject.easyGame1,easyObject.mediumGame1, easyObject.hardGame1));
			}
			
		}
	}

}
