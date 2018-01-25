package jbc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;


public class jbc1 extends JPanel {

    private static final long serialVersionUID = 1L;
    private int [][]cx;
    private int ite = 1;
    private int [][]cy;
    private int cw = 75;
    private int ch = 75;
    private int cr=30;
    private int xinc = 1;
    private int yinc = 1;
    private int count=0;
    private int n=0;
    private int [][]csx;
    private int [][]csy;
    private int [][]cslx;
    private int [][]csly;
    Timer t;
    
    public class pair
    {
    	public int x, y;
    	public pair(int a, int b)
    	{
    		x = a;
    		y = b;
    	}
    }

    pair A[][][] = new pair[10][10][10], B[][][] = new pair[10][3][3], mainBalls[][] = new pair[5][5], aBalls[][] = new pair[5][5], bBalls[][] = new pair[5][5]; 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                jbc1 panel = new jbc1();
                panel.setPreferredSize(new Dimension(900, 700));
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

    public jbc1()
    {
    	  JLabel label = new JLabel("");
    	  label.setForeground(Color.WHITE);
    	  label.setFont(new Font("Tempus Sans ITC", Font.BOLD, 30));
          label.setBounds(491, 132, 59, 36);
          add(label);
    	n = 3;
    	for(int k=0;k<2*n;k++)
    	{
        	for(int i=0;i<3;i++)
        	{
        		for(int j=0;j<3;j++)
        		{
        			A[k][i][j] = new pair(i, j);
        			B[k][i][j] = new pair(i, j);
        		}
        	}    		
    	}
    	int cur = 1;
    	for(int k=0;k<n-1;k++)
    	{
        	for(int i=0;i<n;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			if(i > k)
        			{
        				if(A[cur-1][i][j].y == 0)
        					A[cur][i][j] = new pair(A[cur-1][i][j].x, 2);
        				else
        					A[cur][i][j] = new pair(A[cur-1][i][j].x, A[cur-1][i][j].y - 1);
        			}
        			else
        			{
        				A[cur][i][j] = new pair(A[cur-1][i][j].x, A[cur-1][i][j].y);
        			}
        			if(j > k)
        			{
        				if(B[cur-1][i][j].x == 0)
        					B[cur][i][j] = new pair(2, B[cur-1][i][j].y);
        				else
        					B[cur][i][j] = new pair(B[cur-1][i][j].x - 1, B[cur-1][i][j].y);
        			}
        			else
        			{
        				B[cur][i][j] = new pair(B[cur-1][i][j].x, B[cur-1][i][j].y);        				
        			}
        		}
        	}
        	cur++;
    	}
    	
