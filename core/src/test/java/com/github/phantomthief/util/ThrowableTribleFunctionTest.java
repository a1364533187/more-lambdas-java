package com.github.phantomthief.util;

import org.junit.jupiter.api.Test;

class ThrowableTribleFunctionTest {

    @Test
    void testApply() throws Throwable {
        ThrowableTribleFunction tribleFunction = (ThrowableTribleFunction<Integer, Integer, Integer, Integer, RuntimeException>) (
                i1, i2, i3) -> i1 + i2 + i3;

        System.out.println(tribleFunction.apply(3, 5, 9));
    }
}