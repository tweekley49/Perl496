package csu.csci325;
import java.util.Stack;

/**
 * Created by tweek on 3/28/2016.
 */
public class Palindrome {

    public Palindrome() {

    }

    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String compareString = "";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            compareString += stack.pop();
        }

        if (str.equals(compareString)) {
            return true;
        } else
            return false;


    }

}
