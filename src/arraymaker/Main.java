/**
 * *****************************************************************************
 * Filename: Main.Java
 * Author: Conklin, Jason
 * Date: August 30, 2016
 * Description: Main class responsible for program's primary function
 * Input: Keyboard
 * Output: Console
 ******************************************************************************
 */
package arraymaker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*declaration and initialization of variables*/
        Scanner scanner = new Scanner(System.in); //for input
        ArrayMaker arrayMaker = new ArrayMaker(); // array manipulation
        int userChoice; //int to store user's input
        boolean exit = false; // boolean to allow for repeated inputs until exit command given

        /* loop to allow repeated "plays" */
        while (!exit) {
            System.out.println("How long do you want your array? (0 to exit)");
            userChoice = scanner.nextInt();//grab user's input

            /* check to see if user wants to exit*/
            if (userChoice == 0) {
                exit = true; //breaks the loop
                System.out.println("Bye!");
            } else { //if loop is still going, create and print the array
                arrayMaker.arrayInit(userChoice);
                arrayMaker.arrayPopulate();
                arrayMaker.arrayPrint();
            }
        }

    }

}
