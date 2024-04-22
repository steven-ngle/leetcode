package easy;


public class CalculateDelayedArrivalTime {

    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int res = arrivalTime + delayedTime;

        return res % 24;
    }
}
