package ru.ssau.tk.dasha.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {

    @Test
    public void testPalindrome() {
        Strings str = new Strings();
        assertEquals(str.palindrome("abccba"), true);
        assertEquals(str.palindrome("friend"), false);
        assertEquals(str.palindrome("abcdcba"), true);
    }
}