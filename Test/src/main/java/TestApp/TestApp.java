package TestApp;

import java.util.Scanner;

/**
 * Created by udara on 3/28/18.
 */
public class TestApp {

    public static void main(String[] args) {
       Calculator cal = new Calculator();
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the two operand values:");
       double operand1 = input.nextDouble();
       double operand2 = input.nextDouble();
       System.out.println("Enter the operator:");
       char operator = input.next().charAt(0);

       System.out.print("Calculated value: "+cal.calculateValue(operator, operand1, operand2));
   }
}
