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
    	int x, y;
    	pair(int a, int b)
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
    	mainBalls = new pair()
    	cx=new int[n][n];
    	cy=new int[n][n];
    	csx=new int [n][n];
    	csy=new int[n][n];
    	cslx=new int[n][n];
    	csly=new int [n][n];
    	
    	int omg = 100;
    	for(int i=0;i<n;i++)
    	{
    		mainBalls[0][i] = new pair(200, omg);
    		aBalls[0][i] = new pair(200, omg + 20);
    		bBalls[0][i] = new pair(240, omg + 20);
    		omg+=150;
    	}
    	omg = 350;
    	for(int i=1;i<n;i++)
    	{
    		mainBalls[i][0] = new pair(omg, 100);
    		aBalls[i][0] = new pair(omg, 120);
    		bBalls[i][0] = new pair(omg + 40, 120);
    		omg+=150;
    	}
    	
    	cx[0][0]=200;
    	cy[0][0]=100;
    	csx[0][0]=200;
    	csy[0][0]=120;
    	cslx[0][0]=240;
    	csly[0][0]=120;
    	for(int i=1;i<n;i++)
    	{
    		for(int j=1;j<n;j++)
    		{
    			cx[]
    		}
    	}
    	for(int i=1;i<n;i++)
    	{
    		cx[i]=cx[i-1]+150;
    		cy[i]=cy[i-1]+150;
    		csx[i]=cx[i];
    		csy[i]=cy[i]+20;
    		cslx[i]=cx[i]+40;
    		csly[i]=cy[i]+20;
    		
    	}
        setLayout(null);
        setBackground(Color.BLACK);
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
            			System.out.println(csx[j]+" "+i+" "+j+" "+cx[A[ite][i][j].y]+" "+A[ite][i][j].x+" "+A[ite][i][j].y);
            			
            			if(csx[j]!=cx[A[ite][i][j].y])
            			{
            				
            			 csx[j] -= xinc;
//     	                cy += yinc;
            			 if(csx[j]==cx[A[ite][i][j].y])
            				 t.stop();
     	                if (csx[i] >= getWidth() - cr || csx[i] <= 0) {
     	                   csx[i]=600;
     	                }
            			
            			Rectangle oldCircle = new Rectangle(cx[i] - 1, cy[j] - 1, cw + 2, ch + 2);	//Rectangle oldCircle = new Rectangle(cx[i]+10, cy[j]+30, cw+30 , ch+40 );
		                repaint(oldCircle);
		                repaint(cx[i] - 1, cy[i] - 1, cw + 2, ch + 2);
            			}
            		}
            	}
          //  	ite++;
            }
	    });
		
        JButton btnClickMe = new JButton("|>");
        btnClickMe.setBounds(362, 502, 45, 36);
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
        	        g.setColor(Color.BLUE);
        	     
        	        g.fillOval(cx[i], cy[j], cw, ch);
        	        g.setColor(Color.green);
        	        g.fillOval(csx[i], csy[j], cr, cr);
        	        g.setColor(Color.WHITE);
        	        g.drawString("A", csx[i]+10,csy[j]+20);
        	        g.setColor(Color.orange);
        	        g.fillOval(cslx[i], csly[j], cr, cr);
        	        FontMetrics fm = g.getFontMetrics();
        	        //double textWidth = fm.getStringBounds(text, g).getWidth();
        	        g.setColor(Color.WHITE);
        	       
        	}        	
        }
    }
}