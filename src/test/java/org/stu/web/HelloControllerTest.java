package org.stu.web;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HelloControllerTest {
    @Test
    public void testShowHello() {
        HelloController helloController = new HelloController();
        assertEquals("hello", helloController.showHello());
    }
}
