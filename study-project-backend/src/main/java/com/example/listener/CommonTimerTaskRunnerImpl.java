package com.example.listener;

import org.springframework.stereotype.Component;

/**
 * @Author: 任
 * @CreateTime: 2023-12-01 17:06
 * @Signature: 致敬大师，致敬未来的你
 * @description: TODO
 * @Version: 1.0
 */
@Component
public class CommonTimerTaskRunnerImpl implements  CommonTimerTaskRunner{
	@Override
	public void action() {
		System.out.println("执行定时任务");
	}
}
