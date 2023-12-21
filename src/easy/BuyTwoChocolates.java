package easy;

public class BuyTwoChocolates {

    public int buyChoco(int[] prices, int money) {
        int sum = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (min1 >= price) {
                min2 = min1;
                min1 = price;
            } else if (min2 > price) {
                min2 = price;
            }

        }

        sum = min1 + min2;

        if (sum > money) {
            return money;
        } else {
            return money - sum;
        }
    }
}
