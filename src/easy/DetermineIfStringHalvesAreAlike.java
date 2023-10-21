package easy;

public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {

        String vowels = "aeiouAEIOU";
        int length = s.length();
        int counter1 = 0;
        int counter2 = 0;

        String a = s.substring(0, length/2);
        String b = s.substring(length/2);

        for (char c : a.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                counter1++;
            }
        }

        for (char c : b.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                counter2++;
            }
        }

        return counter1 == counter2;
    }
}
