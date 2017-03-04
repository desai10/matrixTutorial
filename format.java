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

import spmxHyperCbe.SpmxHCmain.pair;

import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;

public class SpmxHCmain extends JPanel
{
	private static final long serialVersionUID = 1L;

	int count;
    Timer t;
    int x;
    int []xc = {75,275,475,675};
    int []xinc ={1,1,1,1};
    int col =0;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_22;
    private JTextField textField_23;
    private JTextField textField_30;
    private JTextField textField_31;
    private JTextField textField_38;
    private JTextField textField_39;
    private JTextField textField_47;
    private JTextField textField_48;
    private JButton button;
    private JButton button_1;
    private JTextField textField;

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
		t=new Timer(20, new ActionListener()
		{
	            @Override
	            public void actionPerformed(ActionEvent e)
	            {   
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
        
        textField_12 = new JTextField();
        textField_12.setColumns(10);
        textField_12.setBounds(179, 42, 42, 20);
        add(textField_12);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(231, 42, 42, 20);
        add(textField_13);
        
        textField_14 = new JTextField();
        textField_14.setColumns(10);
        textField_14.setBounds(231, 11, 42, 20);
        add(textField_14);
        
        textField_15 = new JTextField();
        textField_15.setColumns(10);
        textField_15.setBounds(179, 11, 42, 20);
        add(textField_15);
        
        JLabel label = new JLabel("A");
        label.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label.setBounds(215, 76, 22, 17);
        add(label);
        
        JLabel label_1 = new JLabel("X");
        label_1.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_1.setBounds(325, 29, 22, 17);
        add(label_1);
        
        textField_22 = new JTextField();
        textField_22.setColumns(10);
        textField_22.setBounds(397, 42, 42, 20);
        add(textField_22);
        
        textField_23 = new JTextField();
        textField_23.setColumns(10);
        textField_23.setBounds(397, 11, 42, 20);
        add(textField_23);
        
        textField_30 = new JTextField();
        textField_30.setColumns(10);
        textField_30.setBounds(449, 42, 42, 20);
        add(textField_30);
        
        textField_31 = new JTextField();
        textField_31.setColumns(10);
        textField_31.setBounds(449, 11, 42, 20);
        add(textField_31);
        
        JLabel label_2 = new JLabel("B");
        label_2.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_2.setBounds(436, 76, 22, 17);
        add(label_2);
        
        JLabel label_3 = new JLabel("=");
        label_3.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_3.setBounds(549, 29, 27, 17);
        add(label_3);
        
        textField_38 = new JTextField();
        textField_38.setColumns(10);
        textField_38.setBounds(648, 42, 42, 20);
        add(textField_38);
        
        textField_39 = new JTextField();
        textField_39.setColumns(10);
        textField_39.setBounds(648, 11, 42, 20);
        add(textField_39);
        
        textField_47 = new JTextField();
        textField_47.setColumns(10);
        textField_47.setBounds(700, 42, 42, 20);
        add(textField_47);
        
        textField_48 = new JTextField();
        textField_48.setColumns(10);
        textField_48.setBounds(700, 11, 42, 20);
        add(textField_48);
        
        JLabel label_4 = new JLabel("C");
        label_4.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
        label_4.setBounds(688, 76, 22, 17);
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
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
       
        		g.setColor(Color.DARK_GRAY);
        		g.fillRect(47, 100, 824, 400);
    }
}