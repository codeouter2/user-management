package com.auth.user.management.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateAndTime {
	
	static Logger logger = LoggerFactory.getLogger(DateAndTime.class);

	public static String tokenExpireDate(int second) {
		logger.debug("Entry into token expire date");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date currentDate = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.SECOND, second);
		Date expiredate = c.getTime();
		logger.debug("Exit from token expire date");
		return dateFormat.format(expiredate);
	}
}
