package hello11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hello.helloworld;

class HelloTest {

	@Test
    void testSayHello() {
        
        assertEquals("HelloWorld", helloworld.sayHello());
    }
}
