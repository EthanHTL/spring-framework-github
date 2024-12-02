package cn.htl.spring.condition;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.util.ClassUtils;

/**
 * @author h.t.l
 * @since 2023/3/23 17:35
 */
public class Client {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(beanFactory, true);
		String packageName = ClassUtils.getPackageName(Client.class);
		//扫描
		scanner.scan(packageName);
		new ConfigurationClassPostProcessor().postProcessBeanDefinitionRegistry(beanFactory);

		System.out.println(beanFactory.containsBeanDefinition("beanConfig"));
		System.out.println(beanFactory.containsBeanDefinition("myDate"));
	}


}
