package easy;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> uncommon = new ArrayList<>();
        String[] first = s1.split(" ");
        String[] second = s2.split(" ");

        for (String s : first) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String s : second) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }

        for (String s : hm.keySet()) {
            if (hm.get(s) == 1) {
                uncommon.add(s);
            }
        }
        String[] res = new String[uncommon.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = uncommon.get(i);
        }

        return res;
    }
}
