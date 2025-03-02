package jc01_lesson03;

public class Calc06 {
	public static void main(String[] args) {

		double a = 0.5;
		double b = 5.4;
		double c = 7.1;
		double rez;

		rez = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(" Результат равен " + rez);

	}
}
