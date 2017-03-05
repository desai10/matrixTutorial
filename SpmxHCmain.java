package spmxHyperCbe;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SpmxHCmain extends JPanel
{
	private static final long serialVersionUID = 1L;
    private int ite = 1;
    private int cw = 75;
    private int ch = 75;
    private int cr=27;
    Timer t2;
    
    public class pair
    {
    	public int x, y;
    	public pair(int a, int b)
    	{
    		x = a;
    		y = b;
    	}
    }

    pair p[] = new pair[20], A[] = new pair[20], B[] = new pair[20], mainBalls[] = new pair[20], aBalls[][] = new pair[5][20], bBalls[][] = new pair[5][20], par[] = new pair[20], ful[] = new pair[20];

    int [][]aMat = new int[][]{{1, 3}, {-8, 4}};
    int [][]bMat = new int[][]{{2, 4}, {9, -6}};
    int [][]cMat = new int[][]{{0, 0}, {0, 0}};
    int []pMat = new int[]{aMat[0][0]*bMat[0][0], aMat[0][0]*bMat[0][1], aMat[1][0]*bMat[0][0], aMat[1][0]*bMat[0][1], aMat[0][1]*bMat[1][0], aMat[0][1]*bMat[1][1], aMat[1][1]*bMat[1][0], aMat[1][1]*bMat[1][1]};
    
    public String getBits(int num)
    {
    	String ans = "";
    	while(num>0)
    	{
    		ans= ans + (num%2 + "");
    		num/=2;
    	}
    	String newans = "";
    	for(int i=ans.length()-1;i>=0;i--)
    		newans = newans + ans.charAt(i);
    	ans = newans;
    	if(ans.length() == 0)
    		ans = "000";
    	else if(ans.length() == 1)
    		ans = "00" + ans;
    	else if(ans.length() == 2)
    		ans = "0" + ans;
    	return ans;
    }

    public String getBits2(int num)
    {
    	String ans = "";
    	while(num>0)
    	{
    		ans= ans + (num%2 + "");
    		num/=2;
    	}
    	String newans = "";
    	for(int i=ans.length()-1;i>=0;i--)
    		newans = newans + ans.charAt(i);
    	ans = newans;
    	if(ans.length() == 0)
    		ans = "00";
    	else if(ans.length() == 1)
    		ans = "0" + ans;
    	return ans;
    }
    
	int count;
    Timer t;
    
    private JTextField textField_a10;
    private JTextField textField_a11;
    private JTextField textField_a01;
    private JTextField textField_a00;
    private JTextField textField_b10;
    private JTextField textField_b00;
    private JTextField textField_b11;
    private JTextField textField_b01;
    private JTextField textField_c10;
    private JTextField textField_c00;
    private JTextField textField_c11;
    private JTextField textField_c01;
    private JTextField textField;
    private JButton btnGoToStage_3;
    private JButton btnGoToStage_4;
    private JButton btnNewButton;
    private JButton btnTryItYourself;
    private JButton btnReset;
    
    public void reset()
    {
    	ite = 1;
    	
    	t.stop();
    	t2.stop();
    	
    	count = 0;
    	
    	textField.setText("");
    	
    	for(int i=0;i<8;i++)
    	{
    		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
    	}
    	
    	for(int i=0;i<16;i++)
    	{
    		A[i] = new pair(mainBalls[i%4].x + 12, mainBalls[i%4].y + 12);
    	}
    	
    	for(int i=0;i<16;i++)
    	{
    		B[i] = new pair(mainBalls[i%4].x + 38, mainBalls[i%4].y + 38);
    	}
    	
		textField_a11.setEditable(false);
		textField_a10.setEditable(false);
		textField_a01.setEditable(false);
		textField_a00.setEditable(false);
		textField_b11.setEditable(false);
		textField_b10.setEditable(false);
		textField_b01.setEditable(false);
		textField_b00.setEditable(false);
		textField_c11.setEditable(false);
		textField_c10.setEditable(false);
		textField_c01.setEditable(false);
		textField_c00.setEditable(false);
		
		btnNewButton.setEnabled(false);
		btnTryItYourself.setEnabled(true);
		
		aMat[0][0] = 1;
		aMat[0][1] = 3;
		aMat[1][0] = -8;
		aMat[1][1] = 4;
		bMat[0][0] = 2;
		bMat[0][1] = 4;
		bMat[1][0] = 9;
		bMat[1][1] = -6;
		cMat[0][0] = 0;
		cMat[0][1] = 0;
		cMat[1][0] = 0;
		cMat[1][1] = 0;
		
        textField_b01.setText("" + bMat[0][1]);
        textField_b11.setText("" + bMat[1][1]);
        textField_b00.setText("" + bMat[0][0]);
        textField_b10.setText("" + bMat[1][0]);
        textField_a01.setText("" + aMat[0][1]);
        textField_a11.setText("" + aMat[1][1]);
        textField_a00.setText("" + aMat[0][0]);
        textField_a10.setText("" + aMat[1][0]);
        textField_c01.setText("" + cMat[0][1]);
        textField_c11.setText("" + cMat[1][1]);
        textField_c00.setText("" + cMat[0][0]);
        textField_c10.setText("" + cMat[1][0]);
        
        repaint();
    }

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                SpmxHCmain panel = new SpmxHCmain();
                panel.setPreferredSize(new Dimension(920, 680));
                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
               
            }
        });
    }

    public SpmxHCmain()
    {
    	count=0; 
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.RED);
        setOpaque(true);
        
    	mainBalls[0] = new pair(370, 450);
    	mainBalls[1] = new pair(670, 450);
    	mainBalls[2] = new pair(220, 300);
    	mainBalls[3] = new pair(520, 300);
    	mainBalls[4] = new pair(370, 250);
    	mainBalls[5] = new pair(670, 250);
    	mainBalls[6] = new pair(220, 100);
    	mainBalls[7] = new pair(520, 100);
    	
    	for(int i=0;i<8;i++)
    	{
    		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);
    		if(i<4)
    		par[i] = new pair(p[i%4].x, p[i%4].y);
    		else
    		par[i] = new pair(p[i%4].x, p[i%4].y - 25);	
    	}
    	
    	for(int i=0;i<4;i++)
    	{
    		ful[i] = new pair(mainBalls[i].x + 15, mainBalls[i].y + 15);
    	}
    	
    	for(int i=0;i<16;i++)
    	{
    		aBalls[0][i] = new pair(mainBalls[i%4].x + 12, mainBalls[i%4].y + 12);
    		A[i] = new pair(mainBalls[i%4].x + 12, mainBalls[i%4].y + 12);
    	}
    	
    	for(int i=0;i<16;i++)
    	{
    		bBalls[0][i] = new pair(mainBalls[i%4].x + 38, mainBalls[i%4].y + 38);
    		B[i] = new pair(mainBalls[i%4].x + 38, mainBalls[i%4].y + 38);
    	}
    	
    	for(int i=0;i<8;i++)
    	{
    		aBalls[1][i] = new pair(aBalls[0][i].x, aBalls[0][i].y);
    		bBalls[1][i] = new pair(bBalls[0][i].x, bBalls[0][i].y);
    	}
    	for(int i=8;i<16;i++)
    	{
    		aBalls[1][i] = new pair(mainBalls[i%4 + 4].x + 12, mainBalls[i%4 + 4].y + 12);
    		bBalls[1][i] = new pair(mainBalls[i%4 + 4].x + 38, mainBalls[i%4 + 4].y + 38);
    	}
    	
    	for(int i=0;i<16;i++)
    	{
    		aBalls[2][i] = new pair(aBalls[1][i].x, aBalls[1][i].y);
    		bBalls[2][i] = new pair(bBalls[1][i].x, bBalls[1][i].y);
    	}
    	
    	aBalls[2][4] = new pair(mainBalls[1].x + 12, mainBalls[1].y + 12);
    	aBalls[2][6] = new pair(mainBalls[3].x + 12, mainBalls[3].y + 12);
    	aBalls[2][13] = new pair(mainBalls[4].x + 12, mainBalls[4].y + 12);
    	aBalls[2][15] = new pair(mainBalls[6].x + 12, mainBalls[6].y + 12);

    	for(int i=0;i<16;i++)
    	{
    		aBalls[3][i] = new pair(aBalls[2][i].x, aBalls[2][i].y);
    		bBalls[3][i] = new pair(bBalls[2][i].x, bBalls[2][i].y);
    	}
    	
    	bBalls[3][4] = new pair(mainBalls[2].x + 38, mainBalls[2].y + 38);
    	bBalls[3][5] = new pair(mainBalls[3].x + 38, mainBalls[3].y + 38);
    	bBalls[3][14] = new pair(mainBalls[4].x + 38, mainBalls[4].y + 38);
    	bBalls[3][15] = new pair(mainBalls[5].x + 38, mainBalls[5].y + 38);
    	
    	for(int i=0;i<16;i++)
    	{
    		aBalls[4][i] = new pair(aBalls[3][i].x + 7, aBalls[3][i].y + 7);
    		bBalls[4][i] = new pair(bBalls[3][i].x - 7, bBalls[3][i].y - 7);
    	}
        
		t=new Timer(20, new ActionListener()
		{
	            @Override
	            public void actionPerformed(ActionEvent e)
	            {   
	        		if(ite > 5)
	        		{
	        			t.stop();
	        			t2.stop();
	        			repaint();
	        			return;
	        		}
	            	if(ite == 1)
	            	{
	            		for(int i=0;i<16;i++)
	            		{
	            			if(A[i].y != aBalls[ite][i].y)
	            			{
	            				A[i].y--;
	            			}
	            			if(B[i].y != bBalls[ite][i].y)
	            			{
	            				B[i].y--;
	            			}
			                repaint();
	            		}
	            	}
	            	else if(ite == 2)
	            	{
	            		for(int i=0;i<16;i++)
	            		{
	            			if(A[i].x != aBalls[ite][i].x)
	            			{
	            				if(A[i].x > aBalls[ite][i].x )
	            				A[i].x--;
	            				else
	            				A[i].x++;
	            			}
			                repaint();
	            		}            		
	            	}
	            	else if(ite == 3)
	            	{
	            		for(int i=0;i<16;i++)
	            		{
	            			if(B[i].x != bBalls[ite][i].x)
	            			{
	            				if(B[i].x > bBalls[ite][i].x)
	            				{
	            					B[i].x--;
	            					B[i].y--;
	            				}
	            				else
	            				{
	            					B[i].x++;
	            					B[i].y++;
	            				}
	            			}
			                repaint();
	            		}
	            	}
	            	else if(ite == 4)
	            	{
	            		for(int i=0;i<16;i++)
	            		{
	            			if(A[i].x != aBalls[ite][i].x)
	            			{
	            				if(A[i].x > aBalls[ite][i].x)
	            				{
	            					A[i].x--;
	            					A[i].y--;
	            				}
	            				else
	            				{
	            					A[i].x++;
	            					A[i].y++;
	            				}
	            			}
	            			if(B[i].x != bBalls[ite][i].x)
	            			{
	            				if(B[i].x > bBalls[ite][i].x)
	            				{
	            					B[i].x--;
	            					B[i].y--;
	            				}
	            				else
	            				{
	            					B[i].x++;
	            					B[i].y++;
	            				}
	            			}
			                repaint();
	            		}            		
	            	}
	            	else if(ite == 5)
	            	{
	            		for(int i=0;i<8;i++)
	            		{
	            			if(p[i].y != par[i].y)
	            			{
	            				p[i].y++;
	            			}
	            			repaint();
	            		}
	            	}
	        		int count = 0;
	        		for(int i=0;i<16;i++)
	        		{
	        			if(ite <= 4)
	        			{
	            			if(A[i].x != aBalls[ite][i].x || A[i].y != aBalls[ite][i].y)
	            				count = 1;
	            			if(B[i].x != bBalls[ite][i].x || B[i].y != bBalls[ite][i].y)
	            				count = 1;	
	        			}
	        			if((p[i%8].x != par[i%8].x || p[i%8].y != par[i%8].y) && ite == 5)
	        				count = 1;
	        		}
	        		if(count != 1)
	        		{
	        			t.stop();
	        			t2.start();
	        		}
	        		if(ite > 5)
	        		{
	        			t.stop();
	        			t2.stop();
	        			System.out.println(ite);
	        			repaint();
	        		}
	        		textField.setText("" + ite);
	            }	
	        });
		
		t2=new Timer(1000, new ActionListener()
		{
            @Override
            public void actionPerformed(ActionEvent e)
            {
            	t2.stop();
            	ite++;
            	t.start();
            }
        });
		
        JButton btnClickMe = new JButton("Start");
        btnClickMe.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnClickMe.setBounds(42, 537, 80, 36);
        btnClickMe.addActionListener(new ActionListener()
        {
        	public void actionPerformed(ActionEvent arg0)
        	{
        		 count++;
        
        		 if(count%2==0)
        	        	t.stop();
        		 else
        			 t.start();
        	}
        });
        add(btnClickMe);
        
        textField_a10 = new JTextField();
        textField_a10.setColumns(10);
        textField_a10.setBounds(179, 42, 42, 20);
        add(textField_a10);
        textField_a10.setText("" + aMat[1][0]);
        
        textField_a11 = new JTextField();
        textField_a11.setColumns(10);
        textField_a11.setBounds(231, 42, 42, 20);
        add(textField_a11);
        textField_a11.setText("" + aMat[1][1]);
        
        textField_a01 = new JTextField();
        textField_a01.setColumns(10);
        textField_a01.setBounds(231, 11, 42, 20);
        add(textField_a01);
        textField_a01.setText("" + aMat[0][1]);
        
        textField_a00 = new JTextField();
        textField_a00.setColumns(10);
        textField_a00.setBounds(179, 11, 42, 20);
        add(textField_a00);
        textField_a00.setText("" + aMat[0][0]);
        
        JLabel label = new JLabel("A");
        label.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label.setBounds(215, 76, 22, 17);
        add(label);
        
        JLabel label_1 = new JLabel("X");
        label_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_1.setBounds(325, 29, 22, 17);
        add(label_1);
        
        textField_b10 = new JTextField();
        textField_b10.setColumns(10);
        textField_b10.setBounds(397, 42, 42, 20);
        add(textField_b10);
        textField_b10.setText("" + bMat[1][0]);
        
        textField_b00 = new JTextField();
        textField_b00.setColumns(10);
        textField_b00.setBounds(397, 11, 42, 20);
        add(textField_b00);
        textField_b00.setText("" + bMat[0][0]);
        
        textField_b11 = new JTextField();
        textField_b11.setColumns(10);
        textField_b11.setBounds(449, 42, 42, 20);
        add(textField_b11);
        textField_b11.setText("" + bMat[1][1]);
        
        textField_b01 = new JTextField();
        textField_b01.setColumns(10);
        textField_b01.setBounds(449, 11, 42, 20);
        add(textField_b01);
        textField_b01.setText("" + bMat[0][1]);
        
        JLabel label_2 = new JLabel("B");
        label_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_2.setBounds(436, 76, 22, 17);
        add(label_2);
        
        JLabel label_3 = new JLabel("=");
        label_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_3.setBounds(549, 29, 27, 17);
        add(label_3);
        
        textField_c10 = new JTextField();
        textField_c10.setColumns(10);
        textField_c10.setBounds(648, 42, 42, 20);
        add(textField_c10);
        textField_c10.setText("" + cMat[1][0]);
        
        textField_c00 = new JTextField();
        textField_c00.setColumns(10);
        textField_c00.setBounds(648, 11, 42, 20);
        add(textField_c00);
        textField_c00.setText("" + cMat[0][0]);
        
        textField_c11 = new JTextField();
        textField_c11.setColumns(10);
        textField_c11.setBounds(700, 42, 42, 20);
        add(textField_c11);
        textField_c11.setText("" + cMat[1][1]);
        
        textField_c01 = new JTextField();
        textField_c01.setColumns(10);
        textField_c01.setBounds(700, 11, 42, 20);
        add(textField_c01);
        textField_c01.setText("" + cMat[0][1]);
        
		textField_a11.setEditable(false);
		textField_a10.setEditable(false);
		textField_a01.setEditable(false);
		textField_a00.setEditable(false);
		textField_b11.setEditable(false);
		textField_b10.setEditable(false);
		textField_b01.setEditable(false);
		textField_b00.setEditable(false);
		textField_c11.setEditable(false);
		textField_c10.setEditable(false);
		textField_c01.setEditable(false);
		textField_c00.setEditable(false);
		
        JLabel label_4 = new JLabel("C");
        label_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_4.setBounds(688, 76, 22, 17);
        add(label_4);
        
        textField = new JTextField();
        textField.setBounds(47, 577, 824, 90);
        add(textField);
        textField.setColumns(10);
        
        JButton btnGoToStage = new JButton("Go to Stage 1");
        btnGoToStage.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent arg0)
        	{
            	ite = 1;
            	
            	t.stop();
            	t2.stop();
            	
            	count = 0;
            	
            	textField.setText("");
            	
            	for(int i=0;i<8;i++)
            	{
            		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		A[i] = new pair(mainBalls[i%4].x + 12, mainBalls[i%4].y + 12);
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		B[i] = new pair(mainBalls[i%4].x + 38, mainBalls[i%4].y + 38);
            	}
        		
        		cMat[0][0] = 0;
        		cMat[0][1] = 0;
        		cMat[1][0] = 0;
        		cMat[1][1] = 0;
        		
                textField_c01.setText("" + cMat[0][1]);
                textField_c11.setText("" + cMat[1][1]);
                textField_c00.setText("" + cMat[0][0]);
                textField_c10.setText("" + cMat[1][0]);
                
                repaint();
        	}
        });
        btnGoToStage.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnGoToStage.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGoToStage.setBounds(212, 537, 128, 36);
        add(btnGoToStage);
        
        JButton btnGoToStage_1 = new JButton("Go to Stage 2");
        btnGoToStage_1.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
            	ite = 1;
            	
            	t.stop();
            	t2.stop();
            	
            	count = 0;
            	
            	textField.setText("");
            	
            	for(int i=0;i<8;i++)
            	{
            		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		A[i] = new pair(aBalls[1][i].x, aBalls[1][i].y);
            		B[i] = new pair(bBalls[1][i].x, bBalls[1][i].y);
            	}
        		
        		cMat[0][0] = 0;
        		cMat[0][1] = 0;
        		cMat[1][0] = 0;
        		cMat[1][1] = 0;
        		
                textField_c01.setText("" + cMat[0][1]);
                textField_c11.setText("" + cMat[1][1]);
                textField_c00.setText("" + cMat[0][0]);
                textField_c10.setText("" + cMat[1][0]);
                
                repaint();
        	}
        });
        btnGoToStage_1.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGoToStage_1.setBounds(345, 537, 128, 36);
        add(btnGoToStage_1);
        
        JButton btnGoToStage_2 = new JButton("Go to Stage 3");
        btnGoToStage_2.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
            	ite = 2;
            	
            	t.stop();
            	t2.stop();
            	
            	count = 0;
            	
            	textField.setText("");
            	
            	for(int i=0;i<8;i++)
            	{
            		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		A[i] = new pair(aBalls[2][i].x, aBalls[2][i].y);
            		B[i] = new pair(bBalls[2][i].x, bBalls[2][i].y);
            	}
        		
        		cMat[0][0] = 0;
        		cMat[0][1] = 0;
        		cMat[1][0] = 0;
        		cMat[1][1] = 0;
        		
                textField_c01.setText("" + cMat[0][1]);
                textField_c11.setText("" + cMat[1][1]);
                textField_c00.setText("" + cMat[0][0]);
                textField_c10.setText("" + cMat[1][0]);
                
                repaint();
        	}
        });
        btnGoToStage_2.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGoToStage_2.setBounds(478, 537, 128, 36);
        add(btnGoToStage_2);
        
        btnGoToStage_3 = new JButton("Go to Stage 4");
        btnGoToStage_3.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
            	ite = 3;
            	
            	t.stop();
            	t2.stop();
            	
            	count = 0;
            	
            	textField.setText("");
            	
            	for(int i=0;i<8;i++)
            	{
            		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		A[i] = new pair(aBalls[3][i].x, aBalls[3][i].y);
            		B[i] = new pair(bBalls[3][i].x, bBalls[3][i].y);
            	}
        		
        		cMat[0][0] = 0;
        		cMat[0][1] = 0;
        		cMat[1][0] = 0;
        		cMat[1][1] = 0;
        		
                textField_c01.setText("" + cMat[0][1]);
                textField_c11.setText("" + cMat[1][1]);
                textField_c00.setText("" + cMat[0][0]);
                textField_c10.setText("" + cMat[1][0]);
                
                repaint();
        	}
        });
        btnGoToStage_3.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGoToStage_3.setBounds(612, 537, 128, 36);
        add(btnGoToStage_3);
        
        btnGoToStage_4 = new JButton("Go to Stage 5");
        btnGoToStage_4.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent e)
        	{
            	ite = 5;
            	
            	t.stop();
            	t2.stop();
            	
            	count = 0;
            	
            	textField.setText("");
            	
            	for(int i=0;i<8;i++)
            	{
            		p[i] = new pair(mainBalls[i].x + 18, mainBalls[i].y + 32);	
            	}
            	
            	for(int i=0;i<16;i++)
            	{
            		A[i] = new pair(aBalls[4][i].x, aBalls[4][i].y);
            		B[i] = new pair(bBalls[4][i].x, bBalls[4][i].y);
            	}
        		
        		cMat[0][0] = 0;
        		cMat[0][1] = 0;
        		cMat[1][0] = 0;
        		cMat[1][1] = 0;
        		
                textField_c01.setText("" + cMat[0][1]);
                textField_c11.setText("" + cMat[1][1]);
                textField_c00.setText("" + cMat[0][0]);
                textField_c10.setText("" + cMat[1][0]);
                
                repaint();
        	}
        });
        btnGoToStage_4.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnGoToStage_4.setBounds(747, 537, 128, 36);
        add(btnGoToStage_4);
        
        btnNewButton = new JButton("Default Values");
        btnNewButton.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent arg0)
        	{
        		reset();
        	}
        });
        btnNewButton.setEnabled(false);
        btnNewButton.setToolTipText("With audio and using default matrices.");
        btnNewButton.setBounds(10, 11, 120, 23);
        add(btnNewButton);
        
        btnTryItYourself = new JButton("Try It Yourself");
        btnTryItYourself.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent arg0)
        	{
        		reset();
        		btnTryItYourself.setEnabled(false);
        		btnNewButton.setEnabled(true);
        		textField_a11.setEditable(true);
        		textField_a10.setEditable(true);
        		textField_a01.setEditable(true);
        		textField_a00.setEditable(true);
        		textField_b11.setEditable(true);
        		textField_b10.setEditable(true);
        		textField_b01.setEditable(true);
        		textField_b00.setEditable(true);
        	}
        });
        btnTryItYourself.setToolTipText("Enter your own values for the matrices and see how it works.");
        btnTryItYourself.setBounds(10, 43, 120, 23);
        add(btnTryItYourself);
        
        btnReset = new JButton("Reset");
        btnReset.addMouseListener(new MouseAdapter()
        {
        	@Override
        	public void mouseClicked(MouseEvent arg0)
        	{
        		reset();
        	}
        });
        btnReset.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnReset.setBounds(127, 537, 80, 36);
        add(btnReset);
    }


    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(47, 95, 824, 440);
        for(int i=0;i<8;i++)
        {
    		String cur;
    		cur = getBits(i);
    		g.setColor(Color.blue);
    		for(int j=i+1;j<8;j++)
    		{
    			String tt = getBits(j);
    			int ct = 0;
    			if(tt.charAt(0) != cur.charAt(0))
    				ct++;
    			if(tt.charAt(1) != cur.charAt(1))
    				ct++;
    			if(tt.charAt(2) != cur.charAt(2))
    				ct++;
    			if(ct == 1)
    			{
    				if(mainBalls[i].x == mainBalls[j].x)
    				g.drawLine(mainBalls[i].x + 37, mainBalls[i].y, mainBalls[j].x + 37, mainBalls[j].y + 75);
    				else if(mainBalls[i].y == mainBalls[j].y)
    				g.drawLine(mainBalls[i].x + 75, mainBalls[i].y + 37, mainBalls[j].x, mainBalls[j].y + 37);
    				else
    				g.drawLine(mainBalls[i].x + 10, mainBalls[i].y + 10, mainBalls[j].x + 65, mainBalls[j].y + 65);
    			}
    		}
        	g.setColor(Color.GRAY);
    		g.drawOval(mainBalls[i].x, mainBalls[i].y, cw, ch);
    		g.setColor(Color.WHITE);
    		g.drawString("P" + i + "(P" + getBits(i) + ")", mainBalls[i].x - 55, mainBalls[i].y + 34);
        }
        if(ite == 0 || ite == 1)
        {
            for(int i=0;i<16;i++)
            {
            	g.setColor(Color.GREEN);
            	g.fillOval(A[i].x, A[i].y, cr, cr);
            	g.setColor(Color.yellow);
            	g.fillOval(B[i].x, B[i].y, cr, cr);
            	g.setColor(Color.BLACK);
            	Font font = new Font("Serif", Font.PLAIN, 11);
            	g.setFont(font);
            	String som = getBits2(i%4);
            	int ai, aj, bi, bj;
            	if(som.charAt(0) == '0')
            		ai = 0;
            	else
            		ai = 1;
            	if(som.charAt(1) == '0')
            		aj = 0;
            	else
            		aj = 1;
            	if(som.charAt(0) == '0')
            		bi = 0;
            	else
            		bi = 1;
            	if(som.charAt(1) == '0')
            		bj = 0;
            	else
            		bj = 1;
            	g.drawString("" + aMat[ai][aj], A[i].x + 9, A[i].y + 17);
            	g.drawString("" + bMat[bi][bj], B[i].x + 9, B[i].y + 17);
            }	
        }
        else if(ite == 2)
        {
            for(int i=0;i<16;i++)
            {
            	g.setColor(Color.GREEN);
            	if(i != 5 && i != 7 && i != 12 && i != 14 &&  i != 1 && i != 3 && i != 8 && i != 10)
            	g.fillOval(A[i].x, A[i].y, cr, cr);
            	g.setColor(Color.yellow);
            	g.fillOval(B[i].x, B[i].y, cr, cr);
            	g.setColor(Color.BLACK);
            	Font font = new Font("Serif", Font.PLAIN, 11);
            	g.setFont(font);
            	
            	String som = getBits2(i%4);
            	int ai, aj, bi, bj;
            	if(som.charAt(0) == '0')
            		ai = 0;
            	else
            		ai = 1;
            	if(som.charAt(1) == '0')
            		aj = 0;
            	else
            		aj = 1;
            	if(som.charAt(0) == '0')
            		bi = 0;
            	else
            		bi = 1;
            	if(som.charAt(1) == '0')
            		bj = 0;
            	else
            		bj = 1;
            	if(i != 5 && i != 7 && i != 12 && i != 14 &&  i != 1 && i != 3 && i != 8 && i != 10)
            	g.drawString("" + aMat[ai][aj], A[i].x + 9, A[i].y + 17);
            	g.drawString("" + bMat[bi][bj], B[i].x + 9, B[i].y + 17);
            }
        }
        else if(ite == 3 || ite == 4)
        {
            for(int i=0;i<16;i++)
            {
            	g.setColor(Color.GREEN);
            	if(i != 5 && i != 7 && i != 12 && i != 14 &&  i != 1 && i != 3 && i != 8 && i != 10)
            	g.fillOval(A[i].x, A[i].y, cr, cr);
            	g.setColor(Color.yellow);
            	if(i != 2 && i != 3 && i != 6 && i != 7 &&  i != 8 && i != 9 && i != 12 && i != 13)
            	g.fillOval(B[i].x, B[i].y, cr, cr);
            	g.setColor(Color.BLACK);
            	Font font = new Font("Serif", Font.PLAIN, 11);
            	g.setFont(font);
            	
            	String som = getBits2(i%4);
            	int ai, aj, bi, bj;
            	if(som.charAt(0) == '0')
            		ai = 0;
            	else
            		ai = 1;
            	if(som.charAt(1) == '0')
            		aj = 0;
            	else
            		aj = 1;
            	if(som.charAt(0) == '0')
            		bi = 0;
            	else
            		bi = 1;
            	if(som.charAt(1) == '0')
            		bj = 0;
            	else
            		bj = 1;
            	
            	if(i != 5 && i != 7 && i != 12 && i != 14 &&  i != 1 && i != 3 && i != 8 && i != 10)
            	g.drawString("" + aMat[ai][aj], A[i].x + 9, A[i].y + 17);
            	if(i != 2 && i != 3 && i != 6 && i != 7 &&  i != 8 && i != 9 && i != 12 && i != 13)
            	g.drawString("" + bMat[bi][bj], B[i].x + 9, B[i].y + 17);
            }        	
        }
        else if(ite == 5)
        {
        	for(int i=0;i<8;i++)
        	{
        		g.setColor(Color.CYAN);
        		g.fillOval(p[i].x, p[i].y, cr+10, cr+10);
            	g.setColor(Color.BLACK);
            	Font font = new Font("Serif", Font.PLAIN, 11);
            	g.setFont(font);
            	if(i>=4)
        		g.drawString("" + pMat[i], p[i].x + 9, p[i].y + 15);
            	else
            	g.drawString("" + pMat[i], p[i].x + 9, p[i].y + 23);
        	}
        }
        else
        {
        	for(int i=0;i<4;i++)
        	{
        		g.setColor(Color.orange);
        		g.fillOval(ful[i].x, ful[i].y, cr+20, cr+20);
            	g.setColor(Color.BLACK);
            	Font font = new Font("Serif", Font.PLAIN, 11);
            	g.setFont(font);
            	int asa = (pMat[i] + pMat[i + 4]);
            	String som = getBits2(i);
            	int ai, aj;
            	if(som.charAt(0) == '0')
            		ai = 0;
            	else
            		ai = 1;
            	if(som.charAt(1) == '0')
            		aj = 0;
            	else
            		aj = 1;
            	cMat[ai][aj] = asa; 
            	g.drawString("" + asa, p[i].x + 9, p[i].y + 15);
        	}
            textField_c01.setText("" + cMat[0][1]);
            textField_c11.setText("" + cMat[1][1]);
            textField_c00.setText("" + cMat[0][0]);
            textField_c10.setText("" + cMat[1][0]);
        }
    }
}