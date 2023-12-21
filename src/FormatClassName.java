import java.util.Scanner;

public class FormatClassName {

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
                sb.append(word.substring(0, 1).toUpperCase());
                sb.append(word.substring(1).toLowerCase());
            }
        }

        return sb.toString();
    }
}
