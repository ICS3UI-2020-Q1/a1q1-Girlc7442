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

    //Declare a variable to store name
    String temperature;

    // ask user for a temperature
    System.out.println("Please enter your temperature in celcius:");
    //initialize the users temperature
    int temp = input.nextInt();

    //Takes the users temperature and applies the formula to convert it to fahrenheit
    final int CELCIUS_FAHRENHEIT = temp * 9 / 5 + 32;

    //initializes the formula
    int finalTemp = CELCIUS_FAHRENHEIT;

    //tell the user the converted temperature
    System.out.println("your temperature is " + finalTemp);
  }
}
