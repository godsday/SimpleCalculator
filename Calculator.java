package calculator;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener{
	boolean operaterClicked=false;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,divButton,fourButton,fiveButton,sixButton,mulButton,oneButton,twoButton,threeButton,minusButton;
	JButton dotButton,zeroButton,equalButton,plusButton,clearButton;
	public Calculator() {
		jf= new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(200,50);

		displayLabel = new JLabel();
		displayLabel.setBounds(40,40,520,50);
		displayLabel.setBackground(Color.gray);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setOpaque(true);
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(40,130,80,80);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(160,130,80,80);
		eightButton.addActionListener(this);
		eightButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(280,130,80,80);
		nineButton.addActionListener(this);
		nineButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(nineButton);
		
		divButton = new JButton("/");
		divButton.setBounds(400,130,80,80);
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(divButton);
				
	///
		fourButton = new JButton("4");
		fourButton.setBounds(40,250,80,80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(160,250,80,80);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(280,250,80,80);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(sixButton);
		
		mulButton = new JButton("*");
		mulButton.setBounds(400,250,80,80);
		mulButton.addActionListener(this);
		mulButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(mulButton);
				
	///
		
		oneButton = new JButton("1");
		oneButton.setBounds(40,370,80,80);
		oneButton.addActionListener(this);
		oneButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(160,370,80,80);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(280,370,80,80);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(threeButton);
		
		minusButton = new JButton("-");
		minusButton.setBounds(400,370,80,80);
		minusButton.addActionListener(this);
		minusButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(minusButton);
		
	///
		dotButton = new JButton(".");
		dotButton.setBounds(40,480,80,80);
		dotButton.addActionListener(this);
		dotButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(dotButton);
				
		zeroButton = new JButton("0");
		zeroButton.setBounds(160,480,80,80);
		zeroButton.addActionListener(this);
		zeroButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(zeroButton);
				
		equalButton = new JButton("=");
		equalButton.setBounds(280,480,80,80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(equalButton);
				
		plusButton = new JButton("+");
		plusButton.setBounds(400,480,80,80);
		plusButton.addActionListener(this);
		plusButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(plusButton);
		
		clearButton = new JButton("C");
		clearButton.setBounds(500,130,70,430);
		clearButton.addActionListener(this);
		clearButton.setFont(new Font("Arial", Font.PLAIN,30));
		jf.add(clearButton);
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Calculator();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()== sevenButton) {
			
			if(operaterClicked) {
				displayLabel.setText("7");
			}
			
			displayLabel.setText(displayLabel.getText()+"7");
		}
		else if (e.getSource()== eightButton){
			displayLabel.setText(displayLabel.getText()+"8");
			
		}
		else if (e.getSource()== nineButton){
			displayLabel.setText(displayLabel.getText()+"9");
			
		}
		else if (e.getSource()== fiveButton){
			displayLabel.setText(displayLabel.getText()+"5");
			
		}
		else if (e.getSource()== fourButton){
			displayLabel.setText(displayLabel.getText()+"4");
			
		}
		else if (e.getSource()== sixButton){
			displayLabel.setText(displayLabel.getText()+"6");
			
		}
		else if (e.getSource()== oneButton){
			displayLabel.setText(displayLabel.getText()+"1");
			
		}
		else if (e.getSource()== twoButton){
			displayLabel.setText(displayLabel.getText()+"2");
			
		}
		else if (e.getSource()== threeButton){
			displayLabel.setText(displayLabel.getText()+"3");
			
		}
		else if (e.getSource()== zeroButton){
			displayLabel.setText(displayLabel.getText()+"0");
			
		}
		else if (e.getSource()== divButton){
			
			
		}
		else if (e.getSource()== mulButton){
		
			
		}
		else if (e.getSource()== minusButton){
		
			
		}		
		else if (e.getSource()== plusButton){
		    operaterClicked=true;	
			
		}
		else if (e.getSource()== dotButton){
			displayLabel.setText(displayLabel.getText()+".");
			
		}
		else if (e.getSource()== equalButton){
		
			
		}
		else if (e.getSource()== clearButton) {
			displayLabel.setText("");
		}
	}
	
	

}
