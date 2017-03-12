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
import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class Pmx extends JPanel {

    private static final long serialVersionUID = 1L;
   int count;
    Timer t, t1;
    int x;
    
    int a[][] = new int[4][4];
    int b[][] = new int[4][4];
    int c[][] = new int[4][4];
    int []xc = {130,360,590,820};
    int []xinc ={1,1,1,1};
    int xyz ;
    int xz =0;
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
    private JTextField b_00;
    private JTextField b_10;
    private JTextField b_20;
    private JTextField b_30;
    private JTextField b_31;
    private JTextField b_21;
    private JTextField b_11;
    private JTextField b_01;
    private JTextField b_02;
    private JTextField b_03;
    private JTextField b_13;
    private JTextField b_23;
    private JTextField b_32;
    private JTextField b_22;
    private JTextField b_12;
    private JTextField b_33;
    private JTextField c_00;
    private JTextField c_10;
    private JTextField c_20;
    private JTextField c_30;
    private JTextField c_31;
    private JTextField c_21;
    private JTextField c_11;
    private JTextField c_01;
    private JTextField c_02;
    private JTextField c_03;
    private JTextField c_13;
    private JTextField c_23;
    private JTextField c_33;
    private JTextField c_32;
    private JTextField c_22;
    private JTextField c_12;
    private JTextField textField;

    public static void main(String[] args) throws Exception {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pmx panel = new Pmx();
                panel.setPreferredSize(new Dimension(1000, 690));
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

    public Pmx()  {
    	
    	
    	count=0;
    	 xz = 0;
        setLayout(null);
        setBackground(Color.lightGray);
        setForeground(Color.RED);
        setOpaque(true);
        
         t1 = new Timer(3000, new ActionListener() {

            @Override
            
            public void actionPerformed(ActionEvent e) {
            
            
          	 xz++;
            	if(xz!=4){
            		if(xz==1)
            		{
            			init();
            	         c_00.setText("" + c[0][0]);
            	         c_01.setText("" + c[0][1]);
            	         c_02.setText("" + c[0][2]);
            	         c_03.setText("" + c[0][3]);
            	         
            	         

            		}
            		if(xz==2)
            		{
            			c_00.setText("" + c[0][0]);
           	         c_01.setText("" + c[0][1]);
           	         c_02.setText("" + c[0][2]);
           	         c_03.setText("" + c[0][3]);
            	         c_10.setText("" + c[1][0]);
            	         c_11.setText("" + c[1][1]);
            	         c_12.setText("" + c[1][2]);
            	         c_13.setText("" + c[1][3]);
            	         
            	        

            		}
            		if(xz==3)
            		{
            			init();
            	         c_00.setText("" + c[0][0]);
            	         c_01.setText("" + c[0][1]);
            	         c_02.setText("" + c[0][2]);
            	         c_03.setText("" + c[0][3]);
            	         
            	         c_10.setText("" + c[1][0]);
            	         c_11.setText("" + c[1][1]);
            	         c_12.setText("" + c[1][2]);
            	         c_13.setText("" + c[1][3]);
            	         
            	         c_20.setText("" + c[2][0]);
            	         c_21.setText("" + c[2][1]);
            	         c_22.setText("" + c[2][2]);
            	         c_23.setText("" + c[2][3]);
            	         
            	         

            		}
            	t1.stop();
            	xyz =0;
            	repaint();
            	t.start();
            	}
            	else
            	{
            		
            		init();
            	         c_00.setText("" + c[0][0]);
            	         c_01.setText("" + c[0][1]);
            	         c_02.setText("" + c[0][2]);
            	         c_03.setText("" + c[0][3]);
            	         
            	         c_10.setText("" + c[1][0]);
            	         c_11.setText("" + c[1][1]);
            	         c_12.setText("" + c[1][2]);
            	         c_13.setText("" + c[1][3]);
            	         
            	         c_20.setText("" + c[2][0]);
            	         c_21.setText("" + c[2][1]);
            	         c_22.setText("" + c[2][2]);
            	         c_23.setText("" + c[2][3]);
            	         
            	         c_30.setText("" + c[3][0]);
            	         c_31.setText("" + c[3][1]);
            	         c_32.setText("" + c[3][2]);
            	         c_33.setText("" + c[3][3]);

            		
            		t1.stop();
            	}
            } 
            
        } );
		  t=new Timer(20, new ActionListener() {

	            @Override
	            
	            public void actionPerformed(ActionEvent e) {
	               
	               
	               xc[0]+=1; 
	               xc[1]+=1; 
	               xc[2]+=1; 
	               xc[3]+=1; 
	               
	            	for(int i=0;i<4;++i)
	               {
	            		if(xc[i]>1000)
	            			{
	            			xc[i]= 81;
	            			
	            			}
	               }
	            	if(xc[0]!=235||xc[1]!=235||xc[2]!=235||xc[3]!=235)
	            		xyz=0;
	            	for(int i=0;i<4;++i)
	            	{
	            		if(xc[i]==235||xc[i]==465||xc[i]==695||xc[i]==925)
	            		{
	            			xyz = 1;
	            			System.out.println("0 =" + xc[0] + " 1 =" + xc[1] + " 2 =" + xc[2] + " 3 =" + xc[3]);
	            			break;
	            		}
	            	}
	            	
	                repaint();
	                if(xyz==1){
	               
	                	t.stop();
	                	t1.start();
	                
	              
	                }	
	                if(xz==4)
	                	t.stop();
	            }
	            	
	        });
        JButton btnClickMe = new JButton("START");
        btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnClickMe.setBounds(47, 550, 79, 36);
        btnClickMe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		 count++;
        
        		 if(count%2==0)
        	        	t.stop();
        		 else
        		 { 
        			 
        		 	init();
        			 
        			t.start();		 
        		 }
        }
        	});
        add(btnClickMe);
        
      
        
        textField_1 = new JTextField();
        textField_1.setText("1");
        textField_1.setColumns(10);
        textField_1.setBounds(47, 11, 42, 20);
        add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setText("2");
        textField_2.setColumns(10);

        textField_2.setBounds(99, 11, 42, 20);
        add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setText("3");
        textField_3.setColumns(10);
        textField_3.setBounds(151, 11, 42, 20);
        add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setText("6");
        textField_4.setColumns(10);
        textField_4.setBounds(209, 11, 42, 20);
        add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setText("8");
        textField_5.setColumns(10);
        textField_5.setBounds(209, 42, 42, 20);
        add(textField_5);
        
        textField_6 = new JTextField();
        textField_6.setText("16");
        textField_6.setColumns(10);
        textField_6.setBounds(209, 73, 42, 20);
        add(textField_6);
        
        textField_7 = new JTextField();
        textField_7.setText("67");
        textField_7.setColumns(10);
        textField_7.setBounds(209, 104, 42, 20);
        add(textField_7);
        
        textField_8 = new JTextField();
        textField_8.setText("-71");
        textField_8.setColumns(10);
        textField_8.setBounds(151, 104, 42, 20);
        add(textField_8);
        
        textField_9 = new JTextField();
        textField_9.setText("-3");
        textField_9.setColumns(10);
        textField_9.setBounds(99, 104, 42, 20);
        add(textField_9);
        
        textField_10 = new JTextField();
        textField_10.setText("5");
        textField_10.setColumns(10);
        textField_10.setBounds(47, 104, 42, 20);
        add(textField_10);
        
        textField_11 = new JTextField();
        textField_11.setText("7");
        textField_11.setColumns(10);
        textField_11.setBounds(47, 73, 42, 20);
        add(textField_11);
        
        textField_12 = new JTextField();
        textField_12.setText("32");
        textField_12.setColumns(10);
        textField_12.setBounds(99, 73, 42, 20);
        add(textField_12);
        
        textField_13 = new JTextField();
        textField_13.setText("-21");
        textField_13.setColumns(10);
        textField_13.setBounds(151, 73, 42, 20);
        add(textField_13);
        
        textField_14 = new JTextField();
        textField_14.setText("12");
        textField_14.setColumns(10);
        textField_14.setBounds(151, 42, 42, 20);
        add(textField_14);
        
        textField_15 = new JTextField();
        textField_15.setText("-9");
        textField_15.setColumns(10);
        textField_15.setBounds(99, 42, 42, 20);
        add(textField_15);
        
        textField_16 = new JTextField();
        textField_16.setText("54");
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
        
        b_00 = new JTextField();
        b_00.setText("-8");
        b_00.setColumns(10);
        b_00.setBounds(370, 11, 42, 20);
        add(b_00);
        
        b_10 = new JTextField();
        b_10.setText("1");
        b_10.setColumns(10);
        b_10.setBounds(370, 42, 42, 20);
        add(b_10);
        
        b_20 = new JTextField();
        b_20.setText("-8");
        b_20.setColumns(10);
        b_20.setBounds(370, 73, 42, 20);
        add(b_20);
        
        b_30 = new JTextField();
        b_30.setText("-13");
        b_30.setColumns(10);
        b_30.setBounds(370, 104, 42, 20);
        add(b_30);
        
        b_31 = new JTextField();
        b_31.setText("3");
        b_31.setColumns(10);
        b_31.setBounds(422, 104, 42, 20);
        add(b_31);
        
        b_21 = new JTextField();
        b_21.setText("32");
        b_21.setColumns(10);
        b_21.setBounds(422, 73, 42, 20);
        add(b_21);
        
        b_11 = new JTextField();
        b_11.setText("-9");
        b_11.setColumns(10);
        b_11.setBounds(422, 42, 42, 20);
        add(b_11);
        
        b_01 = new JTextField();
        b_01.setText("7");
        b_01.setColumns(10);
        b_01.setBounds(422, 11, 42, 20);
        add(b_01);
        
        b_02 = new JTextField();
        b_02.setText("23");
        b_02.setColumns(10);
        b_02.setBounds(474, 11, 42, 20);
        add(b_02);
        
        b_03 = new JTextField();
        b_03.setText("6");
        b_03.setColumns(10);
        b_03.setBounds(526, 11, 42, 20);
        add(b_03);
        
        b_13 = new JTextField();
        b_13.setText("4");
        b_13.setColumns(10);
        b_13.setBounds(526, 42, 42, 20);
        add(b_13);
        
        b_23 = new JTextField();
        b_23.setText("89");
        b_23.setColumns(10);
        b_23.setBounds(526, 73, 42, 20);
        add(b_23);
        
        b_32 = new JTextField();
        b_32.setText("-14");
        b_32.setColumns(10);
        b_32.setBounds(474, 104, 42, 20);
        add(b_32);
        
        b_22 = new JTextField();
        b_22.setText("12");
        b_22.setColumns(10);
        b_22.setBounds(474, 73, 42, 20);
        add(b_22);
        
        b_12 = new JTextField();
        b_12.setText("10");
        b_12.setColumns(10);
        b_12.setBounds(474, 42, 42, 20);
        add(b_12);
        
        b_33 = new JTextField();
        b_33.setText("72");
        b_33.setColumns(10);
        b_33.setBounds(526, 104, 42, 20);
        add(b_33);
        
        JLabel label_2 = new JLabel("B");
        label_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_2.setBounds(463, 129, 22, 17);
        add(label_2);
        
        JLabel label_3 = new JLabel("=");
        label_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_3.setBounds(596, 60, 27, 17);
        add(label_3);
        
        c_00 = new JTextField();
        c_00.setEditable(false);
        c_00.setColumns(10);
        c_00.setBounds(673, 11, 42, 20);
        add(c_00);
        
        c_10 = new JTextField();
        c_10.setEditable(false);
        c_10.setColumns(10);
        c_10.setBounds(673, 42, 42, 20);
        add(c_10);
        
        c_20 = new JTextField();
        c_20.setEditable(false);
        c_20.setColumns(10);
        c_20.setBounds(673, 73, 42, 20);
        add(c_20);
        
        c_30 = new JTextField();
        c_30.setEditable(false);
        c_30.setColumns(10);
        c_30.setBounds(673, 104, 42, 20);
        add(c_30);
        
        c_31 = new JTextField();
        c_31.setEditable(false);
        c_31.setColumns(10);
        c_31.setBounds(725, 104, 42, 20);
        add(c_31);
        
        c_21 = new JTextField();
        c_21.setEditable(false);
        c_21.setColumns(10);
        c_21.setBounds(725, 73, 42, 20);
        add(c_21);
        
        c_11 = new JTextField();
        c_11.setEditable(false);
        c_11.setColumns(10);
        c_11.setBounds(725, 42, 42, 20);
        add(c_11);
        
        c_01 = new JTextField();
        c_01.setEditable(false);
        c_01.setColumns(10);
        c_01.setBounds(725, 11, 42, 20);
        add(c_01);
        
        c_02 = new JTextField();
        c_02.setEditable(false);
        c_02.setColumns(10);
        c_02.setBounds(777, 11, 42, 20);
        add(c_02);
        
        c_03 = new JTextField();
        c_03.setEditable(false);
        c_03.setColumns(10);
        c_03.setBounds(829, 11, 42, 20);
        add(c_03);
        
        c_13 = new JTextField();
        c_13.setEditable(false);
        c_13.setColumns(10);
        c_13.setBounds(829, 42, 42, 20);
        add(c_13);
        
        c_23 = new JTextField();
        c_23.setEditable(false);
        c_23.setColumns(10);
        c_23.setBounds(829, 73, 42, 20);
        add(c_23);
        
        c_33 = new JTextField();
        c_33.setEditable(false);
        c_33.setColumns(10);
        c_33.setBounds(829, 104, 42, 20);
        add(c_33);
        
        c_32 = new JTextField();
        c_32.setEditable(false);
        c_32.setColumns(10);
        c_32.setBounds(777, 104, 42, 20);
        add(c_32);
        
        c_22 = new JTextField();
        c_22.setEditable(false);
        c_22.setColumns(10);
        c_22.setBounds(777, 73, 42, 20);
        add(c_22);
        
        c_12 = new JTextField();
        c_12.setEditable(false);
        c_12.setColumns(10);
        c_12.setBounds(777, 42, 42, 20);
        add(c_12);
        
        JLabel label_4 = new JLabel("C");
        label_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_4.setBounds(766, 129, 22, 17);
        add(label_4);
        
        textField = new JTextField();
        textField.setBounds(57, 585, 882, 105);
        add(textField);
        textField.setColumns(10);
        
    

    }

    void init() 
    {
    	
    	 a[0][0] = Integer.parseInt(textField_1.getText());
         a[0][1] = Integer.parseInt(textField_2.getText());
         a[0][2] = Integer.parseInt(textField_3.getText());
         a[0][3] = Integer.parseInt(textField_4.getText());
         
         a[1][0] = Integer.parseInt(textField_16.getText());
         a[1][1] = Integer.parseInt(textField_15.getText());
         a[1][2] = Integer.parseInt(textField_14.getText());
         a[1][3] = Integer.parseInt(textField_5.getText());
         
         a[2][0] = Integer.parseInt(textField_11.getText());
         a[2][1] = Integer.parseInt(textField_12.getText());
         a[2][2] = Integer.parseInt(textField_13.getText());
         a[2][3] = Integer.parseInt(textField_6.getText());
         
         a[3][0] = Integer.parseInt(textField_10.getText());
         a[3][1] = Integer.parseInt(textField_9.getText());
         a[3][2] = Integer.parseInt(textField_8.getText());
         a[3][3] = Integer.parseInt(textField_7.getText());
         
         b[0][0] = Integer.parseInt(b_00.getText());
         b[0][1] = Integer.parseInt(b_01.getText());
         b[0][2] = Integer.parseInt(b_02.getText());
         b[0][3] = Integer.parseInt(b_03.getText());
         
         b[1][0] = Integer.parseInt(b_10.getText());
         b[1][1] = Integer.parseInt(b_11.getText());
         b[1][2] = Integer.parseInt(b_12.getText());
         b[1][3] = Integer.parseInt(b_13.getText());
         
         b[2][0] = Integer.parseInt(b_20.getText());
         b[2][1] = Integer.parseInt(b_21.getText());
         b[2][2] = Integer.parseInt(b_22.getText());
         b[2][3] = Integer.parseInt(b_23.getText());
         
         b[3][0] = Integer.parseInt(b_30.getText());
         b[3][1] = Integer.parseInt(b_31.getText());
         b[3][2] = Integer.parseInt(b_32.getText());
         b[3][3] = Integer.parseInt(b_33.getText());
         for(int m=0;m<4;++m)
        	 for(int l=0;m<4;++m)
        		 	c[m][l]=0;
         
         for(int i=0;i<4;++i)
         {
        	 for(int j=0;j<4;++j)
         
        	 {
        		 c[i][j] = 0;
        		 
        		 for(int k=0;k<4;++k)
        		 c[i][j]  = c[i][j] + a[i][k]*b[k][j];
        		 
        		 System.out.println("a[i][j] = " + a[i][j] + "b[i][j] = " + b[i][j] + "c[i][j] = " + c[i][j] + "i = " + i + "j = " + j);
        	 }
         }
         
    }
    @Override
    public void paintComponent(Graphics g)  {
        super.paintComponent(g);
       
        		g.setColor(Color.DARK_GRAY);
        		g.fill3DRect(47, 190, 950, 380, true);
        	        // Draw 4 processors 
        			
        		g.setFont(new Font("TimesRoman", Font.BOLD, 26)); 
        		
        	        g.setColor(Color.GRAY);
        			g.fill3DRect(65,275,220, 270, true);
        	        g.fill3DRect(295,275,220, 270, true);        	       
        	        g.fill3DRect(525,275,220, 270, true);
        	        g.fill3DRect(755,275,220, 270, true);
        	        
        	        g.setColor(Color.white);
        	        g.fill3DRect(75,300,160, 60, false);
        	        	g.fill3DRect(75, 300, 40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_1.getText(), 80, 340);
        	        	g.setColor(Color.WHITE);
        	        	g.fill3DRect(115,300, 40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_2.getText(), 120, 340);
        	        	g.setColor(Color.WHITE);
        	        	g.fill3DRect(155, 300, 40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_3.getText(), 160, 340);
        	        	g.setColor(Color.WHITE);
        	        	g.fill3DRect(195, 300, 40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_4.getText(), 200, 340);
        	        	g.setColor(Color.WHITE);
        	        g.fill3DRect(305,300,160, 60, true);  
        	        	g.fill3DRect(305,300,40, 60, true);
        	        	g.fill3DRect(345,300,40, 60, true); 
        	        	g.fill3DRect(385,300,40, 60, true); 
        	        	g.fill3DRect(425,300,40, 60, true); 
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_16.getText(), 310, 340);
        	        	g.drawString(textField_15.getText(), 350, 340);
        	        	g.drawString(textField_14.getText(), 390, 340);
        	        	g.drawString(textField_5.getText(), 430, 340);
        	        	g.setColor(Color.white);
        	        g.fill3DRect(535,300,160, 60, true);
        	        	g.fill3DRect(535,300,40, 60, true);
        	        	g.fill3DRect(575,300,40, 60, true);
        	        	g.fill3DRect(615,300,40, 60, true);
        	        	g.fill3DRect(655,300,40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_11.getText(), 540, 340);
        	        	g.drawString(textField_12.getText(), 580, 340);
        	        	g.drawString(textField_13.getText(), 620, 340);
        	        	g.drawString(textField_6.getText(), 660, 340);
        	        	g.setColor(Color.white);
        	        g.fill3DRect(765,300,160, 60, true);
        	        	g.fill3DRect(765,300,40, 60, true);
        	        	g.fill3DRect(805,300,40, 60, true);
        	        	g.fill3DRect(845,300,40, 60, true);
        	        	g.fill3DRect(885,300,40, 60, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(textField_10.getText(), 770, 340);
        	        	g.drawString(textField_9.getText(), 810, 340);
        	        	g.drawString(textField_8.getText(), 850, 340);
        	        	g.drawString(textField_7.getText(), 890, 340);
        	        	g.setColor(Color.white);
        	        	
        	        g.setColor(Color.cyan);
        	        g.fill3DRect(xc[0],360,40, 160, true);
        	        	g.fill3DRect(xc[0], 360, 40, 40, true);
        	        	g.fill3DRect(xc[0], 400, 40, 40, true);
        	        	g.fill3DRect(xc[0], 440, 40, 40, true);
        	        	g.fill3DRect(xc[0], 480, 40, 40, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(b_00.getText(), xc[0] + 5, 380);
        	        	g.drawString(b_10.getText(), xc[0] + 5, 420);
        	        	g.drawString(b_20.getText(), xc[0] + 5, 460);
        	        	g.drawString(b_30.getText(), xc[0] + 5, 500);
        	        	g.setColor(Color.cyan);
        	        	
        	        g.fill3DRect(xc[1],360,40, 160, true);    
        	        	g.fill3DRect(xc[1],360,40,40, true);
        	        	 g.fill3DRect(xc[1],400,40, 40, true);
        	        	 g.fill3DRect(xc[1],440,40, 40, true);
        	        	 g.fill3DRect(xc[1],480,40, 40, true);
        	        	 g.setColor(Color.black);
        	        	 g.drawString(b_01.getText(), xc[1] + 5, 380);
         	        	g.drawString(b_11.getText(), xc[1] + 5, 420);
         	        	g.drawString(b_21.getText(), xc[1] + 5, 460);
         	        	g.drawString(b_31.getText(), xc[1] + 5, 500);
         	        	g.setColor(Color.cyan);
        	        g.fill3DRect(xc[2],360,40, 160, true);
        	        	g.fill3DRect(xc[2],360,40,40, true);
        	        	g.fill3DRect(xc[2],400,40, 40, true);
        	        	g.fill3DRect(xc[2],440,40, 40, true);
        	        	g.fill3DRect(xc[2],480,40, 40, true);
        	        	g.setColor(Color.black);
        	        	g.drawString(b_02.getText(), xc[2] + 5, 380);
        	        	g.drawString(b_12.getText(), xc[2] + 5, 420);
        	        	g.drawString(b_22.getText(), xc[2] + 5, 460);
        	        	g.drawString(b_32.getText(), xc[2] + 5, 500);
        	        	g.setColor(Color.cyan);
        	        g.fill3DRect(xc[3],360,40, 160, true);
        	        	g.fill3DRect(xc[3],360,40,40, true);
        	        	g.fill3DRect(xc[3],400,40, 40, true);
        	        	g.fill3DRect(xc[3],440,40, 40, true);
   	        	 		g.fill3DRect(xc[3],480,40, 40, true);
   	        	 	g.setColor(Color.black);
    	        	g.drawString(b_03.getText(), xc[3] + 5, 380);
    	        	g.drawString(b_13.getText(), xc[3] + 5, 420);
    	        	g.drawString(b_23.getText(), xc[3] + 5, 460);
    	        	g.drawString(b_33.getText(), xc[3] + 5, 500);
    	        	
   	        	 	
        	     if(xyz==1){
        	        	System.out.println("Entered the col");
            			g.setColor(Color.red);
            			
            			g.drawLine(95, 360, 235, 500);
            			g.drawLine(325, 360, 465, 500);
            			g.drawLine(555, 360, 695, 500);
            			g.drawLine(785, 360, 925, 500);
            			
            			g.drawLine(135, 360, 235, 460);
            			g.drawLine(365, 360, 465, 460);
            			g.drawLine(595, 360, 695, 460);
            			g.drawLine(825, 360, 925, 460);
            			
            			g.drawLine(175, 360, 235, 420);
            			g.drawLine(405, 360, 465, 420);
            			g.drawLine(635, 360, 695, 420);
            			g.drawLine(865, 360, 925, 420);
            			
            			g.drawLine(215, 360, 235, 380);
            			g.drawLine(445, 360, 465, 380);
            			g.drawLine(675, 360, 695, 380);
            			g.drawLine(905, 360, 925, 380);
            			
        	     }
        	     
        
      
        
        }
    }