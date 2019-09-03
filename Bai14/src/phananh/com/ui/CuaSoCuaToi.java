package phananh.com.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CuaSoCuaToi extends JFrame {
	
	public CuaSoCuaToi(String tieuDe)
	{
//		super(tieuDe);
		this.setTitle(tieuDe);
		addController();
	}
	
	public void addController()
	{
		Container con = getContentPane();
		JPanel pn = new JPanel();
		pn.setBackground(Color.BLUE);
		JButton btn = new JButton("Click");
		pn.add(btn);
		con.add(pn);
		
	}
	
	public void showWindow()
	{
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
	}
}
