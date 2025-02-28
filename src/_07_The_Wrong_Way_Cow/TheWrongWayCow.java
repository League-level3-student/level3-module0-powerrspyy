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

		
		int dir1count = 0;
		int[] coord1 = new int[2];
		int dir2count = 0;
		int[] coord2 = new int[2];
		int dir3count = 0;
		int[] coord3 = new int[2];
		int dir4count = 0;
		int[] coord4 = new int[2];
		
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field[i].length; j++) {
				if(field[i][j] == 'c') {
					
					int check = checkForOs(field, i, j);
					System.out.println(check);
					if (check == 1) {
						dir1count ++;
						coord1 = new int[]{j,i};
					}
					else if (check == 2) {
						dir2count ++;
						coord2 = new int[]{j,i};
						
					}
					else if (check == 3) {
						dir3count ++;
						coord3 = new int[]{j,i};
						
					}
					else if (check == 4) {
						dir4count ++;
						coord4 = new int[]{j,i};
						
					}
					
					
				}
			}
		}
		
		if(dir1count == 1) {
			return coord1;
		}
		else if(dir2count == 1) {
			return coord2;
		}
		else if(dir3count == 1) {
			return coord3;
		}
		else if(dir4count == 1) {
			return coord4;
		}

		return null;
	}

	public static int checkForOs(final char[][] field, int x, int y) {

		int test_x = x;
		int test_y = y - 1;
// West
		if(test_y > 0) {
			if(field[test_x][test_y] == 'o') {
				if(field[test_x][test_y - 1] == 'w') {
					return 1;

				}
			}
		}

		test_y++;
		test_x++;
// South
		if(test_x < field.length - 1) {
			if(field[test_x][test_y] == 'o') {
				if(field[test_x + 1][test_y] == 'w') {
					return 2;

				}
			}
		}

		test_x--;
		test_y++;
// East
		if(test_y < field[test_x].length - 1) {
			if(field[test_x][test_y] == 'o') {
				if(field[test_x][test_y + 1] == 'w') {
					return 3;

				}
			}
		}

		test_y--;
		test_x--;
// North
		if(test_x > 0) {
			if(field[test_x][test_y] == 'o') {
				if(field[test_x - 1][test_y] == 'w') {
					return 4;

				}
			}
		}

			

		return 0;
	}
}
