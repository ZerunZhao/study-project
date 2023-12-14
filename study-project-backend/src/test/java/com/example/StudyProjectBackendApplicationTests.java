package com.example;

import com.example.listener.CommonTimerTaskRunner;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootTest
class StudyProjectBackendApplicationTests {
//    @Resource
//    Map<String, CommonTimerTaskRunner> commonTimerTaskRunnerMap;
//    @Resource
//    List<CommonTimerTaskRunner> commonTimerTaskRunnerList;
//
//    @Resource
//    ApplicationContext applicationContext;
//    ApplicationContextFactory applicationContextFactory;
//    @Test
//    void contextLoads() throws ClassNotFoundException {
//        System.out.println("监听器：");
//    /*    List<String> collect = commonTimerTaskRunnerMap.values().stream()
//                .map(CommonTimerTaskRunner::getClass)
//                .map(Class::getName)
//                .collect(Collectors.toList());*/
//
//        for (CommonTimerTaskRunner s : commonTimerTaskRunnerList) {
//            /*CommonTimerTaskRunner bean =(CommonTimerTaskRunner) applicationContext.getBean(Class.forName(s));*/
//            System.out.println(s);
//            s.action();
//        }
//
//    }

}
