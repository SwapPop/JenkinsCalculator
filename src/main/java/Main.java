import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    Scanner input=new Scanner(System.in);
    String command=null;
    int num1=-1;
    int num2=-1;

    System.out.println("Welcome to Jenkins Calculator! Type a command below:\n");
    boolean exit = false;
    while(!exit) {

      if (input.hasNext()) {
        command=input.next();
//        System.out.println(command);
      }

      switch (command) {
        case "add":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          if (input.hasNext()) {
            num2=Integer.valueOf(input.next());
//            System.out.println(num2);
          }
          System.out.println(calculator.add(num1, num2) + "\n");
          break;
        case "subtract":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          if (input.hasNext()) {
            num2=Integer.valueOf(input.next());
//            System.out.println(num2);
          }
          System.out.println(calculator.subtract(num1, num2) + "\n");
          break;
        case "multiply":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          if (input.hasNext()) {
            num2=Integer.valueOf(input.next());
//            System.out.println(num2);
          }
          System.out.println(calculator.multiply(num1, num2) + "\n");
          break;
        case "divide":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          if (input.hasNext()) {
            num2=Integer.valueOf(input.next());
//            System.out.println(num2);
          }
          System.out.println(calculator.divide(num1, num2) + "\n");
          break;
        case "fibonacci":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          System.out.println(calculator.fibonacciNumberFinder(num1) + "\n");
          break;
        case "binary":
          if (input.hasNext()) {
            num1=Integer.valueOf(input.next());
//        System.out.println(num1);

          }
          System.out.println(calculator.intToBinaryNumber(num1) + "\n");
          break;
        case "exit":
          System.out.println("Goodbye\n");
          exit = true;
          break;
        default:
          System.out.println("Commands: add [1] [2], subtract [1] [2], multiply [1] [2], divide [1] [2], fibonacci [n], binary [n], exit\n");
          break;
      }
    }

    exit(0);
  }
}
