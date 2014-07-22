package com.squareup.timessquare;

import java.util.HashMap;

public class WeekFormatChange {
	private static HashMap<String, String> weekdays;
	static {
		weekdays = new HashMap<String, String>();
		weekdays.put("星期一", "周一");
		weekdays.put("星期二", "周二");
		weekdays.put("星期三", "周三");
		weekdays.put("星期四", "周四");
		weekdays.put("星期五", "周五");
		weekdays.put("星期六", "周六");
		weekdays.put("星期日", "周日");
	}

	public static String format(String week) {
		String result = week;
		if (weekdays.containsKey(week)) {
			result = weekdays.get(week);
		}
		return result;
	}
}
