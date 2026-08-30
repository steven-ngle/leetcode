package easy;

public class FindFirstPalindromicStringInTheArray {

    public String firstPalindrome(String[] words) {

        for (int i = 0; i < words.length; i++) {
            int r = words[i].length();

            if (r == 1) {
                return words[i];
            } else if (r == 2) {
                if (words[i].charAt(0) == words[i].charAt(1)) {
                    return words[i];
                }
            } else {

                int k = 0;
                int j = r - 1;

                while (words[i].charAt(k) == words[i].charAt(j)) {
                    k++;
                    j--;
                    if (k >= j) {
                        return words[i];
                    }
                }
            }
        }

        return "";
    }
}
