package de.rwth.swc.examples.triangletester.tests;

import de.rwth.swc.examples.triangletester.TriangleTester;
import de.rwth.swc.examples.triangletester.TriangleTesterTopDown;
import org.junit.BeforeClass;

public abstract class BoundaryValueTestSetup {
    protected final String NOT_A_TRIANGLE = "Not a Triangle";
    protected final String TRIANGLE_IS_EQUILATERAL = "Triangle is Equilateral";
    protected final String TRIANGLE_IS_ISOSCELES = "Triangle is Isosceles";
    protected final String TRIANGLE_IS_SCALENE = "Triangle is Scalene";

    protected final int MIN = 1;
    protected final int MIN_P = 2;
    protected final int NOM = 100;
    protected final int MAX_M = 199;
    protected final int MAX = 200;

    protected static TriangleTester tester;

    @BeforeClass
    public static void setTriangleTester() throws Exception {
        BoundaryValueTestSetup.tester = new TriangleTesterTopDown();
    }
}
