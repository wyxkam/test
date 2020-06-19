package cn.jbit.eurekaclientarticleservice.service;

import cn.jbit.comment.beans.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//前面是要调用的服务，后面是回退的类
@FeignClient(value = "eureka-client-user-service",fallback =UserRemoteServiceClientFallback.class )
public interface UserRemoteClient {
    @RequestMapping("/user/hello")
    String hello(@RequestBody(required = false) User user);
}
