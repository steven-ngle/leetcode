package easy;

import java.util.ArrayList;
import java.util.List;


public class KeyboardRow {

    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            int j = 0;
            boolean flag = false;
            if (firstRow.contains(String.valueOf(words[i].charAt(j)))) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (!firstRow.contains(String.valueOf(words[i].charAt(k)))) flag = true;
                }
                if (!flag) temp.add(words[i]);
            }

            if (secondRow.contains(String.valueOf(words[i].charAt(j)))) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (!secondRow.contains(String.valueOf(words[i].charAt(k)))) flag = true;
                }
                if (!flag) temp.add(words[i]);
            }

            if (thirdRow.contains(String.valueOf(words[i].charAt(j)))) {
                for (int k = 0; k < words[i].length(); k++) {
                    if (!thirdRow.contains(String.valueOf(words[i].charAt(k)))) flag = true;
                }
                if (!flag) temp.add(words[i]);
            }
        }

        String[] res = temp.toArray(new String[0]);

        return res;
    }
}
