package easy;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {

    public double average(int[] salary) {

        double sum = 0;
        Arrays.sort(salary);
        int i = 1;

        while (i < salary.length - 1) {
            sum += salary[i];
            i++;
        }

        return sum / (salary.length - 2);
    }
}
