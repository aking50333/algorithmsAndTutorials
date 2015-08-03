package EvaluateReversePolishNotation;

import java.awt.geom.Line2D;
import java.util.Stack;

/**
 * Created by Ruben on 6/16/2015.
 */
public class EvaluateNotation {

    public static void main (String args[]){
        String [] array = {"4", "13", "5", "/", "+"};

        Stack<String> stack = new Stack<String>();

        String a;
        String b;
        String sign;
        Double current = 0.0;

        for (int i = 0; i < array.length; i++){
            if (array[i]!="+" && array[i]!="-" && array[i]!="*" && array[i]!="/")
                stack.push(array[i]);
            else{
                b = stack.peek();
                stack.pop();
                a = stack.peek();
                stack.pop();
                sign = array[i];
                current = operate(a, b, sign);
                stack.push(current.toString());
            }
        }
        System.out.println(current);



    }

    public static double operate(String a, String b, String sign){
        if (sign == "+")
            return sum(Double.parseDouble(a), Double.parseDouble(b));
        else if (sign == "-")
            return sub(Double.parseDouble(a), Double.parseDouble(b));
        else if (sign == "*")
            return mult(Double.parseDouble(a), Double.parseDouble(b));
        else if (sign == "/")
            return deriv(Double.parseDouble(a), Double.parseDouble(b));
        else
            return 0;
    }

    public static double sum (double a, double b){
        return a + b;
    }
    public static double sub (double a, double b){
        return a - b;
    }
    public static double mult (double a, double b){
        return a * b;
    }
    public static double deriv (double a, double b){
        return a / b;
    }
}
