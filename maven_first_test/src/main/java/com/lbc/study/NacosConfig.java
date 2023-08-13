package com.lbc.study;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executor;

public class NacosConfig {
    public static void main(String[] args) throws NacosException, IOException {
        // 使用nacos client 远程获取nacos服务上的配置信息

        // nacos 地址
        String serverAddr = "127.0.0.1:8848";
        // Data Id
        String dataId = "test";
        // Group
        String group = "DEFAULT_GROUP";
        Properties properties = new Properties();
        properties.put("serverAddr", serverAddr);
        // 获取配置
        ConfigService configService = NacosFactory.createConfigService(properties);
        String config = configService.getConfig(dataId, group, 5000);
        System.out.println(config);
        configService.addListener(dataId, group, new Listener() {
            @Override
            public Executor getExecutor() {
                return null;
            }

            @Override
            public void receiveConfigInfo(String s) {
                System.out.println(s);
            }
        });
        System.in.read();
    }
}
