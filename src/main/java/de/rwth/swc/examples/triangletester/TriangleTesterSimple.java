package de.rwth.swc.examples.triangletester;

public class TriangleTesterSimple extends TriangleTester {

    protected final String equilateral = "Triangle is Equilateral";
    protected final String isosceles = "Triangle is Isosceles";
    protected final String scalene = "Triangle is Scalene";

    @Override
    protected String test(final int a, final int b, final int c) {
        String type = this.scalene;
        if (a == b || b == c) {
            type = this.isosceles;
        }
        if (a == b && b == c) {
            type = this.equilateral;
        }
        return type;
    }

}
