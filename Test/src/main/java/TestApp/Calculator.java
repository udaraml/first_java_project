package TestApp;

/**
 * Created by udara on 3/28/18.
 */
public class Calculator {
    private double ans;

    public double calculateValue(char operator, double operand1, double operand2){

    switch(operator){
        case '+':
            ans = operand1 + operand2; // addition
            break;
        case '-':
            ans = operand1 - operand2; // substraction
            break;
        case '*':
            ans = operand1 * operand2; // multiplication
            break;
        case '/':
            ans = operand1 / operand2; // division
            break;
    }
    return ans;
}

}
