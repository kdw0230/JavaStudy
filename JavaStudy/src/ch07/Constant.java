package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Constant {
	public static void main(String[] args) {
		JFrame j = new JFrame("내창");
		
		JButton b = new JButton("내버튼");
		b.setBackground(Color.CYAN);
		
		j.add(b); //프레임에 버튼을 추가
		
		j.setBounds(800, 400, 200, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(300, 200); // 너비300 높이 200
		j.setVisible(true);
	}
}
