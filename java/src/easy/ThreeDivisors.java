package easy;

public class ThreeDivisors {

    public boolean isThree(int n) {

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) count++;
        }

        return count == 3;
    }
}
