package net.eisele.demo.spec.test;

import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
@SpecVersion(spec = "spectests", version = "1.0.0")
public class AppTest {

    @Test
    @SpecAssertion(section = "2", id = "a")
    public void simpleTestForAssertion() {
        App app = new App();
        assertEquals(app.sayHello("Markus"), "Hello Markus");
    }

    @Test
    @SpecAssertion(section = "3", id = "a")
    public void unmatchedAssertion() {
        assertTrue(true);
    }

    @Test
    @SpecAssertion(section = "2.1", id = "a")
    public void anotherSimpleTestForAssertion() {
        assertTrue(true);
    }

    @Test
    @SpecAssertion(section = "2.2", id = "a")
    public void lastSimpleTestForAssertion() {
        assertTrue(true);
    }

   
}
