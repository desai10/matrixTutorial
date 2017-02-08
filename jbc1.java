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

public class jbc1 extends JPanel
{
    private static final long serialVersionUID = 1L;
    private int []cx;
    private int []cy;
    private int cw = 50;
    private int ch = 50;
    private int xinc = 1;
    private int yinc = 1;
    private int count=0;
    private int n=3;
    Timer t;
    private JTextField textField;
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                jbc1 panel = new jbc1();
                panel.setPreferredSize(new Dimension(900, 700));
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
    	setLayout(null);
        setBackground(Color.BLACK);
        setForeground(Color.RED);
        setOpaque(true);
		t=new Timer(15, new ActionListener(){
	            @Override
	            public void actionPerformed(ActionEvent e)
	            {
	            	for(int i=0;i<n;i++)
	            	{
	            		for(int j=0;j<n;j++)
	            		{
		        			Rectangle oldCircle = new Rectangle(cx[i] - 1, cy[j] - 1, cw + 2, ch + 2);
		        			cx[i] += xinc;
		        			if (cx[i] >= getWidth() - cw || cx[i] <= 0)
		        			{
		        				xinc *= -1;
		        			}
		        			if (cy[j] >= getHeight() - ch || cy[j] <= 0)
		        			{
		        				yinc *= -1;
		        			}
			                repaint(oldCircle);	            	
	            		}
	            	}
	            }
	        });
        JButton btnClickMe = new JButton("|>");
        btnClickMe.setBounds(105, 341, 45, 36);
        btnClickMe.addActionListener(new ActionListener(){
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
        textField = new JTextField();
        textField.setBounds(310, 349, 86, 20);
        add(textField);
        textField.setColumns(10);
        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent arg0)
        	{
                String s=new String();
                s=textField.getText();
                t.stop();
                if(s.length()!=0)		
                {
                	repaint();
                	count=0;
                	n=Integer.parseInt(s);
                	cx=new int[n];
                	cy=new int[n];
                	cx[0]=0;
                	cy[0]=0;
                	for(int i=1;i<n;i++)
                	{
                		cx[i]=cx[i-1]+100;
                		cy[i]=cy[i-1]+100;
                	}
                }
        	}
        });
        btnNewButton.setBounds(313, 392, 86, 23);
        add(btnNewButton);
    }
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            	String text = "1";
            	g.setColor(Color.BLUE);
            	g.fillOval(cx[i], cy[j], cw, ch);
            	FontMetrics fm = g.getFontMetrics();
            	double textWidth = fm.getStringBounds(text, g).getWidth();
            	g.setColor(Color.WHITE);
            	g.drawString(text, (int) (cx[i]+cw/2), (int) (cy[j] +ch/2));
            }
        }
    }
}