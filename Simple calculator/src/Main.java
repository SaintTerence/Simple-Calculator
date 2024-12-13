import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;

public class Main {
	
	public static JTextField textField;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame("Simple calculator");
		Panel panel = new Panel();
		JPanel bottom = new JPanel(new GridLayout(1,2));
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 35));
		JButton clear = new JButton("CLEAR");
		JButton delete = new JButton("DELETE");
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = textField.getText();
				String nText = text.substring(0, text.length()-1);
				textField.setText(nText);
				
			}
		});
		
		bottom.add(delete);
		bottom.add(clear);
		window.add(textField, BorderLayout.NORTH);
		window.add(bottom, BorderLayout.SOUTH);
		window.add(panel);
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}


}
