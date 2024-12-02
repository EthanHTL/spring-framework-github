package cn.htl.spring.shouldSkip;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author h.t.l
 * @Date: 2021/9/28
 * @Version 1.0
 */
@Component
public class MyComponent {

    @Bean
    public String myC(){
        return "MyComponent:myC";
    }
}
