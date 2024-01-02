package easy;

public class AverageValueOfEvenNumbersThatAreDivisibleByThree {

    public int averageValue(int[] nums) {

        int sum = 0, counter = 0;

        for (int num : nums) {
            if (num % 6 == 0) {
                sum += num;
                counter++;
            }
        }

        if (counter == 0) {
            return 0;
        }

        return sum / counter;
    }
}