    	for(int k=0;k<n;k++)
    	{
        	for(int i=0;i<n;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
    				if(A[cur-1][i][j].y == 0)
    					A[cur][i][j] = new pair(A[cur-1][i][j].x, 2);
    				else
    					A[cur][i][j] = new pair(A[cur-1][i][j].x, A[cur-1][i][j].y - 1);
    				if(B[cur-1][i][j].x == 0)
    					B[cur][i][j] = new pair(2, B[cur-1][i][j].y);
    				else
    					B[cur][i][j] = new pair(B[cur-1][i][j].x - 1, B[cur-1][i][j].y);
        		}
        	}
        	cur++;
    	}
    	count=0;
    	cx=new int[n][n];
    	cy=new int[n][n];
    	csx=new int [n][n];
    	csy=new int[n][n];
    	cslx=new int[n][n];
    	csly=new int [n][n];
    	
    	int omg = 100;
    	for(int i=0;i<n;i++)
    	{
    		mainBalls[0][i] = new pair(omg, 200);
    		aBalls[0][i] = new pair(omg + 20, 200);
    		bBalls[0][i] = new pair(omg + 20, 240);
    		omg+=150;
    	}
    	omg = 350;
    	for(int i=1;i<n;i++)
    	{
    		mainBalls[i][0] = new pair(100, omg);
    		aBalls[i][0] = new pair(120, omg);
    		bBalls[i][0] = new pair(120, omg + 40);
    		omg+=150;
    	}
    	int om = 250;
    	omg = 200;
    	for(int i=1;i<n;i++)
    	{
    		om = 250;
    		omg+=150;
    		for(int j=1;j<n;j++)
    		{
        		mainBalls[i][j] = new pair(om, omg);
        		aBalls[i][j] = new pair(om +20, omg);
        		bBalls[i][j] = new pair(om + 20, omg + 40);
        		om+=150;
    		}
    	}
        setLayout(null);
        setBackground(Color.DARK_GRAY);
        setForeground(Color.RED);
        setOpaque(true);
		t=new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	for(int i=0;i<n;i++)
            	{
            		for(int j=0;j<n;j++)
            		{
            	//		System.out.println(i+" "+j+" "+mainBalls[A[ite][i][j].y][A[ite][i][j].x].x+" "+aBalls[i][j].x+" "+mainBalls[A[ite][i][j].y][A[ite][i][j].x].y+" "+aBalls[i][j].y+" "+A[ite][i][j].x+" "+A[ite][i][j].y);
            			if(aBalls[i][j].x != mainBalls[A[ite][i][j].x][A[ite][i][j].y].x+20)
            			aBalls[i][j].x--;
            			if(aBalls[i][j].x<0)
            				aBalls[i][j].x=mainBalls[A[ite][i][j].x][A[ite][i][j].y].x+50;
            			
            			Rectangle oldCircle = new Rectangle(mainBalls[i][j].x - 1, mainBalls[i][j].y - 1, cw + 2, ch + 2);
		                repaint(oldCircle);
		                repaint(mainBalls[i][j].x - 1, mainBalls[i][j].y - 1, cw + 2, ch + 2);
            		}
            	}
            	
             	for(int i=0;i<n;i++)
            	{
            		for(int j=0;j<n;j++)
            		{
            			System.out.println(i+" "+j+" "+mainBalls[A[ite][i][j].y][A[ite][i][j].x].x+" "+aBalls[i][j].x+" "+mainBalls[A[ite][i][j].y][A[ite][i][j].x].y+" "+aBalls[i][j].y+" "+A[ite][i][j].x+" "+A[ite][i][j].y);
            			if(bBalls[i][j].y != mainBalls[B[ite][i][j].x][B[ite][i][j].y].y+40)
            			bBalls[i][j].y--;
            			if(bBalls[i][j].y<90)
            				bBalls[i][j].y=mainBalls[B[ite][i][j].x][B[ite][i][j].y].y+50;
            			
            			Rectangle oldCircle = new Rectangle(mainBalls[i][j].x - 1, mainBalls[i][j].y - 1, cw + 2, ch + 2);
		                repaint(oldCircle);
		                repaint(mainBalls[i][j].x - 1, mainBalls[i][j].y - 1, cw + 2, ch + 2);
            		}
            	}
            	int count=0;
            	for(int i=0;i<n;i++)
            		for(int j=0;j<n;j++)
            		{
            			if(bBalls[i][j].y != mainBalls[B[ite][i][j].x][B[ite][i][j].y].y+40)
            				count=1;
            			if(aBalls[i][j].x != mainBalls[A[ite][i][j].x][A[ite][i][j].y].x+20)
            				count=1;
            			
            		}
            	
            	if(count==0)
            		ite++;
            	
            	
            	label.setText(ite+" ");
            	if(ite==5)
            		t.stop();
            }
          //  	ite++;
        }
	    );
		
        JButton btnClickMe = new JButton("|>");
        btnClickMe.setBounds(352, 532, 45, 36);
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
        
      
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        //g.setColor(Color.CYAN);
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        	        //g.setColor(Color.BLUE);
        	     
        	        g.drawOval(mainBalls[i][j].x, mainBalls[i][j].y, cw, ch);
        	        g.setColor(Color.green);
        	        g.fillOval(aBalls[i][j].x, aBalls[i][j].y, cr, cr);
        	        g.setColor(Color.WHITE);
        	        g.drawString("A"+i+j, aBalls[i][j].x+10,aBalls[i][j].y+20);
        	        g.setColor(Color.orange);
        	        g.fillOval(bBalls[i][j].x, bBalls[i][j].y, cr, cr);
        	        g.setColor(Color.WHITE);
        	        g.drawString("B"+i+j, bBalls[i][j].x+10,bBalls[i][j].y+20);
        	        FontMetrics fm = g.getFontMetrics();
        	        //double textWidth = fm.getStringBounds(text, g).getWidth();
        	        
        	        g.setColor(Color.WHITE);
        	       
        	}        	
        }
    }
}