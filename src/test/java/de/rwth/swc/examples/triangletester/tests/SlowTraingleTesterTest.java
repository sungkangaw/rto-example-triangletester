package de.rwth.swc.examples.triangletester.tests;

import de.rwth.swc.examples.triangletester.TriangleTester;
import de.rwth.swc.examples.triangletester.TriangleTesterTopDown;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class SlowTraingleTesterTest {

    private final String TRIANGLE_IS_EQUILATERAL = "Triangle is Equilateral";
    private final String TRIANGLE_IS_SCALENE = "Triangle is Scalene";

    private TriangleTester triangleTester;

    @Before
    public void setup() {
        triangleTester = new TriangleTesterTopDown();
    }

    @Test
    public void SlowTest1() throws Exception {
        TimeUnit.SECONDS.sleep(6);
        assertThat(triangleTester.testTriangle(3,4,5), equalTo(TRIANGLE_IS_SCALENE));
    }

    @Test
    public void SlowTest2() throws Exception {
        TimeUnit.SECONDS.sleep(4);
        assertThat(triangleTester.testTriangle(3,3,3), equalTo(TRIANGLE_IS_EQUILATERAL));
    }
}
