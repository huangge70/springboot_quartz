package com.springboot_quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class SchedulerQuartzJob1 implements Job {
    private void before(){
        System.out.println("任务1开始执行了...");
    }
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        before();
        System.out.println("开始："+System.currentTimeMillis());
        System.out.println("结束："+System.currentTimeMillis());
        after();
    }
    private void after(){
        System.out.println("任务1执行结束...");
    }
}
