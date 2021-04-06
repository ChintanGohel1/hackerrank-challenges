import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {

		Calendar calender = Calendar.getInstance();

		// 1st way
		calender.set(year, month - 1, day);
		String answer = null;

		switch (calender.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			answer = "SUNDAY";
			break;
		case Calendar.MONDAY:
			answer = "MONDAY";
			break;
		case Calendar.TUESDAY:
			answer = "TUESDAY";
			break;
		case Calendar.WEDNESDAY:
			answer = "WEDNESDAY";
			break;
		case Calendar.THURSDAY:
			answer = "THURSDAY";
			break;
		case Calendar.FRIDAY:
			answer = "FRIDAY";
			break;
		case Calendar.SATURDAY:
			answer = "SATURDAY";
			break;

		}
		return answer;

		// 2nd way
//		calender.set(Calendar.DAY_OF_MONTH,day);
//		calender.set(Calendar.MONTH,month-1);
//		calender.set(Calendar.YEAR,year);
//		
//		return calender.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();

	}

}

public class JavaDateAndTime {
	public static void main(String[] args) throws IOException {

		String res = Result.findDay(8, 5, 2015);
		System.out.println(res);
	}
}
