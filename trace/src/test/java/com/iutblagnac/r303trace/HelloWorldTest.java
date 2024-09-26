package com.iutblagnac.r303trace;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.iutblagnac.r303trace.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testHellosansParametre() {
        HelloWorld hello = new HelloWorld();
        assertEquals("Hello World!", hello.hello());
    }

}