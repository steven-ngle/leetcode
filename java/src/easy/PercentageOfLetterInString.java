package easy;

public class PercentageOfLetterInString {

    public int percentageLetter(String s, char letter) {
        double counter = 0;
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == letter) {
                counter++;
            }
        }

        return (int) (counter * 100) / s.length();
    }
}
