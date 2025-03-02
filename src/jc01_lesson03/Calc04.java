package jc01_lesson03;

public class Calc04 {
	public static void main(String[] args) {

		int n = 10;
		int m = 5;

		int s1;
		int s2;
		int s3;

		s1 = 80 / n;
		System.out.println(s1 + "л Молока в одном малом бидоне");

		s2 = 80 / n + 12;
		System.out.println(s2 + "л Молока в одном большом бидоне");

		s3 = (80 / n + 12) * m;
		System.out.println(s3 + "л Молока в " + m + " больших бидонах ");

	}
}
