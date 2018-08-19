package de.rwth.swc.examples.triangletester;

public class TriangleTesterTopDown extends TriangleTester {

    protected final String expNotTriangle = "Not a Triangle";
    protected final String expEquilateral = "Triangle is Equilateral";
    protected final String expIsosceles = "Triangle is Isosceles";
    protected final String expScalene = "Triangle is Scalene";

    private int a;
    private int b;
    private int c;
    private String ergebnis;

    @Override
    public String test(final int aSeite, final int bSeite, final int cSeite) {
        this.a = aSeite;
        this.b = bSeite;
        this.c = cSeite;
        this.analysiereSeiten();
        return this.ergebnis;

    }

    private void analysiereSeiten() {
        if (this.istEinDreieck()) {
            this.bestimmeDreieckTyp();
        } else {
            this.ergebnis = this.expNotTriangle;
        }
    }

    private boolean istEinDreieck() {
        return ((this.a < (this.b + this.c)) && (this.b < (this.a + this.c)) && (this.c < (this.a + this.b)));
    }

    private void bestimmeDreieckTyp() {
        if (this.istGleichseitig()) {
            this.ergebnis = this.expEquilateral;
        } else {
            if (this.istNichtGleichseitig()) {
                this.ergebnis = this.expScalene;
            } else {
                this.ergebnis = this.expIsosceles;
            }
        }
    }

    private boolean istGleichseitig() {
        return ((this.a == this.b) && (this.b == this.c));
    }

    private boolean istNichtGleichseitig() {
        return ((this.a != this.b) && (this.a != this.c) && (this.b != this.c));
    }

}
