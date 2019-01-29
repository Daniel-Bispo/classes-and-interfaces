package application;

import java.util.Locale;

import model.etities.Complex;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Complex c1 = new Complex(3.7, 8.5);

		System.out.println("Real part c1: " + c1.realPart());
		System.out.println("Imaginary part c1: " + c1.imaginaryPart());
		System.out.println(c1);

		Complex c2 = new Complex(9.0, 1.5);

		System.out.println("Real part c2: " + c2.realPart());
		System.out.println("Imaginary part c2: " + c2.imaginaryPart());
		System.out.println(c2);

		System.out.println("c1 plus c2: " + c1.plus(c2));

		System.out.println("c2 minus c1: " + c2.minus(c1));

		System.out.println("c1 times c2: " + c1.times(c2));

		System.out.println("c1 divided by c2: " + c1.dividedBy(c2));

		System.out.println("c1 equals c2: " + c1.equals(c2));

		System.out.println("c2 equals c1: " + c2.equals(c1));

		System.out.println("c1 equals c1: " + c1.equals(c1));

		System.out.println("c1 hash code: " + c1.hashCode());

		System.out.println("c2 hash code: " + c2.hashCode());

	}

}
