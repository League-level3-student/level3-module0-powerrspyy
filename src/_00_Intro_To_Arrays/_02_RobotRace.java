package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] strs) {
		Random rand = new Random();
        // 2. create an array of 5 robots.
		Robot[] bots = new Robot[5];
        // 3. use a for loop to initialize the robots.
		for(int i=0; i<5; i++) {
			bots[i] = new Robot();
			bots[i].setX(i * 200 + 50);
			bots[i].setY(550);
		}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
		boolean noWinner = true;
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		while (noWinner){
			for(int i = 0; i< bots.length;i++) {
				bots[i].setY(bots[i].getY() - rand.nextInt(50) - 1);
				if (bots[i].getY() <= 50){
					noWinner = false;
					System.out.println("Winner");
					break;
				}
			}
		}
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
	}

}
