package de.rwth.swc.examples.triangletester;

public class TriangleTesterNew extends TriangleTester {

    private boolean isATriangle = false;

    private void isATriangle(int a, int b, int c) {
        isATriangle = ((a < (b + c)) && (b < (a + c)) && (c < (a + b)));
    }

    private String determineTriangleType(int a, int b, int c) {
        String result;
        if (isATriangle) {
            if ((a == b) && (b == c)) {
                result = "Triangle is Equilateral";
            } else {
                if ((a != b) && (a != c) && (b != c)) {
                    result = "Triangle is Scalene";
                } else {
                    result = "Triangle is Isosceles";
                }
            }
        } else {
            result = "Not a Triangle";
        }
        return result;
    }

    public String test(int a, int b, int c) {

        isATriangle(a, b, c);
        return determineTriangleType(a, b, c);
    }
}
