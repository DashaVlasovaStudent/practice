package ru.ssau.tk.dasha.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testPalindrome() {
        Strings str = new Strings();
        assertTrue(str.palindrome("abccba"));
        assertFalse(str.palindrome("friend"));
        assertTrue(str.palindrome("abcdcba"));
    }
}