package TestApp;

/**
 * Created by udara on 3/28/18.
 */
public class Calculator {
    private double ans;

    public double calculateValue(char operator, double operand1, double operand2){

    switch(operator){
        case '+':
            ans = operand1 + operand2;
            break;
        case '-':
            ans = operand1 - operand2;
            break;
        case '*':
            ans = operand1 * operand2;
            break;
        case '/':
            ans = operand1 / operand2;
            break;
    }
    return ans;
}

}
