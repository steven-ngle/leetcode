import java.util.Map;
import java.util.Scanner;

public class FormatClassName {

    private static final Map<Character, Integer> ROMAN_VALUES = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000
    );

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a class name: ");
        String className = scanner.nextLine();
        System.out.println("Formatted class name: " + formatClassName(className));
    }

    public static String formatClassName(String className) {
        String[] words = className.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (isRomanNumeral(word)) {
                    sb.append(word.toUpperCase());
                } else {
                    sb.append(word.substring(0, 1).toUpperCase());
                    sb.append(word.substring(1).toLowerCase());
                }
            }
        }

        return sb.toString();
    }

    private static boolean isRomanNumeral(String word) {
        String s = word.toUpperCase();
        if (s.isEmpty() || !s.matches("[IVXLCDM]+")) {
            return false;
        }
        if (s.matches(".*(IIII|XXXX|CCCC|MMMM|VV|LL|DD).*")) {
            return false;
        }
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = ROMAN_VALUES.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = ROMAN_VALUES.get(s.charAt(i + 1));
                if (current < next) {
                    if (!((s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                            || (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                            || (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')))) {
                        return false;
                    }
                    total -= current;
                } else {
                    total += current;
                }
            } else {
                total += current;
            }
        }
        return total >= 1 && total <= 3999;
    }
}
