/*
* The BlowUp porgram gets inputs like a3tx2z and translates them to strings of
* letters that are defined by their numbers also known as blowing them up
* (a3tx2z would be attttxzzz) if it was blown up
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-05-01
* Class BlowUp.
*/

import java.util.Scanner;

final class BlowUp {

  private BlowUp() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
  }

  /**
  * Asks user to input string and outputs blown up version.
  *
  * @param args
  */
  public static void main(final String[] args) {

    // defines the weird number that has to be there
    final float number = 48;

    // Defines the translated string that will be outputted at the end
    String finalString = " ";

    // Create a scanner object
    Scanner myObj = new Scanner(System.in);

    // prompts user to enter string input
    System.out.println("Enter a String with numbers next to letters such"
    + " as (4a5d6f):");
    // Read user inputted string input
    String userString = myObj.nextLine();

    // Runs a loop for how many charecters are in the string
    for (int charCounter = 0; charCounter < userString.length();
      charCounter++) {
      // Catches any errors
      try {
        /*
        * Determines whether or not character is a digit if it is,
        * then flags it
        */
        boolean flag = (Character.isDigit(userString.charAt(charCounter)));

        // Checks if any charecters were marked
        if (flag) {

          /*
          * Runs a loop for the value of the number in the select location
          * of the string
          */
          for (int counter = 0; counter < userString.charAt(charCounter)
               - number; counter++) { // -48 stops excess addition of letters

            // Adds letter to final string
            finalString = finalString + (userString.charAt(charCounter + 1));
          }
        // if a character isnt marked as a digit, add it to the final string
        } else {
          finalString = finalString + userString.charAt(charCounter);
        }
      //Prevents program from crashing when numbers are on the end of the string
      } catch (Exception e) {
        finalString = finalString + userString.charAt(charCounter);
      }
    }
    // Prints final blown up string
    System.out.println();
    System.out.println("Blown-up string:" + finalString);
    System.out.println();
    System.out.println("Done");
  }
}
