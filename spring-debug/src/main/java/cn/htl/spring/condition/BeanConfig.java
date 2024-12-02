package cn.htl.spring.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * @author h.t.l
 * @since 2023/3/23 17:36
 */
@Configuration("beanConfig")
@Conditional(BeanConfigCondition.class)
public class BeanConfig {

	@Bean("myDate")
	@Conditional(BeanCondition.class)
	public Date date() {
		return new Date();
	}
}
