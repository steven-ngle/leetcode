package easy;

public class CircularSentence {

    public boolean isCircularSentence(String sentence) {

        String[] arr = sentence.split(" ");
        int len = arr.length;

        if (arr[0].charAt(0) == arr[len - 1].charAt(arr[len - 1].length() - 1)) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i].charAt(0) != arr[i - 1].charAt(arr[i - 1].length() - 1)) return false;
            }
            return true;
        }

        return false;
    }
}
