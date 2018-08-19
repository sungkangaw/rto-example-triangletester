package de.rwth.swc.examples.triangletester.tests;

import org.junit.Assert;
import org.junit.Test;

import de.rwth.swc.examples.triangletester.OutOfBoundsException;

public class BoundaryValueBoundaryValueTest extends BoundaryValueTestSetup {

    @Test
    public void nomNomMin() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, NOM, MIN));
    }

    @Test
    public void nomNomMinP() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, NOM, MIN_P));
    }

    @Test
    public void nomNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_EQUILATERAL, tester
                .testTriangle(NOM, NOM, NOM));
    }

    @Test
    public void nomNomMaxM() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, NOM, MAX_M));
    }

    @Test
    public void nomNomMax() throws OutOfBoundsException {
        Assert.assertEquals(NOT_A_TRIANGLE, tester
                .testTriangle(NOM, NOM, MAX));
    }

    @Test
    public void nomMinNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, MIN, NOM));
    }

    @Test
    public void nomMinPNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, MIN_P, NOM));
    }

    @Test
    public void nomMaxMNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(NOM, MAX_M, NOM));
    }

    @Test
    public void nomMaxNom() throws OutOfBoundsException {
        Assert.assertEquals(NOT_A_TRIANGLE, tester
                .testTriangle(NOM, MAX, NOM));
    }

    @Test
    public void minNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(MIN, NOM, NOM));
    }

    @Test
    public void minPNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(MIN_P, NOM, NOM));
    }

    @Test
    public void maxMNomNom() throws OutOfBoundsException {
        Assert.assertEquals(TRIANGLE_IS_ISOSCELES, tester
                .testTriangle(MAX_M, NOM, NOM));
    }

    @Test
    public void maxNomNom() throws OutOfBoundsException {
        Assert.assertEquals(NOT_A_TRIANGLE, tester
                .testTriangle(MAX, NOM, NOM));
    }

}