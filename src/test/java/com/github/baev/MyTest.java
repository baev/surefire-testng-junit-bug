package com.github.baev;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 03.02.16
 */
@RunWith(Parameterized.class)
public class MyTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[]{},
                new Object[]{},
                new Object[]{}
        );
    }

    @Test
    public void testWithParameters() throws Exception {
    }
}
