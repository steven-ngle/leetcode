package easy;

public class NumberOfSegmentsInAString {

    public int countSegments(String s) {

        String[] segments = s.split(" ");
        int counter = 0;

        for(String str : segments) {
            if (!str.isEmpty()) {
                counter++;
            }
        }

        return counter;
    }
}
