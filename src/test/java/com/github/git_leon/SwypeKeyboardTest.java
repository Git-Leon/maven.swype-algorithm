package com.github.git_leon;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author leonhunter
 * @created 04/06/2020 - 4:29 PM
 */
public class SwypeKeyboardTest {
    @Test
    public void test1() {
        test("bnhjkiaikjhnbvcxsze", Arrays.asList("boba", "non"));
    }

    private void test(String input, List<String> expected) {
        // given
        SwypeKeyboard keyboard = new SwypeKeyboard();

        // when
        List<String> actual = keyboard.getSuggestedWords(input);

        // then
        Assert.assertEquals(expected, actual);
    }
}
