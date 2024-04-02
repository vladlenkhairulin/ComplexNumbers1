package Model.Domain;

public class ComplexNumber {
    private double real;
    private double imag;
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + -imag + "i";
        }
    }
}
