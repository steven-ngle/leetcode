package easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {

    public int strStr(String haystack, String needle) {

        int index = 0;
        int length = needle.length();

        while (length <= haystack.length()) {
            if (needle.equals(haystack.substring(index, length))) {
                return index;
            }
            index++;
            length++;
        }

        return -1;
    }
}
