package easy;

public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (vowels.indexOf(arr[start]) == -1) {
                start++;
            } else if (vowels.indexOf(arr[end]) == -1) {
                end--;
            } else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        return new String(arr);
    }
}
