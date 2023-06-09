package com.practice.DesignModeUsage.serviceDesignMode.zHadoopAndOthers;

import cn.hutool.core.lang.func.VoidFunc0;
import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.practice.DesignModeUsage.vo.TaskSummary;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public class testFirst {

    /**
     *   试用 HashMap的 computeIfAbsent
     */
    public static void testComputeIfAbsent() {
        List<TaskSummary> taskSummaryList = new ArrayList<>();
        TaskSummary ts1 = new TaskSummary(); TaskSummary ts2 = new TaskSummary(); TaskSummary ts3 = new TaskSummary();
        ts1.setTaskId(1L);
        ts1.setTaskName("test1");
        ts1.setStatus(1);
        taskSummaryList.add(ts1);
        ts2.setTaskId(2L);
        ts2.setTaskName("test2");
        ts2.setStatus(2);
        taskSummaryList.add(ts2);
        ts3.setTaskId(3L);
        ts3.setTaskName("test3");
        ts3.setStatus(3);
        taskSummaryList.add(ts3);
        log.info("taskSummaryList: {}", JSON.toJSONString(taskSummaryList));
        Map<Long, TaskSummary> summaryMap = new LinkedHashMap<>();
        for (TaskSummary ts : taskSummaryList) {
            TaskSummary taskSummary = summaryMap.computeIfAbsent(ts.getTaskId(), key -> new TaskSummary());
            taskSummary.setTaskId(ts.getTaskId());
//            taskSummary.setTaskName(ts.getTaskName());
//            taskSummary.setStatus(ts.getStatus());
        }
        log.info("summaryMap: {}", JSON.toJSONString(summaryMap));
    }


    // 测试一种函数写法
    // 不 return 值仍然可以传值传出来
    public static void testNotAssignedPass(List<Long> activeList, List<Long> forbidList, List<Long> submitErrorList) {
        activeList.add(1L);
        activeList.add(2L);
        activeList.add(3L);
        forbidList.add(4L);
        forbidList.add(5L);
        forbidList.add(6L);
        submitErrorList.add(7L);
        submitErrorList.add(8L);
    }

    public static void testStreamFilter(){
        List<TaskSummary> taskSummaryList = new ArrayList<>();
        TaskSummary t1 = new TaskSummary();
        t1.setTaskId(1L);
        TaskSummary t2 = new TaskSummary();
        t2.setTaskId(2L);
        TaskSummary t3 = new TaskSummary();
        t3.setTaskId(3L);
        TaskSummary t4 = new TaskSummary();
        t4.setTaskId(4L);
        taskSummaryList.add(t1);
        taskSummaryList.add(t2);
        taskSummaryList.add(t3);
        taskSummaryList.add(t4);
        List<Long> taskIds = new ArrayList<>();
        taskIds.add(1L);
        taskIds.add(3L);
        // 使用 filter
        taskSummaryList = taskSummaryList.stream().filter(x-> !taskIds.contains(x.getTaskId())).collect(Collectors.toList());
        log.info("过滤后的 taskSummaryList: {}, size = {}", taskSummaryList, taskSummaryList.size());
    }


    public static void test() {
        io.netty.bootstrap.AbstractBootstrap abstractBootstrap;
        io.netty.bootstrap.ServerBootstrap serverBootstrap;
        io.netty.bootstrap.Bootstrap bootstrap;
    }
    public static void main(String[] args) throws InterruptedException {
//        // 测试 computeIfAbsent
//        testComputeIfAbsent();
//        // 测试 function 外传值
//        List<Long> activeList = new ArrayList<>();
//        List<Long> forbidList = new ArrayList<>();
//        List<Long> submitErrorList = new ArrayList<>();
//        testNotAssignedPass(activeList, forbidList, submitErrorList);
//        log.info("activeList: {}, forbidList: {}, submitErrorList: {}", activeList, forbidList, submitErrorList);
//        // 测试 stream.filter
//        testStreamFilter();

        log.info("ObjectUtils.NotEqual: {}", ObjectUtil.notEqual(new Long(1L), new Long(2L)));
        log.info("ObjectUtils.Equal: {}", ObjectUtil.equal(new Long(1L), new Long(1L)));

//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread();
//        thread1.start();
//        thread2.start();
//        thread2.join();
//        Runnable runnable1 = () -> log.info("here is runnable1");
//        runnable1.run();
        VoidFunc0 voidFunc0 = () -> {

        };
        new Thread(()->{log.info("This is a temp thread");}).start();

    }
}
