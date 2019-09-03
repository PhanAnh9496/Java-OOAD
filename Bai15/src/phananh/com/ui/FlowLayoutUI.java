package phananh.com.ui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutUI extends JFrame {
	public FlowLayoutUI(String tieuDe)
	{
		super(tieuDe);
		addControlls();
	}
	
	public void addControlls() {
		Container con = getContentPane();
		JPanel pnFlowLayout = new JPanel();
		pnFlowLayout.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Demo btn 1");
		JButton btn2 = new JButton("Demo btn 2");
		JButton btn3 = new JButton("Demo btn 3");
		JButton btn4 = new JButton("Demo btn 4");
		pnFlowLayout.add(btn1);
		pnFlowLayout.add(btn2);
		pnFlowLayout.add(btn3);
		pnFlowLayout.add(btn4);
		
		con.add(pnFlowLayout);
	}

	public void showWinDow()
	{
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
