import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		if ((s.length() >= 6 && s.length() <= 20)) {

			if (s.matches("^[a-zA-z0-9]+")) {
				try {
					MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
					byte[] hashInBytes = messageDigest.digest(s.getBytes(StandardCharsets.UTF_8));

					System.out.println(toHexString(hashInBytes));
				} catch (NoSuchAlgorithmException e) {
					System.out.print("No such Algorithm found:::");
					e.printStackTrace();
				}
			} else {
				System.out.println("Input only allows a-z A-z and 0-9");
			}
		} else {
			System.out.println("Input size must be greater than 6 and less than 20");
		}

	}

	public static String toHexString(byte[] hash) {
		// Convert byte array into signum representation
		BigInteger number = new BigInteger(1, hash);

		// Convert message digest into hex value
		StringBuilder hexString = new StringBuilder(number.toString(16));

		// Pad with leading zeros
		while (hexString.length() % 8 != 0) {
			hexString.insert(0, '0');
		}

		return hexString.toString();
	}

}
