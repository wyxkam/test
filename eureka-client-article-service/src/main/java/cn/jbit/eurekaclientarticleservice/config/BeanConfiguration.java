package cn.jbit.eurekaclientarticleservice.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfiguration {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor(){
        return  new BasicAuthRequestInterceptor("king","123456");
    }
}
