package com.example.listener;

/*import cn.hutool.cron.CronUtil;*/
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.core.Ordered;

/**
 * @Author: 任
 * @CreateTime: 2023-11-29 13:51
 * @Signature: 致敬大师，致敬未来的你
 * @description: TODO
 * @Version: 1.0
 */

@Configuration
public class DevJobListener implements ApplicationListener<ApplicationContextEvent>, Ordered {

	@SuppressWarnings("All")
	@Override
	public void onApplicationEvent(ApplicationContextEvent applicationContextEvent) {
		// 系统启动后去扫描定时任务
	/*	SpringUtil.getBean(DevJobService.class).list(new LambdaQueryWrapper<DevJob>()
						.eq(DevJob::getJobStatus, DevJobStatusEnum.RUNNING.getValue()).orderByAsc(DevJob::getSortCode))
				.forEach(devJob -> CronUtil.schedule(devJob.getId(), devJob.getCronExpression(), () -> {
					try {
						// 运行定时任务
						((CommonTimerTaskRunner) SpringUtil.getBean(Class.forName(devJob.getActionClass()))).action();
					} catch (ClassNotFoundException e) {
						//throw new CommonException("定时任务找不到对应的类，名称为：{}", devJob.getActionClass());
					}
				}));*/
		// 设置秒级别的启用
	/*	CronUtil.setMatchSecond(true);
		// 启动定时器执行器
		CronUtil.restart();*/


	}

	@Override
	public int getOrder() {
		//设置优先级为最低
		return LOWEST_PRECEDENCE;
	}




}
