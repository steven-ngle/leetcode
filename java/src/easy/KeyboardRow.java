package easy;

import java.util.ArrayList;
import java.util.List;


public class KeyboardRow {

    // first version
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

    /* second version

    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thirdRow = "zxcvbnmZXCVBNM";

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            int j = 0;
            boolean flag = false;
            flag = isFlag(words, firstRow, temp, i, j, flag);
            flag = isFlag(words, secondRow, temp, i, j, flag);
            flag = isFlag(words, thirdRow, temp, i, j, flag);
        }

        return temp.toArray(new String[0]);
    }

    private boolean isFlag(String[] words, String firstRow, List<String> temp, int i, int j, boolean flag) {
        if (firstRow.contains(String.valueOf(words[i].charAt(j)))) {
            for (int k = 0; k < words[i].length(); k++) {
                if (!firstRow.contains(String.valueOf(words[i].charAt(k)))) {
                    flag = true;
                    break;
                }
            }
            if (!flag) temp.add(words[i]);
        }
        return flag;
    }

     */
}
