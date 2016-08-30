/*******************************************************************************
* Filename: ArrayMaker.Java
* Author: Conklin, Jason
* Date: August 30, 2016
* Description: This class keeps track of a single array per instance, allowing it
*              to be initialized, populated, and printed through method calls.
* Input: None
* Output: Console
*******************************************************************************/
package arraymaker;

/**
 *
 * @author jconklin2391
 */
public class ArrayMaker {
    
    int[] arrayOfInts; //integer array that is manipulated by the class' methods
    
    /*******************************************************************************
    * Method: arrayInit
    * Description: Initializes arrayOfInts to a length specified by the user
    * Parameters: int arrayLength
    * Pre-Conditions: arrayOfInts must be declared.
    * Post-Conditions: arrayOfInts will have been initialized with a length equal
    *                  to arrayLength.
    *******************************************************************************/
    void arrayInit(int arrayLength){
        this.arrayOfInts = new int[arrayLength]; //arrayOfInts now initialized
    }
    /*******************************************************************************
    * Method: arrayPopulate
    * Description: sets each index of arrayOfInts to its index + 1
    * Parameters: None
    * Pre-Conditions: arrayOfInts must have been initialized.
    * Post-Conditions: each index of arrayOfInts now has a value equal to its index + 1
    *******************************************************************************/
    void arrayPopulate(){
        for (int i = 0; i < (this.arrayOfInts.length); i++) {
            arrayOfInts[i] = i + 1; //arrayOfInts[i] equal to its own index + 1
        }
    }
    /*******************************************************************************
    * Method: arrayPrint
    * Description: prints the value at each index of the array on its own line
    * Parameters: None
    * Pre-Conditions: arrayOfInts must have been initialized.
    * Post-Conditions: Prints output to the console
    *******************************************************************************/
    void arrayPrint(){
        System.out.println("Printing your array:");
        for (int i = 0; i < (this.arrayOfInts.length); i++) {
            System.out.println(arrayOfInts[i]);
        }
    }
}
