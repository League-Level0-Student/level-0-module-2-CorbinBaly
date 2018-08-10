package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
	int numb1= new Random().nextInt(5)+1;
	int numb2= new Random().nextInt(5)+1;
	int numb3= new Random().nextInt(5)+1;
	int numb4= new Random().nextInt(5)+1;
	int numb5= new Random().nextInt(5)+1;
	JOptionPane.showMessageDialog(null, numb1+""	+numb2+ ""+numb3+""+numb4+""+numb5 );
	
	}
}
