package easy;


public class DetectCapital {

    public boolean detectCapitalUse(String word) {

        if (word.matches("[a-z]*")) return true;
        if (word.matches("[A-Z]*")) return true;

        int index = 1;
        if (Character.isUpperCase(word.charAt(0))) {
            while (index < word.length() && Character.isLowerCase(word.charAt(index))) {
                index++;
            }
        }


        return index == word.length();
    }
}
