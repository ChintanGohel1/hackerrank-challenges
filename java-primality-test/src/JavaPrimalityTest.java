import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaPrimalityTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			BigInteger number = scanner.nextBigInteger();

			if (!(number.toString().length() > 100)) {

				if (number.isProbablePrime(1)) {
					System.out.println("prime");
				} else {
					System.out.println("not prime");
				}

			} else {
				System.out.println("only 100 digits allowed");
			}

		} catch (InputMismatchException ex) {
			System.out.println("Please enter valid number ::");
		}

	}

}
