package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    stack.push(operate(operand1, operand2, token));
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private Integer operate(int operand1, int operand2, String token) {
        switch (token) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            default:
                return operand1 / operand2;
        }
    }
}
