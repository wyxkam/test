package cn.jbit.eurekaclientarticleservice.service;

import cn.jbit.comment.beans.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
public class UserRemoteServiceClientFallback implements UserRemoteClient{
    @Override
    public String hello(@RequestBody User user) {
        return "服务异常";
    }
}
