package Chp12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class no1 extends JFrame {
	public no1(){
		super("이미지 그리기 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon icon = new ImageIcon("images/back.jpg");
		private Image img = icon.getImage();
		private JButton button = new JButton("Hide/Show");
		private boolean showFlag = true;
		
		public MyPanel() {
			setLayout(new FlowLayout());
			add(button);
			
			button.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					showFlag = !showFlag;
					MyPanel.this.repaint(); 
				}				
			});
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(showFlag) g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);			
		}
	}
	static public void main(String[] args) {
		new no1();
	}
}
