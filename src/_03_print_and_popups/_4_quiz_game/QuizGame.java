package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String question = JOptionPane.showInputDialog("would you want to live with more than 10 cats?");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
		if (question .equals("yes")) {
			score++;
		} else {
			score--;
		}
				// 4.  if the user's answer was correct, add one to their score 
		question = JOptionPane.showInputDialog("would you like hotdogs or burgers?");
		
		if (question .equals("hotdogs")) {
			score++;
		} else { 
			score--;
		}
		
		question = JOptionPane.showInputDialog("do you wish you had (more) siblings?");
		
		if (question .equals("yes")) {
			score++;
		} else {
			score--;
		}
		
		JOptionPane.showMessageDialog(null, score);
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
