package cn.jbit.ribbonnativedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RibbonNativeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonNativeDemoApplication.class, args);
    }

}
