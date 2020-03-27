package com.shenba.example1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompareDatesImpl implements CompareDates {

	//this method uses LocalDate class
	@Override
	public int compareDates(String date1, String date2, String dateFormat) {
		LocalDate ld1 = LocalDate.parse(date1, DateTimeFormatter.ofPattern(dateFormat));
		LocalDate ld2 = LocalDate.parse(date2, DateTimeFormatter.ofPattern(dateFormat));
		return ld1.compareTo(ld2);
	}

}
