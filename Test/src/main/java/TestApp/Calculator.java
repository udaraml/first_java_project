package TestApp;

/**
 * Created by udara on 3/28/18.
 */
public class Calculator {
    private double answer;

    public double calculateValue(char operator, double operand1, double operand2){

    switch(operator){
        case '+':
            answer = operand1 + operand2;
            break;
        case '-':
            answer = operand1 - operand2;
            break;
        case '*':
            answer = operand1 * operand2;
            break;
        case '/':
            answer = operand1 / operand2;
            break;
    }
    return answer;
}

}
