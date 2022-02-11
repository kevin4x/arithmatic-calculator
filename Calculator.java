import java.util.Scanner;

// git@github.com:kevin4x/arithmatic-calculator.git
// https://github.com/kevin4x/arithmatic-calculator.git

class Calculator {
  public static void main(String[] args) {

    char operator;
    int number1, number2, result;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // enter / parse number
    System.out.println("Enter first number");
    number1 = input.nextInt();
    
    // enter / parse operator
    System.out.println("Choose an operator: +, -, *, or /");
    operator = input.next().charAt(0);

    // enter / parse number
    System.out.println("Enter second number");
    number2 = input.nextInt();

    switch (operator) {
      case '+':  // add numbers
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;
      case '-':  // subtract numbers
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;
      case '*':  // multiply numbers
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;
      case '/':  // divide numbers
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;
      default:  // invalid operator throw error message5
    	  
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}