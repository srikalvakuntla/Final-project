package projectGradle;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class Medium{
	 int s1 =0;
	 int s2 =0;
	 int s3 =0;
	 int s4 =0;
	 
	 //
	 int p1 =0;
	 int p2 =0;
	 int p3 =0;
	 int p4 =0;
	 
	 int s11=2;
	 int s21=2;
	 int s31=2;
	 int s41=2;
	 
	 //
	 int p11=2;
	 int p21=2;
	 int p31=2;
	 int p41=2;
	 
	 boolean a1=false;
	 boolean a2=false;
	 boolean a3=false;
	 boolean a4=false;
	 
	static void medium1(JFrame frame){
		
		JButton back = new JButton("Back");
		back.setFont(new Font("Papyrus", Font.PLAIN, 20));
		back.setBounds(30, 500, 100, 50);
		back.setBackground(new Color(255,168,168));
		back.setOpaque(true);
		back.setBorderPainted(true);
		back.setBorder(BorderFactory.createLineBorder(Color.black,2));
		back.addActionListener(e -> Level.levelSelection(frame));
		
		JButton reset = new JButton("Reset");
		reset.setFont(new Font("Papyrus", Font.PLAIN, 20));
		reset.setBounds(250, 500, 100, 50);
		reset.setBackground(new Color(247,255,0));
		reset.setOpaque(true);
		reset.setBorderPainted(true);
		reset.setBorder(BorderFactory.createLineBorder(Color.black,2));
		reset.addActionListener(e -> Medium.medium1(frame));
		
		frame.getContentPane().removeAll();
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(107,146,255));
		
		ImageIcon s1 = new ImageIcon("abc.png");
		ImageIcon s2 = new ImageIcon("abc.png");
		ImageIcon s3 = new ImageIcon("abc.png");
		ImageIcon s4 = new ImageIcon("abc.png");
		ImageIcon power1 = new ImageIcon("power.png");
		ImageIcon bulbOff1 = new ImageIcon("bulb.png");
		
		//
		ImageIcon p1 = new ImageIcon("abc.png");
		ImageIcon p2 = new ImageIcon("abc.png");
		ImageIcon p3 = new ImageIcon("abc.png");
		ImageIcon p4 = new ImageIcon("abc.png");
		
		ImageIcon power2 = new ImageIcon("power.png");
		ImageIcon bulbOff2 = new ImageIcon("bulb.png");
		
		
		
		JLabel labels1 = new JLabel();
		JLabel labels2 = new JLabel();
		JLabel labels3 = new JLabel();
		JLabel labels4 = new JLabel();
		JLabel powerLabel1= new JLabel();
		JLabel bulbLabel1 = new JLabel();
		
		//
		JLabel labelp1 = new JLabel();
		JLabel labelp2 = new JLabel();
		JLabel labelp3 = new JLabel();
		JLabel labelp4 = new JLabel();
		
		JLabel powerLabel2 = new JLabel();
		JLabel bulbLabel2 = new JLabel();
		
		labels1.setBounds(78, 120, 36, 10);
		labels2.setBounds(78, 158, 36, 10);
		labels3.setBounds(78, 196, 36, 10);
		labels4.setBounds(78, 224, 36, 10);
		powerLabel1.setBounds(65,23,60,80);
		bulbLabel1.setBounds(65,239,60,80);
		
		//
		labelp1.setBounds(278, 120, 36, 10);
		labelp2.setBounds(278, 158, 36, 10);
		labelp3.setBounds(278, 196, 36, 10);
		labelp4.setBounds(278, 224, 36, 10);
		powerLabel2.setBounds(263,23,60,80);
		bulbLabel2.setBounds(263,239,60,80);
		
		labels1.setIcon(s1);
		labels2.setIcon(s2);
		labels3.setIcon(s3);
		labels4.setIcon(s4);
		powerLabel1.setIcon(power1);
		bulbLabel1.setIcon(bulbOff1);
		
		//
		labelp1.setIcon(p1);
		labelp2.setIcon(p2);
		labelp3.setIcon(p3);
		labelp4.setIcon(p4);
		powerLabel2.setIcon(power2);
		bulbLabel2.setIcon(bulbOff2);
		
		panel.add(labels1);
		panel.add(labels2);
		panel.add(labels3);
		panel.add(labels4);
		panel.add(powerLabel1);
		panel.add(bulbLabel1);
		panel.add(back);
		panel.add(reset);
		
		//
		panel.add(labelp1);
		panel.add(labelp2);
		panel.add(labelp3);
		panel.add(labelp4);
		panel.add(powerLabel2);
		panel.add(bulbLabel2);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setResizable(true);
		
		Medium le = new Medium();
		
		labels1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s1=90;
            
            if(le.s11%2==0){
				
				labels1.setBounds(90, 100, 10, 40);
			}
			else{
				
				labels1.setBounds(78, 120, 36, 10);
			}
			
			if(intersects(labels1,powerLabel1)){
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
							if(intersects(bulbLabel1,labels4)){
								bulbLabel1.setIcon(new ImageIcon("on.png"));
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
				bulbLabel1.setIcon(new ImageIcon("bulb.png"));
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
				
				labels2.setBounds(90, 136, 10, 40);
			}
			else{
				labels2.setBounds(78, 158, 36, 10);
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
						if(intersects(bulbLabel1,labels4)){
								bulbLabel1.setIcon(new ImageIcon("on.png"));
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
				bulbLabel1.setIcon(new ImageIcon("bulb.png"));
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
				labels3.setBounds(90, 172, 10, 40);
			}
			else{
				labels3.setBounds(78, 196, 36, 10);
				
			}
			if(intersects(labels2,labels3) && le.a2 ){
				le.a3=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), le.s3);
				labels3.setIcon(p1);
				
				if(intersects(labels3,labels4)){
					labels4.setIcon(p1);
					le.a4=true;
					if(intersects(bulbLabel1,labels4)){
								bulbLabel1.setIcon(new ImageIcon("on.png"));
			}
				}
			}
			else{
				le.a3=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), le.s3);
				labels3.setIcon(p1);	
				labels4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), le.s4));
				le.a4=false;
				bulbLabel1.setIcon(new ImageIcon("bulb.png"));
			}
			
			le.s31++;
        }
    });
    
    labels4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            le.s4+=90;
            
            if(le.s41%2==0){
				
				labels4.setBounds(90, 206, 10, 40);
			}
			else{
				
				labels4.setBounds(78, 224, 36, 10);
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
			
			if(intersects(bulbLabel1,labels4) && le.a4 ){
				bulbLabel1.setIcon(new ImageIcon("on.png"));
			}
			else{
				bulbLabel1.setIcon(new ImageIcon("bulb.png"));
			}
			
			
			le.s41++;
        }
    });
	
	
	
		Medium ls = new Medium();
	
		labelp1.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            ls.p1=90;
            
            if(ls.p11%2==0){
				
				labelp1.setBounds(290, 100, 10, 40);
			}
			else{
				
				labelp1.setBounds(278, 120, 36, 10);
			}
			
			if(intersects(labelp1,powerLabel2)){
				ls.a1=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), 90);
				labelp1.setIcon(p1);
				if(intersects(labelp1,labelp2)){
					ls.a2=true;
					labelp2.setIcon(p1);
					if (intersects(labelp2,labelp3)){
						labelp3.setIcon(p1);
						ls.a3=true;
						if (intersects(labelp4,labelp3)){
							ls.a4=true;
							labelp4.setIcon(p1);
							if(intersects(bulbLabel2,labelp4)){
								bulbLabel2.setIcon(new ImageIcon("on.png"));
					}
					}
					
					}
				}
			}
			else{
				ls.a1=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), 0);
				labelp1.setIcon(p1);
				labelp2.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p2));
				labelp3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p3));
				labelp4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p4));
				bulbLabel2.setIcon(new ImageIcon("bulb.png"));
				ls.a2=false;
				ls.a3=false;
				ls.a4=false;
				
			}
			
			
			
			ls.p11++;
        }
    });
		
		labelp2.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            ls.p2+=90;
            
            if(ls.p21%2==0){
				
				labelp2.setBounds(290, 136, 10, 40);
			}
			else{
				labelp2.setBounds(278, 158, 36, 10);
			}
			
			if(intersects(labelp1,labelp2) && ls.a1 ){
				ls.a2=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), ls.p2);
				labelp2.setIcon(p1);
				
				if(intersects(labelp2,labelp3)){
						labelp3.setIcon(p1);
						ls.a3=true;
					if(intersects(labelp3,labelp4)){
						ls.a4=true;
						labelp4.setIcon(p1);
						if(intersects(bulbLabel2,labelp4)){
								bulbLabel2.setIcon(new ImageIcon("on.png"));
			}
					
				}
				}
			}
			else{
				ls.a2=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), ls.p2);
				labelp2.setIcon(p1);	
				labelp3.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p3));
				labelp4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p4));
				bulbLabel2.setIcon(new ImageIcon("bulb.png"));
				ls.a3=false;
				ls.a4=false;
				
				
			}
			ls.p21++;
        }
    });
	
	
	labelp3.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            ls.p3+=90;
            
            if(ls.p31%2==0){
				labelp3.setBounds(290, 172, 10, 40);
			}
			else{
				labelp3.setBounds(278, 196, 36, 10);
				
			}
			if(intersects(labelp2,labelp3) && ls.a2 ){
				ls.a3=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"), ls.p3);
				labelp3.setIcon(p1);
				
				if(intersects(labelp3,labelp4)){
					labelp4.setIcon(p1);
					ls.a4=true;
					if(intersects(bulbLabel2,labelp4)){
								bulbLabel2.setIcon(new ImageIcon("on.png"));
			}
				}
			}
			else{
				ls.a3=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), ls.p3);
				labelp3.setIcon(p1);	
				labelp4.setIcon(new RotatedIcon(new ImageIcon("abc.png"), ls.p4));
				ls.a4=false;
				bulbLabel2.setIcon(new ImageIcon("bulb.png"));
			}
			
			ls.p31++;
        }
    });
    
    labelp4.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            
            ls.p4+=90;
            
            if(ls.p41%2==0){
				
				labelp4.setBounds(290, 206, 10, 40);
			}
			else{
				
				labelp4.setBounds(278, 224, 36, 10);
			}
			
			System.out.println(ls.a3);
			if(intersects(labelp3,labelp4) && ls.a3 ){
				ls.a4=true;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("dc.png"),ls.p4);
				labelp4.setIcon(p1);
				
				
			}
			else{
				ls.a4=false;
				RotatedIcon p1 = new RotatedIcon(new ImageIcon("abc.png"), ls.p4);
				labelp4.setIcon(p1);	
				
			}
			
			if(intersects(bulbLabel2,labelp4) && ls.a4 ){
				bulbLabel2.setIcon(new ImageIcon("on.png"));
			}
			else{
				bulbLabel2.setIcon(new ImageIcon("bulb.png"));
			}
			
			
			ls.p41++;
        }
    });
	
	}
static boolean intersects(JLabel testa, JLabel testb){
		Rectangle rectB = testb.getBounds();

		Rectangle result = SwingUtilities.computeIntersection(testa.getX(), testa.getY(), testa.getWidth(), testa.getHeight(), rectB);

		return (result.getWidth() > 0 && result.getHeight() > 0);
}
}
