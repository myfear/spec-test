/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.eisele.demo.spec.test;

import org.jboss.test.audit.annotations.SpecAssertion;
import org.jboss.test.audit.annotations.SpecVersion;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

/**
 *
 * @author eiselem
 */
@SpecVersion(spec = "spectests", version = "")
public class AppTestUnversioned {

    @Test
    @SpecAssertion(section = "4", id = "a")
    public void unmatchedUnversionedAssertion() {
        assertTrue(true);
    }
}
