package Calculator;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Ruben on 6/23/2015.
 */
public class Calculator {

    public static void main(String[] args) {

        String expression = "(121 + 345) - 2";
        System.out.println(calculate(expression));
    }

    public static int calculate(String expression) {
        int result = 0;
        expression = removeSpaces(expression);

        ArrayList<String> list= returnListOfStrings(expression);
        Stack<String> stack = new Stack<String>();

        for(int i =0; i< list.size(); i++){
            if (!list.get(i).equals(")")){
                stack.push(list.get(i));
            }else{
                ArrayList<String> curArray = new ArrayList<String>();
                while(stack.peek()!= "("){
                    curArray.add(stack.peek());
                    stack.pop();
                }
                stack.pop();

                while(curArray.size()!= 1){
                    int index = curArray.size()-1;
                    int a = Integer.parseInt(curArray.get(index));
                    int b = Integer.parseInt(curArray.get(index-2));
                    String sign = curArray.get(index-1);
                    curArray.remove(index);
                    curArray.remove(index-1);
                    curArray.remove(index-2);

                    if (sign == "+")
                        curArray.add((a+b) + "");
                    if (sign == "-")
                        curArray.add((a-b) + "");
                }

                stack.add(curArray.get(0));
            }
        }

        while(!stack.isEmpty()){
            int a = Integer.parseInt(stack.peek());
            stack.pop();
            String sign = stack.peek();
            stack.pop();
            int b = Integer.parseInt(stack.peek());
            stack.pop();

            if (!stack.isEmpty()){
                if (sign == "+")
                    stack.push((a + b) + "");
                if (sign == "-")
                    stack.push((b - a) + "");
            }else{
                if (sign == "+")
                    result = a + b;
                if (sign == "-")
                    result = b - a;
            }
        }
        return result;
    }


    public static ArrayList<String> returnListOfStrings(String string){
        ArrayList<String> list= new ArrayList<String>();
        char [] array = string.toCharArray();


        for (int i =0; i< array.length;){
            if (array[i] == '+'){
                list.add("+");
                i++;
            }
            else if (array[i] == '-'){
                list.add("-");
                i++;
            }

            else if (array[i] == '('){
                list.add("(");
                i++;
            }

            else if (array[i] == ')'){
                list.add(")");
                i++;
            }

            else{
                String res = "";
                while((array[i] != '+' && array[i] != '-' && array[i] != '(' && array[i] != ')')) {
                    if (i < array.length - 1) {
                        res = res + array[i];
                        i++;
                    } else {
                        res = res + array[i];
                        i++;
                        break;
                    }
                }
                list.add(res);
            }

        }
        return list;

    }

    public static String removeSpaces(String string){
        String[] array = string.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++ )
            result = result + array[i];
        return result;
    }



}
