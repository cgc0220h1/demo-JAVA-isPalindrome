import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        do {
            System.out.print("Enter string you want to check, enter 0 to quit: ");
            str = scanner.nextLine();
            if (!str.equals("0")) {
                StringCheck stringCheck = new StringCheck(str);
                if (stringCheck.isPalindrome()) {
                    System.out.println("This is a Palindrome!");
                } else {
                    System.out.println("This is not a Palindrome!");
                }
            }
        } while (!str.equals("0"));
    }
}
