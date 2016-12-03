package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * The {@link String} instance representing Calcul
     */
    final transient private Calcul calcul;

    /**
     * Defaut Constructor
     *
     * @param testName name of the test
     */
    public AppTest(final String testName) {
        super(testName);
        calcul = new Calcul();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */


    public void testAdditionner() {
        assertEquals("Test Additionner ", calcul.additionner(8, 4), 12);
    }


}
