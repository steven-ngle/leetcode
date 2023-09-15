package easy;

public class ValidParentheses {

    /*
    first try --> 74 / 95 testcases passed

    public boolean isValid(String s) {

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
    }
    */
}
