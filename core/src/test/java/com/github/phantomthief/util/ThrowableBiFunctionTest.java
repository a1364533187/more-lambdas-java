package com.github.phantomthief.util;

import org.junit.jupiter.api.Test;

class ThrowableBiFunctionTest {

    @Test
    void testApply() throws Throwable {
        ThrowableBiFunction biFunction = (ThrowableBiFunction<Integer, Integer, Integer, RuntimeException>) (i1, i2) -> i1 + i2;
        System.out.println(biFunction.apply(3, 4));
    }
}