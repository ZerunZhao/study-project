package com.example.Optimize;




import com.example.listener.CommonTimerTaskRunner;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: 任
 * @CreateTime: 2023-11-29 15:10
 * @Signature: 致敬大师，致敬未来的你
 * @description: TODO
 * @Version: 1.0
 */
@Service
public class DevJobServeiceImpl implements DevJobServeice{
	/**
	 *@description: 获取定时任务类名
	 *@Author: Ren
	 *@data: 2023/11/29 15:12
	 *@return: List
	**/
	@Override
	public List<String> getActionClass() {

	/*	Map<String, CommonTimerTaskRunner> commonTimerTaskRunnerMap = SpringUtil.getBeansOfType(CommonTimerTaskRunner.class);
		return commonTimerTaskRunnerMap.values().stream()
				.map(CommonTimerTaskRunner::getClass)
				.map(Class::getName)
				.collect(Collectors.toList());*/
		return  null;
	}




}
