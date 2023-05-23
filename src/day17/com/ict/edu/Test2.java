package day17.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;


public class Test2 extends JFrame {
   

    public Test2() {
        super("계산기");
        JPanel np = new JPanel();
        JLabel jl1 = new JLabel("");
        JTextField jtf1 = new JTextField(45);
        
        np.add(jl1);
		np.add(jtf1);
        
        JPanel buttonLabels = new JPanel(new GridLayout(0, 3));
        JPanel jp = new JPanel();
		jp.setLayout(null);
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		
		// setBounds(x,y,w,h)
		jb1.setBounds(10, 10, 200, 300);
		jb2.setBounds(220, 10, 200, 100);
		jb3.setBounds(10, 320, 420, 30);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

     
        
        JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  // 자동 줄 바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb6 = new JButton("계  산");
		JButton jb7 = new JButton("종  료");
		JButton jb8 = new JButton("취  소");
		sp.add(jb6);
		sp.add(jb7);
		sp.add(jb8);
		
		jb1.setBounds(10, 10, 100, 300);
		jb2.setBounds(220, 10, 100, 300);
		jb3.setBounds(10, 320, 100, 300);
		
        setLayout(new BorderLayout());
        add(np,BorderLayout.NORTH);
        add(buttonLabels, BorderLayout.CENTER);
        add(sp,BorderLayout.SOUTH);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width / 2 - 250, screenSize.height / 2 - 250, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test2();
    }
}
