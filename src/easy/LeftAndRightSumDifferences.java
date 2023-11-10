package easy;

public class LeftAndRightSumDifferences {

    public int[] leftRightDifference(int[] nums) {

        int[] answer = new int[nums.length];

        if (nums.length > 1) {
            int[] leftSum = new int[answer.length];
            int[] rightSum = new int[answer.length];

            for (int i = 1; i < nums.length; i++) {
                leftSum[i] = leftSum[i - 1] + nums[i - 1];
            }

            for (int i = nums.length - 2; i >= 0; i--) {
                rightSum[i] = rightSum[i + 1] + nums[i + 1];
            }

            for (int i = 0; i < answer.length; i++) {
                answer[i] = leftSum[i] - rightSum[i];
                if (answer[i] < 0) {
                    answer[i] *= -1;
                }
            }
        }

        return answer;
    }
}
