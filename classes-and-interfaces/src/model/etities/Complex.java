package model.etities;

/* Immutable complex number class.
 * Immutable classes are easier to design, implement, and use than mutable classes.
 * Complex class cannot be extended and requires no synchronization.
 */
public final class Complex {
	// It is initialized once
	private final double re; 
	private final double im;

	public Complex(double re, double im) {
		// Only when the object is created
		this.re = re; 
		this.im = im;
	}

	public double realPart() {
		return re;
	}

	public double imaginaryPart() {
		return im;
	}
	
	/*
	 * Return a new object always for safe.
	 * It protects the class against modifying this instance.
	 * It's known as functional approach.
	 */

	public Complex plus(Complex complex) {
		return new Complex(re + complex.re, im + complex.im);
	}

	public Complex minus(Complex complex) {
		return new Complex(re - complex.re, im - complex.im);
	}

	public Complex times(Complex complex) {
		return new Complex(re * complex.re - im * complex.im, re * complex.im + im * complex.re);
	}

	public Complex dividedBy(Complex complex) {
		double temp = complex.re * complex.re + complex.im * complex.im;
		return new Complex((re * complex.re + im * complex.im) / temp, (im * complex.re - re * complex.im) / temp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Complex))
			return false;
		Complex other = (Complex) obj;
		return Double.compare(other.re, re) == 0 && Double.compare(other.im, im) == 0;
	}

	@Override
	public int hashCode() {
		return 31 * Double.hashCode(re) + Double.hashCode(im);
	}

	@Override
	public String toString() {
		return "(" + re + " + " + im + "i)";
	}
}
