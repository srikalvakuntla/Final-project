package projectGradle.model;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

//import projectGradle.RotatedIcon;
import projectGradle.view.Medium;


public class MediumModel{

	// create a list of degrees 
	public static ArrayList mediumDegree(){
		ArrayList<Integer> degree = new ArrayList<Integer>();
		for (int i=0;i<12;i++){
			
			// as the second bulb is 90 shifted it degrees needs to turn 90 degrees
			if(i>5){
				degree.add(90);
			}
			else{
				degree.add(0);
				}
		}
		return degree;
	}
	
	// resturns the arraylist of boolean 
	public static ArrayList mediumBoolean(){
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		
		// power supply is at 1st and 6th position so it needs to be true 
		boolean a = true;
		for( int i=0;i<12;i++){
			
			if (i==6){
				a=true;
			}
			b.add(a);
			a=false;
		}
		return b;
	}
	
	// creates the arraylist of Images to select the vertical bulb and horizontal bulbs 
	public static ArrayList mediumImage(){
		ArrayList<ImageIcon> images = new ArrayList<ImageIcon>();
		images.add(new ImageIcon("bulb.png"));
		images.add(new ImageIcon("onbulb.png"));
		images.add(new ImageIcon("bulbL.png"));
		images.add(new ImageIcon("onbulbL.png"));
		
		return images;
		
	}
	
	// creates the array list of jlabel 
	public static ArrayList mediumLable(){
		ArrayList<JLabel> arrayLabel = new ArrayList<JLabel>();
		
		// creating the image icon
		ImageIcon s1 = new ImageIcon("offswitch.png");
		ImageIcon s2 = new ImageIcon("offswitch.png");
		ImageIcon s3 = new ImageIcon("offswitch.png");
		ImageIcon s4 = new ImageIcon("offswitch.png");
		ImageIcon power1 = new ImageIcon("power.png");
		ImageIcon bulbOff1 = new ImageIcon("bulb.png");
		
		// creating image icons for second bulb
		ImageIcon p2 = new ImageIcon("offswitch.png");
		ImageIcon p3 = new ImageIcon("offswitch.png");
		ImageIcon p4 = new ImageIcon("offswitch.png");
		ImageIcon power2 = new ImageIcon("power.png");
		ImageIcon bulbOff2 = new ImageIcon("bulb.png");
		
		// creating the Jlabel for the image icons 
		JLabel labels1 = new JLabel();
		JLabel labels2 = new JLabel();
		JLabel labels3 = new JLabel();
		JLabel labels4 = new JLabel();
		JLabel powerLabel1= new JLabel();
		JLabel bulbLabel1 = new JLabel();
		JLabel labelp2 = new JLabel();
		JLabel labelp3 = new JLabel();
		JLabel labelp4 = new JLabel();
		JLabel powerLabel2 = new JLabel();
		JLabel bulbLabel2 = new JLabel();
		
		//setting the bounds for the image icon
		labels1.setBounds(78, 120, 36, 10);
		labels2.setBounds(78, 158, 36, 10);
		labels3.setBounds(78, 196, 36, 10);
		labels4.setBounds(78, 224, 36, 10);
		powerLabel1.setBounds(65,23,60,80);
		bulbLabel1.setBounds(65,239,60,80);
		
		// stting the bounds for 2nd bulb 
		labelp2.setBounds(150, 350, 10, 36);
		labelp3.setBounds(186, 350, 10, 36);
		labelp4.setBounds(222, 350, 10, 36);
		powerLabel2.setBounds(54,340,80,60);
		bulbLabel2.setBounds(236,340,80,60);
		
		// adding the image icon to the label
		labels1.setIcon(s1);
		labels2.setIcon(s2);
		labels3.setIcon(s3);
		labels4.setIcon(s4);
		powerLabel1.setIcon(power1);
		bulbLabel1.setIcon(bulbOff1);
		
		// adding second image icons to the label
		labelp2.setIcon(new RotatedIcon(p2, 90));
		labelp3.setIcon(new RotatedIcon(p3, 90));
		labelp4.setIcon(new RotatedIcon (p4,90));
		powerLabel2.setIcon(new RotatedIcon(power2, 270));
		bulbLabel2.setIcon(new RotatedIcon (bulbOff2, 270));
		
		// adding label to the array list 
		arrayLabel.add(powerLabel1);
		arrayLabel.add(labels1);
		arrayLabel.add(labels2);
		arrayLabel.add(labels3);
		arrayLabel.add(labels4);
		arrayLabel.add(bulbLabel1);
		
		// adding second labels to arraylist
		arrayLabel.add(powerLabel2);
		arrayLabel.add(labelp2);
		arrayLabel.add(labelp3);
		arrayLabel.add(labelp4);
		arrayLabel.add(bulbLabel2);
		
		return arrayLabel;
	}
	
	
	
	public static boolean intersects(JLabel testa, JLabel testb){
			Rectangle rectB = testb.getBounds();

			Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

			return (result.getWidth() > 0 && result.getHeight() > 0);
	}
	
	// checks if the labels are over laped and glow the switchs and bulb
	//int bulb helps to get the bulb  
	public static void checkm1(int startIndex, Medium mediumObject, int endIndex,int bulb){
		
		// checks all the switches from the current switch to end 
		for( int i= startIndex;i<endIndex;i++){
			
					// bulbs are at the end 
					if (i==endIndex-1){
						
						// if previos switch touchs bulb and it is on then this condition is true
						if( mediumObject.arrayOnOff.get(i-1) & intersects(mediumObject.arrayLabel.get(i),mediumObject.arrayLabel.get(i-1))){
							
							// Image --> { OFF Vertical Bulb, ON vertical bulb, OFF Horizontal bulb, ON Horizontal bulb}
							//if bulb -> 1 then we get ON ver bulb || if bulb is 3 then we get ON Horiz bulb
							mediumObject.arrayLabel.get(i).setIcon(mediumObject.images.get(bulb));
							
							// if start index is <7 then it's first bulb 
							 if (startIndex<7){
								mediumObject.bulb1=true;
							}
							
							// index is >7 then it is second bulb 
							else{
								mediumObject.bulb2=true;
							}
						}
						// switching the bulb OFF
						else{
							// Bulb -> 1 then bulb-1 which 0 which is OFF bulb similar bulb -> 3
							mediumObject.arrayLabel.get(i).setIcon(mediumObject.images.get(bulb-1));
							if (startIndex<7){
								mediumObject.bulb1=false;
							}
							else{
								mediumObject.bulb2=false;
							}		
						}
					}
					// if previos switch touchs the currect switch and the previos switch is ON
					else if(mediumObject.arrayOnOff.get(i-1) & intersects(mediumObject.arrayLabel.get(i),mediumObject.arrayLabel.get(i-1))){
						// update the seitch color and rotation
						mediumObject.arrayLabel.get(i).setIcon(new RotatedIcon(new ImageIcon("onswitch.png"), mediumObject.degree.get(i-1)));
						mediumObject.arrayOnOff.set(i,true);
					}
					else{
						// update the seitch color and rotationd
						mediumObject.arrayLabel.get(i).setIcon(new RotatedIcon(new ImageIcon("offswitch.png"), mediumObject.degree.get(i-1)));
						mediumObject.arrayOnOff.set(i,false);
					}
					
				}
	}
	
	
}
