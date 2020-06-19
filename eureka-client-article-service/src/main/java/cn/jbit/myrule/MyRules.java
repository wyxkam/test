package cn.jbit.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRules {
    @Bean
    public IRule myRuleRandom(){
        //return new RandomRule();
        //return new RoundRobinRule();
        return new MyRomdomRule();
    }
}
