package de.rwth.swc.examples.triangletester;

public class Triangle {
    public TrianlgeType type;

    enum TrianlgeType {
        SCALENE, ISOSCELES, EQUILATERAL, RIGHT
    }

    public double triangleArea(final double a, final double b, final double c) {
        this.type = TrianlgeType.SCALENE;
        if (a == b || b == c) {
            this.type = TrianlgeType.ISOSCELES;
        }
        if (a * a == b * b + c * c) {
            this.type = TrianlgeType.RIGHT;
        }
        if (a == b && b == c) {
            this.type = TrianlgeType.EQUILATERAL;
        }
        double area;
        switch (this.type) {
            case RIGHT:
                area = b * c / 2;
                break;

            case EQUILATERAL:
                area = a * a * Math.sqrt(3) / 4;
                break;

            default:
                final double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
        }
        return area;
    }

    public static void main(final String[] args) {
        final Triangle t = new Triangle();
        System.out.println(t.triangleArea(4, 3, 3) + " " + t.type);
    }

}
