import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class Pmx extends JPanel {

    private static final long serialVersionUID = 1L;
   int count;
    Timer t;
    int x;
    int []xc = {75,275,475,675};
    int []xinc ={1,1,1,1};
    int col =0;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;
    private JTextField textField_18;
    private JTextField textField_19;
    private JTextField textField_20;
    private JTextField textField_21;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_24;
    private JTextField textField_25;
    private JTextField textField_26;
    private JTextField textField_27;
    private JTextField textField_28;
    private JTextField textField_29;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_32;
    private JTextField textField_33;
    private JTextField textField_34;
    private JTextField textField_35;
    private JTextField textField_36;
    private JTextField textField_37;
    private JTextField textField_38;
    private JTextField textField_39;
    private JTextField textField_40;
    private JTextField textField_41;
    private JTextField textField_42;
    private JTextField textField_43;
    private JTextField textField_44;
    private JTextField textField_45;
    private JTextField textField_46;
    private JTextField textField_47;
    private JTextField textField_48;
    private JButton button;
    private JButton button_1;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pmx panel = new Pmx();
                panel.setPreferredSize(new Dimension(920, 680));
//                panel.animate();
                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
               
            }
        });
    }

    public Pmx() {
    	count=0;
    	 
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.RED);
        setOpaque(true);
		  t=new Timer(20, new ActionListener() {

	            @Override
	            
	            public void actionPerformed(ActionEvent e) {
	               
	               col=0;
	               xc[0]+=1; 
	               xc[1]+=1; 
	               xc[2]+=1; 
	               xc[3]+=1; 
	               
	            	for(int i=0;i<4;++i)
	               {
	            		if(xc[i]>780)
	            			{
	            			xc[i]= -19;
	            			
	            			}
	               }
	            	for(int i=0;i<4;++i)
	            	{
	            		if(xc[i]==75||xc[i]==275||xc[i]==475||xc[i]==675)
	            		{
	            		
	            			col =1;       			
	            			break;
	            		}
	            	}
	            	
	                repaint();
	              
	            	 }
	            	
	        });
        JButton btnClickMe = new JButton("START");
        btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnClickMe.setBounds(422, 506, 79, 36);
        btnClickMe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 count++;
        
        		 if(count%2==0)
        	        	t.stop();
        		 else
        			 t.start();
        	}
        });
        add(btnClickMe);
        
      
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(47, 11, 42, 20);
        add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(99, 11, 42, 20);
        add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(151, 11, 42, 20);
        add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(209, 11, 42, 20);
        add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(209, 42, 42, 20);
        add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(209, 73, 42, 20);
        add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(209, 104, 42, 20);
        add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(151, 104, 42, 20);
        add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setColumns(10);
        textField_9.setBounds(99, 104, 42, 20);
        add(textField_9);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(47, 104, 42, 20);
        add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(47, 73, 42, 20);
        add(textField_11);
        
        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(99, 73, 42, 20);
        add(textField_12);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(151, 73, 42, 20);
        add(textField_13);
        
        textField_14 = new JTextField();
        textField_14.setColumns(10);
        textField_14.setBounds(151, 42, 42, 20);
        add(textField_14);
        
        textField_15 = new JTextField();
        textField_15.setColumns(10);
        textField_15.setBounds(99, 42, 42, 20);
        add(textField_15);
        
        textField_16 = new JTextField();
        textField_16.setColumns(10);
        textField_16.setBounds(47, 42, 42, 20);
        add(textField_16);
        
        JLabel label = new JLabel("A");
        label.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label.setBounds(141, 129, 22, 17);
        add(label);
        
        JLabel label_1 = new JLabel("X");
        label_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_1.setBounds(299, 60, 22, 17);
        add(label_1);
        
        textField_17 = new JTextField();
        textField_17.setColumns(10);
        textField_17.setBounds(370, 11, 42, 20);
        add(textField_17);
        
        textField_18 = new JTextField();
        textField_18.setColumns(10);
        textField_18.setBounds(370, 42, 42, 20);
        add(textField_18);
        
        textField_19 = new JTextField();
        textField_19.setColumns(10);
        textField_19.setBounds(370, 73, 42, 20);
        add(textField_19);
        
        textField_20 = new JTextField();
        textField_20.setColumns(10);
        textField_20.setBounds(370, 104, 42, 20);
        add(textField_20);
        
        textField_21 = new JTextField();
        textField_21.setColumns(10);
        textField_21.setBounds(422, 104, 42, 20);
        add(textField_21);
        
        textField_22 = new JTextField();
        textField_22.setColumns(10);
        textField_22.setBounds(422, 73, 42, 20);
        add(textField_22);
        
        textField_23 = new JTextField();
        textField_23.setColumns(10);
        textField_23.setBounds(422, 42, 42, 20);
        add(textField_23);
        
        textField_24 = new JTextField();
        textField_24.setColumns(10);
        textField_24.setBounds(422, 11, 42, 20);
        add(textField_24);
        
        textField_25 = new JTextField();
        textField_25.setColumns(10);
        textField_25.setBounds(474, 11, 42, 20);
        add(textField_25);
        
        textField_26 = new JTextField();
        textField_26.setColumns(10);
        textField_26.setBounds(526, 11, 42, 20);
        add(textField_26);
        
        textField_27 = new JTextField();
        textField_27.setColumns(10);
        textField_27.setBounds(526, 42, 42, 20);
        add(textField_27);
        
        textField_28 = new JTextField();
        textField_28.setColumns(10);
        textField_28.setBounds(526, 73, 42, 20);
        add(textField_28);
        
        textField_29 = new JTextField();
        textField_29.setColumns(10);
        textField_29.setBounds(474, 104, 42, 20);
        add(textField_29);
        
        textField_30 = new JTextField();
        textField_30.setColumns(10);
        textField_30.setBounds(474, 73, 42, 20);
        add(textField_30);
        
        textField_31 = new JTextField();
        textField_31.setColumns(10);
        textField_31.setBounds(474, 42, 42, 20);
        add(textField_31);
        
        textField_32 = new JTextField();
        textField_32.setColumns(10);
        textField_32.setBounds(526, 104, 42, 20);
        add(textField_32);
        
        JLabel label_2 = new JLabel("B");
        label_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_2.setBounds(463, 129, 22, 17);
        add(label_2);
        
        JLabel label_3 = new JLabel("=");
        label_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_3.setBounds(596, 60, 27, 17);
        add(label_3);
        
        textField_33 = new JTextField();
        textField_33.setColumns(10);
        textField_33.setBounds(673, 11, 42, 20);
        add(textField_33);
        
        textField_34 = new JTextField();
        textField_34.setColumns(10);
        textField_34.setBounds(673, 42, 42, 20);
        add(textField_34);
        
        textField_35 = new JTextField();
        textField_35.setColumns(10);
        textField_35.setBounds(673, 73, 42, 20);
        add(textField_35);
        
        textField_36 = new JTextField();
        textField_36.setColumns(10);
        textField_36.setBounds(673, 104, 42, 20);
        add(textField_36);
        
        textField_37 = new JTextField();
        textField_37.setColumns(10);
        textField_37.setBounds(725, 104, 42, 20);
        add(textField_37);
        
        textField_38 = new JTextField();
        textField_38.setColumns(10);
        textField_38.setBounds(725, 73, 42, 20);
        add(textField_38);
        
        textField_39 = new JTextField();
        textField_39.setColumns(10);
        textField_39.setBounds(725, 42, 42, 20);
        add(textField_39);
        
        textField_40 = new JTextField();
        textField_40.setColumns(10);
        textField_40.setBounds(725, 11, 42, 20);
        add(textField_40);
        
        textField_41 = new JTextField();
        textField_41.setColumns(10);
        textField_41.setBounds(777, 11, 42, 20);
        add(textField_41);
        
        textField_42 = new JTextField();
        textField_42.setColumns(10);
        textField_42.setBounds(829, 11, 42, 20);
        add(textField_42);
        
        textField_43 = new JTextField();
        textField_43.setColumns(10);
        textField_43.setBounds(829, 42, 42, 20);
        add(textField_43);
        
        textField_44 = new JTextField();
        textField_44.setColumns(10);
        textField_44.setBounds(829, 73, 42, 20);
        add(textField_44);
        
        textField_45 = new JTextField();
        textField_45.setColumns(10);
        textField_45.setBounds(829, 104, 42, 20);
        add(textField_45);
        
        textField_46 = new JTextField();
        textField_46.setColumns(10);
        textField_46.setBounds(777, 104, 42, 20);
        add(textField_46);
        
        textField_47 = new JTextField();
        textField_47.setColumns(10);
        textField_47.setBounds(777, 73, 42, 20);
        add(textField_47);
        
        textField_48 = new JTextField();
        textField_48.setColumns(10);
        textField_48.setBounds(777, 42, 42, 20);
        add(textField_48);
        
        JLabel label_4 = new JLabel("C");
        label_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_4.setBounds(766, 129, 22, 17);
        add(label_4);
        
        button = new JButton("<<<");
        button.setFont(new Font("Tahoma", Font.BOLD, 14));
        button.setBounds(209, 506, 79, 36);
        add(button);
        
        button_1 = new JButton(">>>");
        button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        button_1.setBounds(636, 506, 79, 36);
        add(button_1);
        
        textField = new JTextField();
        textField.setBounds(47, 574, 824, 87);
        add(textField);
        textField.setColumns(10);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
       
        		g.setColor(Color.DARK_GRAY);
        		g.fillRect(47, 190, 824, 290);
        	        // Draw 4 processors 
        			
        		for(int i=0;i<4;++i)
            	{
            		if(xc[i]==75||xc[i]==275||xc[i]==475||xc[i]==675)
            		{
            		
            			col =1;       			
            			break;
            		}
            	}
        			if(col==0)
        	        g.setColor(Color.LIGHT_GRAY);
        			else if(col==1)
        			g.setColor(Color.YELLOW);
        			
        			g.fillOval(55,300,200, 100);
        	        g.fillOval(255,300,200, 100);        	       
        	        g.fillOval(455,300,200, 100);
        	        g.fillOval(655,300,200, 100);
        	        
        	        g.setColor(Color.BLUE);
        	        g.fillOval(75,300,160, 50);
        	        g.fillOval(275,300,160, 50);        	       
        	        g.fillOval(475,300,160, 50);
        	        g.fillOval(675,300,160, 50);
        	        
        	        g.setColor(Color.GREEN);
        	        g.fillOval(xc[0],350,160, 50);
        	        g.fillOval(xc[1],350,160, 50);        	       
        	        g.fillOval(xc[2],350,160, 50);
        	        g.fillOval(xc[3],350,160, 50);
        	        
        	        if(col==1)
                	{
                	try {
                		Thread.sleep(2000);
                	col=0;	
                	} 
                	catch (InterruptedException e1) {
					
                			}
                	}
        	        
        	     
        
      
        
        }
    }