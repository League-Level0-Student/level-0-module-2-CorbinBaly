//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		Random randomMaker = new Random();
		for (int i = 0; i < 10; i++) {

			int randomNumber = randomMaker.nextInt(5) + 1;

			System.out.println(randomNumber);

			if (randomNumber == 1) {
				JOptionPane.showMessageDialog(null, "You look nice");
			} else if (randomNumber == 2) {
				JOptionPane.showMessageDialog(null, "You smell nice");
			} else if (randomNumber == 3) {
				JOptionPane.showMessageDialog(null, "The force is strong with this one...");
			} else if (randomNumber == 4) {
				JOptionPane.showMessageDialog(null, "I like how you type");
			} else if (randomNumber == 5) {
				JOptionPane.showMessageDialog(null, "You are kind");
			}
		}

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times

		// 3. Find someone to test out your program. They will like it :)
	}
}
