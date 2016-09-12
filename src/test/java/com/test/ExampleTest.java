package com.test;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class ExampleTest {

    @Test
    public void thisShouldBreakGradle() throws Exception {
        RuntimeException toBeThrown = mock(RuntimeException.class);

        Runnable ourRunnable = () -> {
            throw toBeThrown;
        };

        new Example().methodThrowsException(ourRunnable);
    }

}