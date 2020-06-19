package cn.jbit.eurekaclientarticleservice.controller;

import cn.jbit.comment.beans.User;
import cn.jbit.eurekaclientarticleservice.service.UserRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ArticleController {
    @Autowired
    RestTemplate restTemplate;
    @Resource
    UserRemoteClient userRemoteClient;

    @GetMapping("/article/callhello")
    public String callHello(){//king:123456@
        restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor("king", "123456"));
        return restTemplate.getForObject("http://eureka-client-user-service/user/hello",String.class);
    }
    @RequestMapping("/callhello")
    public String callHelloma(){
        User user = new User();
        user.setName("腰子");
        user.setAge(28);
        String result =userRemoteClient.hello(user);
        System.out.println("调用结果："+result);

        return result;
    }

}
