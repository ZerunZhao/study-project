package com.example.listener;


public enum DevJobStatusEnum {

	/**
	 * 运行
	 */
	RUNNING("RUNNING"),
	/**
	 * 停止
	 */
	STOPPED("STOPPED");

	private final String value;

	public String getValue() {
		return value;
	}

	DevJobStatusEnum(String value) {
		this.value=value;
	}
	/*public static void validate(String value) throws ServiceException {
		boolean flag = RUNNING.getValue().equals(value) || STOPPED.getValue().equals(value);
		if(!flag) {
			throw new ServiceException("不支持的定时任务状态："+value);
		}
	}*/
}
