import java.awt.Color;
import java.awt.Dimension;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Panel extends JPanel {
	Main main = new Main();
	public Panel() {
		setPreferredSize(new Dimension(400, 500));
		GridLayout grid1 = new GridLayout(5,5);
		setLayout(grid1);
		setBackground(Color.GRAY);
		
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton multiply = new JButton("x");
		JButton divide = new JButton("/");
		JButton add = new JButton("+");
		JButton decimal = new JButton(".");
		JButton equals = new JButton("=");
		JButton subtract = new JButton("-");
		
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 0);
				
			}
		});
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 1);
				
			}
		});
		two.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 2);
				
			}
		});
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 3);
				
			}
		});
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 4);
				
			}
		});
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 5);
				
			}
		});
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 6);
				
			}
		});
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 7);
				
			}
		});
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 8);
				
			}
		});
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + 9);
				
			}
		});
		multiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + "*");
				
			}
		});
		divide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + "/");
				
			}
		});
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + "+");
				
			}
		});
		decimal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + ".");
				
			}
		});
		subtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				main.textField.setText(main.textField.getText() + "-");
				
			}
		});
		equals.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String answer = main.textField.getText();
		            String[] operandsAndOperators = answer.split("(?<=\\d)(?=[+*\\-/])|(?<=[+*/])(?=\\d)|(?<=[+*\\-/])(?=[+*\\-/])");	
		            List<String> oao = new ArrayList<>(Arrays.asList(operandsAndOperators));
		            
		            for (int i = 0; i < oao.size()-1; ) {
		                if (oao.get(i+1).equals("/")) {
		                    if (oao.get(i + 2).equals("0")) {
		                        main.textField.setText("Error: Division by zero");
		                        return;
		                    }
		                    Double result = Double.parseDouble(oao.get(i)) / Double.parseDouble(oao.get(i+2));
		                    oao.set(i, result.toString());
		                    oao.remove(i + 2);
		                    oao.remove(i+1);
		                } else if (oao.get(i+1).equals("*")) {
		                    Double result = Double.parseDouble(oao.get(i)) * Double.parseDouble(oao.get(i+2));
		                    oao.set(i, result.toString());
		                    oao.remove(i + 2);
		                    oao.remove(i+1);
		                } else {
		                    i++;
		                }
		            }
		            for (int j = 0; j < oao.size()-1; ) {
		                if (oao.get(j+1).equals("+")) {
		                    Double result = Double.parseDouble(oao.get(j)) + Double.parseDouble(oao.get(j+2));
		                    oao.set(j, result.toString());
		                    oao.remove(j + 2);
		                    oao.remove(j+1);
		                }
		                else if (oao.get(j+1).equals("-")) {
		                    Double result = Double.parseDouble(oao.get(j)) - Double.parseDouble(oao.get(j+2));
		                    oao.set(j, result.toString());
		                    oao.remove(j + 2);
		                    oao.remove(j+1);
		                }
		                else {
		                	j++;
		                }
		            }
		            for(int k = 0; k < oao.size()-1;) {
		            	Double result = Double.parseDouble(oao.get(k)) + Double.parseDouble(oao.get(k+1));
	                    oao.set(k, result.toString());
	                    oao.remove(k+1);
		            }
		            main.textField.setText(oao.get(0));
		        } catch (NumberFormatException ex) {
		            main.textField.setText("Error: Invalid input");
		        } catch (Exception ex) {
		            main.textField.setText("Error: " + ex.getMessage());
		        }
		    }
		});         
		add(seven);
		add(eight);
		add(nine);
		add(multiply);
		add(four);
		add(five);
		add(six);
		add(divide);
		add(one);
		add(two);
		add(three);
		add(add);
		add(zero);
		add(decimal);
		add(equals);
		add(subtract);
		} 
}
