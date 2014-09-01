package com.scotth.reversewords;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void testReverseString(){
        String input = "hello world";
        ReverseString reversedString = new ReverseString(input);
        String correctAnswer = "olleh dlrow";
        assertEquals("A simple string matches", correctAnswer,reversedString.reverseString());
    }
}