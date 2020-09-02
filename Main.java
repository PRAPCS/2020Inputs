
import java.util.Scanner; //imports the scanner class to use methods

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);// creates input scanner object to be usen in the program

    int num1;
    double num2;
    double product;

    System.out.println("Please input a number");
    num1 = input.nextInt();

    System.out.println("You entered: " + num1);

    System.out.println("Please input another number");
    num2 = input.nextDouble();
    System.out.println("You entered: " + num2);

    product = num1 * num2;

    System.out.println("The product of the two numbers is: " + product);

    System.out.println(1/2); //both values are int so answer is an int
    System.out.println(1/2.0); //if one is a double then the answer will be a double

    System.out.println(num1+" "+num2);//Adds a space between varibles
  }
}