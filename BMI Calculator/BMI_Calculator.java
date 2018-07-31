package BMI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class BMI_Calculator extends JFrame implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel weightlabel,heightlabel,BMIlabel;
	private JTextField weight,height;
	private JButton calculate;
	
	
	public  BMI_Calculator(){
		frame = new JFrame("BMI Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		weightlabel = new JLabel("Weight(kg):");
		heightlabel = new JLabel("Height(m):");
		weight = new JTextField(10);
		height = new JTextField(10);
		calculate = new JButton("Calculate");
		
		panel = new JPanel(new GridLayout(0,1));
		panel.add(weightlabel);
		panel.add(weight);
		panel.add(heightlabel);
		panel.add(height);
		panel.add(calculate);
		
		calculate.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0,1));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void calculateBMI(){
		String Height = height.getText();
		String Weight = weight.getText();
		double a = Double.parseDouble(Height);
		double b = Double.parseDouble(Weight);
		double bmi = ((b)/(a*a));
		
		try{
			bmi = ((b)/(a*a));
		}
		catch(NumberFormatException nfe){
			JOptionPane.showMessageDialog(null,"You must enter valid number!","Input Error",JOptionPane.ERROR_MESSAGE);
		}
		finally{
			if(bmi>=30.0){
				JOptionPane.showMessageDialog(null, "You are Obese!","Result",JOptionPane.WARNING_MESSAGE);
			}
			else if(bmi>=25.0 && bmi <=29.9){
				JOptionPane.showMessageDialog(null, "You are Overweight!","Result",JOptionPane.WARNING_MESSAGE);
			}
			else if(bmi>=18.5 && bmi <=24.9){
				JOptionPane.showMessageDialog(null, "You have Normal Weight!","Result",JOptionPane.INFORMATION_MESSAGE);
			}
			else if(bmi<18.5){
				JOptionPane.showMessageDialog(null, "You are Underweight!","Result",JOptionPane.WARNING_MESSAGE);
			}
		}
}

	public static void main(String[] args) {
		BMI_Calculator bmi_calculator = new BMI_Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.calculateBMI();	
	}
}
