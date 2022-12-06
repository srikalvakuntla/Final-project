package projectGradle.model;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

//import projectGradle.RotatedIcon;
import projectGradle.view.Hard;

public class HardModel {
	
	public static ArrayList hardImageIcon(){
		ArrayList<ImageIcon> imageIcon = new ArrayList<ImageIcon>();
		imageIcon.add(new ImageIcon("tswitch.png"));
		imageIcon.add(new ImageIcon("offswitch.png"));
		imageIcon.add(new ImageIcon("bulb.png"));
		imageIcon.add(new ImageIcon("tswitch.png"));//empty for first
		imageIcon.add(new ImageIcon("tswitch.png"));// second arraylist
		imageIcon.add(new ImageIcon("offswitch.png"));
		imageIcon.add(new ImageIcon("tswitch.png"));
		imageIcon.add(new ImageIcon("bulbL.png"));
		imageIcon.add(new ImageIcon("tswitch.png"));//empty
		imageIcon.add(new ImageIcon("tswitch.png"));
		imageIcon.add(new ImageIcon("offswitch.png"));
		imageIcon.add(new ImageIcon("tswitch.png"));
		imageIcon.add(new ImageIcon("offswitch.png"));
		imageIcon.add(new ImageIcon("offswitch.png"));
		imageIcon.add(new ImageIcon("bulb.png"));
		return imageIcon;
	}
	
	public static ArrayList hardInvertedImageIcon(){
		ArrayList<ImageIcon> invertImageIcon = new ArrayList<ImageIcon>();
		invertImageIcon.add(new ImageIcon("ontswitch.png"));
		invertImageIcon.add(new ImageIcon("onswitch.png"));
		invertImageIcon.add(new ImageIcon("onbulb.png"));
		invertImageIcon.add(new ImageIcon("ontswitch.png"));//empty
		invertImageIcon.add(new ImageIcon("ontswitch.png"));
		invertImageIcon.add(new ImageIcon("onswitch.png"));
		invertImageIcon.add(new ImageIcon("ontswitch.png"));
		invertImageIcon.add(new ImageIcon("onbulbL.png"));
		invertImageIcon.add(new ImageIcon("ontswitch.png"));//empty
		invertImageIcon.add(new ImageIcon("ontswitch.png"));
		invertImageIcon.add(new ImageIcon("onswitch.png"));
		invertImageIcon.add(new ImageIcon("ontswitch.png"));
		invertImageIcon.add(new ImageIcon("onswitch.png"));
		invertImageIcon.add(new ImageIcon("onswitch.png"));
		invertImageIcon.add(new ImageIcon("onbulb.png"));
		
		return invertImageIcon;
	}
	
	public static ArrayList hardDegree(){
		ArrayList<Integer> degree = new ArrayList<Integer>();
		for(int i=0; i<15; i++){
			
			if(i==6 || i==11){
				degree.add(90);
			}
			else{
				degree.add(0);}
	}
		return degree;
		
	}
	
	public static ArrayList hardBoolean(){
		ArrayList<Boolean> b = new ArrayList<Boolean>();
		for(int i=0; i<15;i++){
			if(i==0 || i== 4 || i==9){
				b.add(true);
			}
			else{
				b.add(false);
			}
			
		}
		return b;
	}
	
	public static boolean intersects(JLabel testa, JLabel testb){
			Rectangle rectB = testb.getBounds();

			Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

			return (result.getWidth() > 0 && result.getHeight() > 0);
	}
	
	// checks if the labels are over laped and glow the switchs and bulb
	public static void checkh1(int startIndex, Hard hardObject, int endIndex){
		
		for( int i= startIndex;i<endIndex;i++){
			
					if (i==endIndex-1){
						
						if( hardObject.arrayOnOff.get(i-1) & intersects(hardObject.arrayLabel.get(i),hardObject.arrayLabel.get(i-1))){
							hardObject.arrayLabel.get(i).setIcon(hardObject.invertImageIcon.get(i-1));
							if ( endIndex == 4){
								hardObject.bulb1=true;
							}
							else if( endIndex ==9){
								hardObject.bulb2=true;
							}
							else{
								hardObject.bulb3=true;
							}
						}
						else{
							hardObject.arrayLabel.get(i).setIcon(hardObject.imageIcon.get(i-1));
							if ( endIndex == 4){
								hardObject.bulb1=false;
							}
							else if( endIndex ==9){
								hardObject.bulb2=false;
							}
							else{
								hardObject.bulb3=false;
							}
						}
					}
					else if(hardObject.arrayOnOff.get(i-1) & intersects(hardObject.arrayLabel.get(i),hardObject.arrayLabel.get(i-1))){
						hardObject.arrayLabel.get(i).setIcon(new RotatedIcon(hardObject.invertImageIcon.get(i-1), hardObject.degree.get(i-1)));
						hardObject.arrayOnOff.set(i,true);
					}
					else{
						hardObject.arrayLabel.get(i).setIcon(new RotatedIcon(hardObject.imageIcon.get(i-1), hardObject.degree.get(i-1)));
						hardObject.arrayOnOff.set(i,false);
					}
					
				}
		
		
	}
}
