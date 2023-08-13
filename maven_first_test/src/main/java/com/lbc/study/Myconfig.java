package com.lbc.study;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr ="127.0.0.1:8848"))
@NacosPropertySource(dataId = "test", autoRefreshed = true)
public class Myconfig {
}
