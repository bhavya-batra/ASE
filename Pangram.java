import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.replaceAll(" ", "").toLowerCase();
        Set<Character> characters = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                characters.add(c);
            }
        }
        return characters.size() == 26;
    }
}
