import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		if (payment >= 0 && payment <= Math.pow(10, 9)) {

			NumberFormat numberFormat = null;

			numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
			System.out.println("US: " + numberFormat.format(payment));

			Locale indianLocal = new Locale("en", "IN");
			numberFormat = NumberFormat.getCurrencyInstance(indianLocal);
			System.out.println("India: " + numberFormat.format(payment));

			numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
			System.out.println("China: " + numberFormat.format(payment));

			numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
			System.out.println("France: " + numberFormat.format(payment));
		}

	}

}
