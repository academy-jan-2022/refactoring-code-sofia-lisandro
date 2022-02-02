package com.fibonacci;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciIndexEdgeCaseShould {
    @Test
    public void whenNumberNotFoundThenIndexIsMinusOne() {

        Assert.assertEquals(-1, new FibonacciIndex().findIndexOf(7));
    }

    @Test
    public void cannotFindIndexOfNegativeNumber() {

        Assert.assertEquals(-1, new FibonacciIndex().findIndexOf(-1));
    }
}
