package de.rwth.swc.examples.triangletester.tests;

import de.rwth.swc.examples.triangletester.TriangleTester;
import de.rwth.swc.examples.triangletester.TriangleTesterTopDown;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class FailedTriangleTesterTest {
    private final String NOT_A_TRIANGLE = "Not a Triangle";
    private final String TRIANGLE_IS_EQUILATERAL = "Triangle is Equilateral";
    private final String TRIANGLE_IS_ISOSCELES = "Triangle is Isosceles";
    private final String TRIANGLE_IS_SCALENE = "Triangle is Scalene";

    private TriangleTester triangleTester;

    @Before
    public void setup() {
        triangleTester = new TriangleTesterTopDown();
    }

    @Test
    public void failedTest1() throws Exception {
        assertThat(triangleTester.testTriangle(3,4,5), equalTo(NOT_A_TRIANGLE));
    }

    @Test
    public void failedTest2() throws Exception {
        assertThat(triangleTester.testTriangle(2,4,5), equalTo(TRIANGLE_IS_ISOSCELES));
    }
}
