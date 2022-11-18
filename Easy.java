import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Easy{
	 int s1 =0;
	 int s2 =0;
	 int s3 =0;
	 int s4 =0;
	 
	 int s11=2;
	 int s21=2;
	 int s31=2;
	 int s41=2;
	 
	 boolean a1=false;
	 boolean a2=false;
	 boolean a3=false;
	 boolean a4=false;
	 
	static void easy1(JFrame frame){
		frame.getContentPane().removeAll();
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		ImageIcon s1 = new ImageIcon("abc.png");
		ImageIcon s2 = new ImageIcon("abc.png");
		ImageIcon s3 = new ImageIcon("abc.png");
		ImageIcon s4 = new ImageIcon("abc.png");
		
		ImageIcon power = new ImageIcon("power.png");
		ImageIcon bulbOff = new ImageIcon("bulb.png");
		
		
		
		JLabel labels1 = new JLabel();
		JLabel labels2 = new JLabel();
		JLabel labels3 = new JLabel();
		JLabel labels4 = new JLabel();
		JLabel powerLabel= new JLabel();
		JLabel bulbLabel = new JLabel();
		
		labels1.setBounds(148, 120, 36, 10);
		labels2.setBounds(148, 158, 36, 10);
		labels3.setBounds(148, 196, 36, 10);
		labels4.setBounds(148, 224, 36, 10);
		powerLabel.setBounds(135,23,60,80);
		bulbLabel.setBounds(131,239,60,80);
		
		labels1.setIcon(s1);
		labels2.setIcon(s2);
		labels3.setIcon(s3);
		labels4.setIcon(s4);
		powerLabel.setIcon(power);
		bulbLabel.setIcon(bulbOff);
		
		panel.add(labels1);
		panel.add(labels2);
		panel.add(labels3);
		panel.add(labels4);
		panel.add(powerLabel);
		panel.add(bulbLabel);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
		//powerLabel.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		//labels1.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		//labels4.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 2));
		
		Easy le = new Easy();
		
		labels1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s1=90;
            
            if(le.s11%2==0){
				
				labels1.setBounds(160, 100, 10, 40);
			}
			else{
				
				labels1.setBounds(148, 120, 36, 10);
			}
			
			if(intersects(labels1,powerLabel)){
				le.a1=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), 90);
				labels1.setIcon(p1);
				if(intersects(labels1,labels2)){
					le.a2=true;
					labels2.setIcon(p1);
					if (intersects(labels2,labels3)){
						labels3.setIcon(p1);
						le.a3=true;
						if (intersects(labels4,labels3)){
							le.a4=true;
							labels4.setIcon(p1);
							if(intersects(bulbLabel,labels4)){
								bulbLabel.setIcon(new ImageIcon("on.png"));
			}
					}
					
					}
				}
			}
			else{
				le.a1=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), 0);
				labels1.setIcon(p1);
				labels2.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s2));
				labels3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s3));
				labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s4));
				bulbLabel.setIcon(new ImageIcon("bulb.png"));
				le.a2=false;
				le.a3=false;
				le.a4=false;
				
			}
			
			
			
			le.s11++;
        }
    });
		
		labels2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s2+=90;
            
            if(le.s21%2==0){
				
				labels2.setBounds(160, 136, 10, 40);
			}
			else{
				labels2.setBounds(148, 158, 36, 10);
			}
			
			if(intersects(labels1,labels2) && le.a1 ){
				le.a2=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), le.s2);
				labels2.setIcon(p1);
				
				if(intersects(labels2,labels3)){
						labels3.setIcon(p1);
						le.a3=true;
					if(intersects(labels3,labels4)){
						le.a4=true;
						labels4.setIcon(p1);
						if(intersects(bulbLabel,labels4)){
								bulbLabel.setIcon(new ImageIcon("on.png"));
			}
					
				}
				}
			}
			else{
				le.a2=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), le.s2);
				labels2.setIcon(p1);	
				labels3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s3));
				labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s4));
				bulbLabel.setIcon(new ImageIcon("bulb.png"));
				le.a3=false;
				le.a4=false;
				
				
			}
			le.s21++;
        }
    });
	
	
	labels3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s3+=90;
            
            if(le.s31%2==0){
				labels3.setBounds(160, 172, 10, 40);
			}
			else{
				labels3.setBounds(148, 196, 36, 10);
				
			}
			if(intersects(labels2,labels3) && le.a2 ){
				le.a3=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), le.s3);
				labels3.setIcon(p1);
				
				if(intersects(labels3,labels4)){
					labels4.setIcon(p1);
					le.a4=true;
					if(intersects(bulbLabel,labels4)){
								bulbLabel.setIcon(new ImageIcon("on.png"));
			}
				}
			}
			else{
				le.a3=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), le.s3);
				labels3.setIcon(p1);	
				labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s4));
				le.a4=false;
				bulbLabel.setIcon(new ImageIcon("bulb.png"));
			}
			
			le.s31++;
        }
    });
    
    labels4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s4+=90;
            
            if(le.s41%2==0){
				
				labels4.setBounds(159, 206, 10, 40);
			}
			else{
				
				labels4.setBounds(148, 224, 36, 10);
			}
			
			System.out.println(le.a3);
			if(intersects(labels3,labels4) && le.a3 ){
				le.a4=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"),le.s4);
				labels4.setIcon(p1);
				
				
			}
			else{
				le.a4=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), le.s4);
				labels4.setIcon(p1);	
				
			}
			
			if(intersects(bulbLabel,labels4) && le.a4 ){
				bulbLabel.setIcon(new ImageIcon("on.png"));
			}
			else{
				bulbLabel.setIcon(new ImageIcon("bulb.png"));
			}
			
			
			le.s41++;
        }
    });
	
	}

static boolean intersects(JLabel testa, JLabel testb){
		Rectangle rectB = testb.getBounds();

		Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

		return (result.getWidth() > 0 && result.getHeight() > 0);
}
}
