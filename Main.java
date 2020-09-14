import java.util.Scanner;

/**
 *To convert celcius to fahrenheit
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the scanner for user input
    Scanner input = new Scanner(System.in);

    String temp;

    // ask user for a temperature
    System.out.println("Please enter your temperature in celcius:");
    //initialize the users temperature
    temp = input.nextLine();

    final int CELCIUS_FAHRENHEIT = 9 / 5 + 32;

    int temperature = temp * CELCIUS_FAHRENHEIT;

  }
}
