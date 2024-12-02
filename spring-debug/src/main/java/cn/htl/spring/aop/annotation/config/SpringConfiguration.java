package cn.htl.spring.aop.annotation.config;

import cn.htl.spring.aop.annotation.service.MyCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "cn.htl.spring.aop.annotation")
@EnableAspectJAutoProxy
public class SpringConfiguration {

	@Bean
	public MyCalculator calculator2() {
		return new MyCalculator();
	}
}