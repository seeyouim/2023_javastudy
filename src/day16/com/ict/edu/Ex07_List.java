package day16.com.ict.edu;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

public class Ex07_List extends JFrame {
	public Ex07_List () {
		super("리스트");
		
		JPanel jp = new JPanel();
		
		String[] items = {"좋아하는 운동","야구","축구","배구","농구"};
		JList<String> jlist = new JList<>(items);
		
		jlist.setSelectedIndex(2);
		jp.add(jlist);
		add(jp);
		
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-350, 600, 700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new Ex07_List();
	}

}