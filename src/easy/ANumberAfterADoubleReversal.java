package easy;


public class ANumberAfterADoubleReversal {

    public boolean isSameAfterReversals(int num) {

        if (num < 10) return true;

        String numb = String.valueOf(num);

        if (numb.charAt(numb.length() - 1) == '0') return false;

        return true;
    }
}
