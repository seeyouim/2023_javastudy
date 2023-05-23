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


public class Test02 extends JFrame {
   

    public Test02() {
        super("계산기");
        JPanel np = new JPanel();
        JLabel jl1 = new JLabel("");
        JTextField jtf1 = new JTextField(45);
        
        np.add(jl1);
		np.add(jtf1);
        
        JPanel buttonPanel = new JPanel(new GridLayout(0, 3));
        String[] buttonLabels = {
            "1", "2", "3", 
            "4", "5", "6", 
            "7", "8", "9", 
            "0", "+", "-",
            "*", "-", "="
        };
        

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }
        JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  // 자동 줄 바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// 편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
        setLayout(new BorderLayout());
        add(np,BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(sp,BorderLayout.SOUTH);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width / 2 - 250, screenSize.height / 2 - 250, 500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Test02();
    }
}
