/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
 */

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

	public static int[] findWrongWayCow(final char[][] field) {
		// Fill in the code to return the [col, row] coordinate position of the
		// head (letter 'c') of the wrong way cow!

		boolean Top = false;
		boolean Bottom = false;
		boolean Left = false;
		boolean Right = false;

		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field.length; j++) {
				if(field[i][j] == 'c') {
					checkForOs(field, j, i);
				}
			}
		}

		return null;
	}

	public int checkForOs(final char[][] field, int x, int y) {

		int test_x = x;
		int test_y = y - 1;

		if(test_y > -1) {
			if(field[test_x][test_y] == 'o') {
				return 1;
			}
		}

		test_y++;
		test_x++;

		if(test_x < field.length) {
			if(field[test_x][test_y] == 'o') {
				return 2;
			}
		}

		test_x--;
		test_y++;

		if(test_y < field[0].length) {
			if(field[test_x][test_y] == 'o') {
				return 3;
			}
		}

		test_y--;
		test_x--;

		if(test_x > -1) {
			if(field[test_x][test_y] == 'o') {
				return 4;
			}
		}

			

		return 0;
	}
}
