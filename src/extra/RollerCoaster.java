package extra;

import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {
	String Height =	JOptionPane.showInputDialog("How tall are you?");
	int heit = Integer.parseInt(Height);
	if(heit>=48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
	else {
	JOptionPane.showMessageDialog(null, "You need to grow more first");
	}
	}
}
