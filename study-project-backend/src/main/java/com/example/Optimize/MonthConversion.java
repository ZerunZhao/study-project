package com.example.Optimize;

/**
 * @Author: 任
 * @CreateTime: 2023-11-20 16:06
 * @Signature: 致敬大师，致敬未来的你
 * @description: TODO
 * @Version: 1.0
 */
public enum MonthConversion {
	JANUARY("01", "1月"),
	FEBRUARY("02", "2月"),
	MARCH("03", "3月"),
	APRIL("04", "4月"),
	MAY("05", "5月"),
	JUNE("06", "6月"),
	JULY("07", "7月"),
	AUGUST("08", "8月"),
	SEPTEMBER("09", "9月"),
	OCTOBER("10", "10月"),
	NOVEMBER("11", "11月"),
	DECEMBER("12", "12月");

	private final String monthCode;
	private final String monthName;

	MonthConversion(String monthCode, String monthName) {
		this.monthCode = monthCode;
		this.monthName = monthName;
	}

	public String getMonthCode() {
		return monthCode;
	}

	public String getMonthName() {
		return monthName;
	}

//	月份格式类型转换
	public static String getMonthNameByCode(String monthCode) {
		for (MonthConversion month : MonthConversion.values()) {
			if (month.getMonthCode().equals(monthCode)) {
				return month.getMonthName();
			}
		}
		return null;
	}

}
