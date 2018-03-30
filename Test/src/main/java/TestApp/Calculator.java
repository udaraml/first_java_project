package TestApp;

/**
 * Created by udara on 3/28/18.
 */
public class Calculator {
    private double answer; 

    public double calculateValue(char operator, double operand1, double operand2){

    switch(operator){
        case '+':
            answer = operand1 + operand2; //addition
            break;
        case '-':
            answer = operand1 - operand2; //substraction
            break;
        case '*':
            answer = operand1 * operand2; //multiplication
            break;
        case '/':
            answer = operand1 / operand2; //division
            break;
    }
    return answer;
}

}
