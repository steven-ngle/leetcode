package easy;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {

        int lCount = 0;
        int rCount = 0;
        int uCount = 0;
        int dCount = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') lCount++;
            else if (c == 'R') rCount++;
            else if (c == 'U') uCount++;
            else dCount++;
        }

        return lCount == rCount && uCount == dCount;
    }
}
