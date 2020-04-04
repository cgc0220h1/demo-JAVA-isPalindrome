import java.util.Stack;

public class StringCheck {
    private String input;
    private Stack<Character> stringStack;
    private char[] chars;

    public StringCheck(String input) {
        this.input = input;
        stringStack = new Stack<>();
        convertToArray();
    }

    private void convertToArray() {
        chars = input.toCharArray();
    }

    public boolean isPalindrome() {
        for (char ch : chars) {
            stringStack.push(ch);
        }
        for (char ch : chars) {
            if (ch != stringStack.pop()) {
                return false;
            }
        }
        return true;
    }
}
