package easy;


public class RemoveTrailingZerosFromAString {

    public String removeTrailingZeros(String num) {

        return num.replaceAll("0*$", "");
    }
}
