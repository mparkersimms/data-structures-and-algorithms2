package utilities;

import java.util.Stack;

public class MultiBracketValidation {

    public static boolean multiBracketValidation(String input){
        Stack<Character> testStack = new Stack<>();
        for( int i = 0; i < input.length(); i++){
            char value = input.charAt(i);
            if(value == '(' || value == '{' || value == '[' ){
                testStack.push(value);
            }
            if(value == ')' || value == '}' || value == ']' ){
                char top = testStack.pop();
                switch(value){
                    case ')':
                        if(top == '{' || top == '['){
                            return false;
                        }
                            break;
                    case '}':
                        if(top == '[' || top == '('){
                            return false;
                        }
                            break;
                    case ']':
                        if(top == '(' || top == '{'){
                            return false;
                        }
                            break;
                }

            }

        }
        System.out.println(testStack);
        return (testStack.isEmpty());
        }
}

