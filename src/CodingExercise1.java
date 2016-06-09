import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	Robot lol = new Robot();

    	

   	
    	for (int i = 0; i < 1; i++) {
    		String colour = JOptionPane.showInputDialog("What color do you want your square?");
		
    	if(colour.equalsIgnoreCase("red")){
    		lol.setPenColor(Color.RED);
    	}
    	
    	else if(colour.equalsIgnoreCase("yellow")){
    		lol.setPenColor(Color.yellow);
    	}
    	else if(colour.equalsIgnoreCase("green")){
    		lol.setPenColor(Color.green);
    	}
    	else if(colour.equalsIgnoreCase("blue")){
    		lol.setPenColor(Color.blue);
    	}
    	else if(colour.equalsIgnoreCase("pink")){
    		lol.setPenColor(Color.pink);
    	}
    	else if(colour.equalsIgnoreCase("black")){
    		lol.setPenColor(Color.black);
    	}
    	else if(colour.equalsIgnoreCase("gray")){
    		lol.setPenColor(Color.gray);
    	}
    	else if(colour.equalsIgnoreCase("grey")){
    		lol.setPenColor(Color.gray);
    	}
    	else{
    		JOptionPane.showMessageDialog(null, "Sorry, I can't make that color. Why don't you try another one?");
    		i-=1;
    	}
    	}









   	 
    	
    	lol.setPenWidth(10);
    	lol.penDown();
    	lol.setSpeed(10);
    	for (int i = 0; i < 4; i++) {
    		lol.move(200);
    		lol.turn(-90);
			
		}
   	 
    }

}

