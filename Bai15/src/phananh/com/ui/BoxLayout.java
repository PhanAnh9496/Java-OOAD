package phananh.com.ui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayout extends JFrame {
	
	public BoxLayout(String tieuDe)
	{
		super(tieuDe);
		addControlls();
	}

	public void addControlls() {
		Container con = getContentPane();
		JPanel pnBoxLayout = new JPanel();
		pnBoxLayout.setLayout(new javax.swing.BoxLayout(pnBoxLayout, javax.swing.BoxLayout.Y_AXIS));
		JButton btn1 = new JButton("Btn1");
		JButton btn2 = new JButton("Btn2");
		JButton btn3 = new JButton("Btn3");
		JButton btn4 = new JButton("Btn4");
		
		pnBoxLayout.add(btn1);
		pnBoxLayout.add(btn2);
		pnBoxLayout.add(btn3);
		pnBoxLayout.add(btn4);
		con.add(pnBoxLayout);
	}
	
	public void showWindow() {
		this.setSize(400, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
}
























