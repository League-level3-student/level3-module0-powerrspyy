package _00_Intro_To_Arrays;

import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Run the FindHiddenButton.jar to see the finished product. */

public class _03_FindTheHiddenButton implements ActionListener{
    JFrame window;
    JPanel panel;

    // 1. create an array of JButtons. Don't initialize it yet.
    JButton[] buttons;
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    // 2. create an integer variable called hiddenButton
    int hiddenButton;

    public static void main(String[] args) {
        new _03_FindTheHiddenButton().start();
    }

    public void start() {
        window = new JFrame("Find the Button");
        panel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Ask the user to enter a positive number and convert it to an int
        int input = -1;
        System.out.println("Enter a positive number: ");
        try {
            input = Integer.parseInt(scan.nextLine());
            // Use the number
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
        
        
        while (input <= 0) {
            System.out.println("Enter a positive number: ");
            try {
                input = Integer.parseInt(scan.nextLine());
                // Use the number
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + e.getMessage());
            }
        }
        
        buttons = new JButton[input];
        	

        // 4. Initialize the array of JButtons to be the size of the int
        //    created in step 3

        // 5. Make a for loop to iterate through the JButton array
        for(int i = 0; i < buttons.length; i ++) {
        	buttons[i] = new JButton();
        	buttons[i].addActionListener(this);
        	panel.add(buttons[i]);
        }
        
            // 6. initialize each JButton in the array
        
            // 7. add the ActionListener to each JButton
        
            // 8. add each JButton to the panel

        // 9 add the panel to the window
        window.add(panel);

        // 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        


        // 11. set the JFrame to visible.
        window.setVisible(true);
        
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 12. Give the user the instructions for the game.

        // 13. initialize the hiddenButton variable to a random number less than
        //     the int created in step 3
        hiddenButton = random.nextInt(input);

        // 14. Set the text of the JButton located at hiddenButton to read "ME"
        buttons[hiddenButton].setText("ME!");
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        buttons[hiddenButton].setText("");

        // 15. Use Thread.sleep(100); to pause the program.

        // 16. Set the text of the JButton located at hiddenButton to be blank.

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton)e.getSource();
        
        if (buttons[hiddenButton] == buttonClicked) {
        	System.out.println("Found");
        	buttons[hiddenButton].setText("WINNER!");
        }
        else {
        	buttonClicked.setText("WRONG!");
        	try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        	buttonClicked.setText("");
        }

        // 17. if the hiddenButton is clicked, tell the user that they win.

        // 18. else tell them to try again
    }
}
