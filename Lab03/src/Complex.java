public class Complex {
    private double real;
    private double imaginary = 0.0;

    final static Complex I = new Complex(0.0, 1.0);
    final static Complex ZERO = new Complex(0.0);
    final static Complex ONE = new Complex(1.0);

    Complex(double r, double im) {
        real = r;
        imaginary = im;
    }

    Complex(double r) {
        real = r;
    }

    Complex() {
        this(0.0);
    }

    @Override
    public String toString() {
        if (Double.compare(imaginary, 0.0) == 0)
            return "" + real;
        if (Double.compare(real, 0.0) == 0)
            return "" + imaginary + "i";
        return "" + real + (imaginary >= 0 ? " + " + imaginary : " - " + (-imaginary)) + "i";
    }

    public double getRe() {
        return real;
    }

    public void setRe(double r) {
        this.real = r;
    }

    public void setIm(double im) {
        this.imaginary = im;
    }

    public double getIm() {
        return imaginary;
    }

    static Complex add(final Complex c1, final Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    static Complex subtract(final Complex c1, final Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    static Complex multiply(final Complex c1, final Complex c2) {
        return new Complex(
                c1.real * c2.real - c1.imaginary * c2.imaginary,
                c1.imaginary * c2.real + c1.real * c2.imaginary
        );
    }

    static Complex multiply(final Complex c1, final double d) {
        Complex c2 = new Complex(d);
        return new Complex(
                c1.real * c2.real - c1.imaginary * c2.imaginary,
                c1.imaginary * c2.real + c1.real * c2.imaginary
        );
    }

    static Complex divide(final Complex c1, final Complex c2) {
        if (Double.compare(c2.real, 0.0) == 0 && Double.compare(c2.imaginary, 0.0) == 0)
            return new Complex(Double.longBitsToDouble(0x7ff8000000000000L), Double.longBitsToDouble(0x7ff8000000000000L));
        return new Complex(
                (c1.real * c2.real + c1.imaginary * c2.imaginary) / (c2.real * c2.real + c2.imaginary * c2.imaginary),
                (c1.imaginary * c2.real - c1.real * c2.imaginary) / (c2.real * c2.real + c2.imaginary * c2.imaginary)
        );
    }

    double mod() {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    static Complex sqrt(final double a) {
        if (a >= 0)
            return new Complex(Math.sqrt(a));
        return new Complex(0.0, Math.sqrt(-a));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex oComplex))
            return false;
        return Double.compare(this.real, oComplex.real) == 0
                && Double.compare(this.imaginary, oComplex.imaginary) == 0;
    }

    public void conjugate() {
        this.imaginary = -this.imaginary;
    }

    public void opposite() {
        this.real = -this.real;
        this.imaginary = -this.imaginary;
    }

}
