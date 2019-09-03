package phananh.com.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutUI extends JFrame {
	
	public BorderLayoutUI(String tieuDe)
	{
		super(tieuDe);
		addControlls();
	}

	public void addControlls() {
		
		Container con = getContentPane();
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.CYAN);
		pnNorth.setPreferredSize(new Dimension(0, 20));
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.BLUE);
		pnSouth.setPreferredSize(new Dimension(0, 20));
		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.RED);
		pnWest.setPreferredSize(new Dimension(20, 20));
		pnBorder.add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.GREEN);
		pnEast.setPreferredSize(new Dimension(20, 20));
		pnBorder.add(pnEast, BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.ORANGE);
		pnBorder.add(pnCenter, BorderLayout.CENTER);
		
		con.add(pnBorder);
		
	}
	
	public void showWindow() {
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
