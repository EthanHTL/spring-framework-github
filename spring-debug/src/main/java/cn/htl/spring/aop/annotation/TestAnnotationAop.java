package cn.htl.spring.aop.annotation;

import cn.htl.spring.aop.annotation.config.SpringConfiguration;
import cn.htl.spring.aop.annotation.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationAop {

	public static void main(String[] args) throws NoSuchMethodException {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(SpringConfiguration.class);
		// String packageName = TestAnnotationAop.class.getPackage().getName();
		// ac.scan(packageName);
		ac.refresh();
		MyCalculator bean = ac.getBean("myCalculator",MyCalculator.class);
		System.out.println(bean.add(1, 1));
	}
}
