package medium;

import java.util.Stack;

public class RemovingStarsFromAString {

    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for (char c : s.toCharArray()) {
            stack.push(c);
        }

        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == '*') {
                count++;
            } else if (count == 0){
                sb.append(c);
            } else {
                count--;
            }
        }

        return sb.reverse().toString();
    }
}
