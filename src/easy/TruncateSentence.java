package easy;

public class TruncateSentence {

    public String truncateSentence(String s, int k) {

        String[] arr = s.split(" ");

        if (arr.length < k) return s;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
