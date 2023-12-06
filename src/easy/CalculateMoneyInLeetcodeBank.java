package easy;

public class CalculateMoneyInLeetcodeBank {

    public int totalMoney(int n) {

        int sum = 0;
        int dollar = 1;
        int monday = 1;
        int counter = 0;

        while (n > 0) {
            sum += dollar;
            dollar++;
            counter++;
            if (counter == 7) {
                monday++;
                dollar = monday;
                counter = 0;
            }
            n--;
        }

        return sum;
    }
}
