package cn.jbit.eurekaclientarticleservice;

import cn.jbit.myrule.MyRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient//发现服务
//@EnableEurekaClient
@RibbonClient(name = "EUREKA-CLIENT-USER-SERVICE",configuration = MyRules.class)
@EnableFeignClients
@EnableHystrix
public class EurekaClientArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientArticleServiceApplication.class, args);
    }

}
