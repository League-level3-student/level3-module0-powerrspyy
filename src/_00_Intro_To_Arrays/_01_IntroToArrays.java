package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings

        String[] strs = {"1", "2", "3", "4", "5"};

        // 2. print the third element in the array

        System.out.println(strs[2]);

        // 3. set the third element to a different value

        strs[2] = "6";

        // 4. print the third element again

        System.out.println(strs[2]);

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice

        for(int i=0;i<strs.length;i++){
            strs[i] = "0";
        }

        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        }

        // 7. make an array of 50 integers

        // 8. use a for loop to make every value of the integer array a random
        //    number

        // 9. without printing the entire array, print only the smallest number
        //    on the array
        Random rand = new Random();
        // 10 print the entire array to see if step 8 was correct
        System.out.println();
        System.out.println(rand.nextInt(100) + 1);
        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
