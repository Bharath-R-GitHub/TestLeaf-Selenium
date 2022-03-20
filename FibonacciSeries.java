package week1.day1.assignments;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1, sum = 0;
		System.out.print(firstNum + ", " + secNum + ", ");
		for (int i = 3; i <= range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.print(sum);
			if (i < range)
				System.out.print(", ");
		}
	}
}
