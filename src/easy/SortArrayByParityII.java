package easy;

public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] nums) {

        int even = 0;
        int odd = 1;
        int[] res = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                res[even] = num;
                even += 2;
            } else {
                res[odd] = num;
                odd += 2;
            }
        }

        return res;
    }
}
