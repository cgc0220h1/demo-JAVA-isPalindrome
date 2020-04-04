import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckTest {
    private StringCheck stringCheck;

    @DisplayName("Kiểm tra bằng Stack chuỗi Palindrome")
    @Test
    void testUseStackToCheckPalindrome() {
        stringCheck = new StringCheck("abcba");
        assertTrue(stringCheck.isPalindrome());
    }

    @DisplayName("Kiểm tra bằng Stack chuỗi không phải Palindrome")
    @Test
    void testUseStackToCheckNotPalindrome() {
        stringCheck = new StringCheck("abcdef");
        assertTrue(!stringCheck.isPalindrome());
    }
}