package com.wilber.Spring.Initializr.Domain.sevice;


import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {
    @Scheduled(initialDelay = 5000, fixedDelay = 9000)
//	@Scheduled(initialDelayString = "5000" ,fixedDelayString = "9000")
    // 1000 milli sec = 1sec
    public void scheduledMethod1() {
        System.out.println("Hello Scheduler One :" +new Date());
    }
    //@Scheduled(fixedRate=1000)
    @Scheduled(fixedRateString = "4000")
    public void scheduledMethod2() {
        System.out.println("Hello Scheduler Two :" +new Date());
    }
    @Scheduled(cron = "15 * * * * *")
    public void scheduledMethod3() {
        System.out.println("Hello cron Scheduler Three :" +new Date());
    }
}
