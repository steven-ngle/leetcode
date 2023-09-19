package easy;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
    /*
    first try --> 74 / 95 testcases passed



        if (s.length() % 2 != 0) {
            return false;
        }

        int count = 0;

        String[] arr = {"()", "[]", "{}"};

        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i + 1))).equals(arr[j])) {
                    count++;
                }
            }
        }
        return count == (s.length() / 2);
    */

        // 2nd try
        Stack<Character> stack = new Stack();
        HashMap<Character, Character> map = new HashMap<>();

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) { // es wird geschaut, ob die Map den char c hat
                stack.push(map.get(c)); // wenn ja, dann leg den Wert von c auf den Stack
            }
            else if (stack.empty() || stack.pop() != c) { // oberstes Element des Stacks wird entfernt
                return false;
            }
        }
        return stack.empty();

    }
}
