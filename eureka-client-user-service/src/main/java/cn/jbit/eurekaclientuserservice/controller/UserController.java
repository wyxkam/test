package cn.jbit.eurekaclientuserservice.controller;

import cn.jbit.comment.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/user/hello")
    public String hello(@RequestBody User user){
        int i=1/0;
        return "端口号:"+port+"hello 我叫："+user.getName()+"我今年："+user.getAge()+"岁";
    }

    @RequestMapping("/say/hello")
    public String sayHello(){
        return "Hello";
    }
}
