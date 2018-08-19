package de.rwth.swc.examples.triangletester;

public abstract class TriangleTester {

    public String testTriangle(final int a, final int b, final int c)
            throws OutOfBoundsException {
        final int min = 1;
        final int max = 200;
        if ((a < min) || (b < min) || (c < min)) {
            throw new OutOfBoundsException();
        }
        if ((a > max) || (b > max) || (c > max)) {
            throw new OutOfBoundsException();
        }

        return this.test(a, b, c);
    }

    protected abstract String test(int a, int b, int c);

}
