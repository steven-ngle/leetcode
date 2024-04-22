package easy;


public class NumberOfSeniorCitizens {

    public int countSeniors(String[] details) {

        int count = 0;
        for (String s : details) {
            int i = Integer.parseInt(s.substring(11, 13));
            if (i > 60) count++;
        }

        return count;
    }
}
