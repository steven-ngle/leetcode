package easy;

public class MaximumValueOfAStringInAnArray {

    public int maximumValue(String[] strs) {

        String letter = "abcdefghijklmnopqrstuvwxyz";
        int max = 0;

        for (String str : strs) {
            int temp = 0;
            if (str.matches("[0-9]+")) temp = Integer.parseInt(str);
            else temp = str.length();

            max = Math.max(temp, max);
        }

        return max;
    }
}
