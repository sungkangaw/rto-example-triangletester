package de.rwth.swc.examples.triangletester.tests;

import de.rwth.swc.examples.triangletester.OutOfBoundsException;
import org.junit.Assert;
import org.junit.Test;

public class RobustnessBoundaryValueBoundaryValueTest extends BoundaryValueTestSetup {

    protected final int MIN_M = 0;
    protected final int MAX_P = 201;

    @Test(expected = OutOfBoundsException.class)
    public void nomNomMinM() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, NOM, MIN_M));
    }

    @Test(expected = OutOfBoundsException.class)
    public void nomNomMaxP() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, NOM, MAX_P));
    }

    @Test(expected = OutOfBoundsException.class)
    public void nomMinMNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, MIN_M, NOM));
    }

    @Test(expected = OutOfBoundsException.class)
    public void nomMaxPNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, MAX_P, NOM));
    }

    @Test(expected = OutOfBoundsException.class)
    public void minMNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(MIN_M, NOM, NOM));
    }

    @Test(expected = OutOfBoundsException.class)
    public void maxPNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(MAX_P, NOM, NOM));
    }
}
