package com.yapengren.bos.job;

import org.springframework.stereotype.Service;

@Service("myJob")
public class MyJob {

    public void abc() {
        System.out.println("quartz定时器配置");
    }
}
