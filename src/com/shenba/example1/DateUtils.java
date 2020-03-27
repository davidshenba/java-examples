package com.shenba.example1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	
	//this method is using LocalDateTime class which can compare date-time values
	public static int dateCompare(String dt1, String dt2, String format) {
		LocalDateTime ldt1 = LocalDateTime.parse(dt1, DateTimeFormatter.ofPattern(format));
		LocalDateTime ldt2 = LocalDateTime.parse(dt2, DateTimeFormatter.ofPattern(format));
		return ldt1.compareTo(ldt2);
	}

}
