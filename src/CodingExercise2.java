
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("How old are you?");
		int lol = Integer.parseInt(age);
		if(lol>30){
			JOptionPane.showMessageDialog(null, "Sorry, you are too old to play this game. Better luck next time?");
			System.exit(0);
		}
		int year1 = 2016-lol;
		int year2 = 2015-lol;
		JOptionPane.showMessageDialog(null, "If you have had your birthday this year, you wer born in "+year1+". If you haven't had your birthday this year, you were born in "+year2+".");
		
	}

}



