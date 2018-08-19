package de.rwth.swc.examples.triangletester;

public class TriangleTesterClassic extends TriangleTester {

    public String test(int a, int b, int c) {
        int match = 0;
        String result;

        if (a == b)
            match = match + 1;
        if (a == c)
            match = match + 2;
        if (b == c)
            match = match + 3;

        if (match == 0)
            if ((a + b) <= c)
                result = "Not a Triangle";
            else if ((b + c) <= a)
                result = "Not a Triangle";
            else if ((a + c) <= b)
                result = "Not a Triangle";
            else
                result = "Triangle is Scalene";
        else if (match == 1)
            if ((a + b) <= c)
                result = "Not a Triangle";
            else
                result = "Triangle is Isosceles";
        else if (match == 2)
            if ((a + c) <= b)
                result = "Not a Triangle";
            else
                result = "Triangle is Isosceles";
        else if (match == 3)
            if ((b + c) <= a)
                result = "Not a Triangle";
            else
                result = "Triangle is Isosceles";
        else
            result = "Triangle is Equilateral";
        return result;
    }
}
