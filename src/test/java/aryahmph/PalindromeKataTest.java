package aryahmph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeKataTest {
    @Test
    void test0() {
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("a"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("katak"));
    }

    @Test
    void test1() {
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("abab"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("ayam"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("akuda"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("kodok"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("aaa"));
    }

    @Test
    void test2() {
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("abcdeedcba"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("eeeaeee"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("ayarraya"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("abcdeadcba"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("abcdefghijkihgfedcba"));
    }

    @Test
    void test3() {
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("kukukkukuk"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("aryagantenggnetnagayra"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("ngasalbangetinihmmmm"));
    }

    @Test
    void test4() {
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("wkwkwkwkwkwkwkwkwkwkw"));
        Assertions.assertTrue(PalindromeKataSolution.isPalindrome("wkwkwkwkwkwkwkwkwkwkwwkwkwkwkwkwkwkwkwkwkw"));
        Assertions.assertFalse(PalindromeKataSolution.isPalindrome("wkwkwkwkwkwkwkwkwkwkwwkwkwkwwkwkwkwkwkwkwkwwkwkwkwkwkwkwkwkwkwkw"));
    }
}
