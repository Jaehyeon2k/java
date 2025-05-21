package ch14;

import java.awt.*;
import javax.swing.*;

public class ExFrame03 extends JFrame {
	public ExFrame03() {
		setTitle("두번째 윈도우 프로그램");
		setSize(400, 200);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.pink);
		
		JButton obj1 = new JButton("프로그램 실행");
		JButton obj2 = new JButton("프로그램 종료");
		
		panel.add(obj1);
		panel.add(obj2);
		
		add(panel);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		new ExFrame03();
	}

}
