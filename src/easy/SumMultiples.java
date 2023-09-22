package easy;

public class SumMultiples {

    public int sumOfMultiples(int n) {

        int counter = 1;
        int sum = 0;

        while (counter <= n) {

            if (counter % 3 == 0 || counter % 5 == 0 || counter % 7 == 0) {
                sum += counter;
            }
            counter++;
        }
        return sum;
    }
}
