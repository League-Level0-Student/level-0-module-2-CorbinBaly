package extra;

import javax.swing.JOptionPane;

public class Voting_Booth {
	public static void main(String[] args) {
		String age =	JOptionPane.showInputDialog("How old are you(years)");
		int ag = Integer.parseInt(age);
		if(ag>=18) {
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
		}
		else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
		}
}
