package RandomlyPickingQuestions;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char letter = s.charAt(i);
            if(letter  == '{' || letter == '(' || letter == '['){
                stack.push(letter);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char popped = stack.pop();
                if(letter == '}' && (popped == '(' ||popped == '[')){
                    return false;
                }
                else if (letter == ']' && (popped == '(' ||popped == '{')){
                    return false;
                }
                else if(letter == ')' && (popped == '{' ||popped == '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }

}
