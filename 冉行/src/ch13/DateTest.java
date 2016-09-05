package ch13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		String date = "2009-03-31  11:3:12.773";
		String str = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(str);
		Date d = sdf.parse(date);
		String newDate = sdf.format(d);
		System.out.println(newDate);
	}
}
