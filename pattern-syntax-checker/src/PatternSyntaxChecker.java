import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			try {
				if (Pattern.compile(s) != null) {
					System.out.println("Valid");
				}
			} catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}

	}

}
