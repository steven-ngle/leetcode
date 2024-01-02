package easy;

public class CheckIfNumbersAreAscendingInASentence {

    public boolean areNumbersAscending(String s) {

        String[] str = s.split(" ");
        int previous = 0;

        for(String st : str){
            if (Character.isDigit(st.charAt(0))) {
                int num = Integer.parseInt(st);
                if (num <= previous) {
                    return false;
                } else {
                    previous = num;
                }
            }
        }

        return true;
    }
}
