import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		// validate input as per the constraints
		if (!(n >= 1 && n <= 200)) {
			System.out.println("N must be >=1 and <= 200");
			System.exit(0);
		}

		Collections.sort(Arrays.asList(s).subList(0, n), Collections.reverseOrder(new Comparator<String>() {

			@Override
			public int compare(String numberOne, String numberTwo) {

				if ((numberOne.contains(".") && numberOne.contains("-")) && (numberOne.length() - 2 > 300)
						&& (numberTwo.contains(".") && numberTwo.contains("-")) && (numberTwo.length() - 2 > 300)) {
					System.out.println("input must be <= 300 digit");
					System.exit(0);
				} else if ((numberOne.contains("-")) && (numberOne.length() - 1 > 300) && (numberTwo.contains("-"))
						&& (numberTwo.length() - 1 > 300)) {
					System.out.println("input must be <= 300 digit");
					System.exit(0);
				} else if ((numberOne.contains(".")) && (numberOne.length() - 1 > 300) && (numberTwo.contains("."))
						&& (numberTwo.length() - 1 > 300)) {
					System.out.println("input must be <= 300 digit");
					System.exit(0);
				} else {
					try {
						BigDecimal numOne = new BigDecimal(numberOne);
						BigDecimal numTwo = new BigDecimal(numberTwo);

						return numOne.compareTo(numTwo);
					} catch (NumberFormatException e) {
						System.out.println("Can not convert number in to bigdecimal" + e.getMessage());
						e.printStackTrace();
					}
				}
				return 0;
			}
		}));

		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}
	}

}
