package easy;

public class RotateString {

    public boolean rotateString(String s, String goal) {

        String s2 = s + s;

        return s2.contains(goal) && s.length() == goal.length();
    }
}
