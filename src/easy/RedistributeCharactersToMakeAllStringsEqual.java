package easy;

public class RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {

        int[] counts = new int[26];

        for (String word : words) {
            for (char c : word.toCharArray()) {
                counts[c - 'a']++;
            }
        }

        for (int count : counts) {
            if (count % words.length != 0) {
                return false;
            }
        }

        return true;
    }
}