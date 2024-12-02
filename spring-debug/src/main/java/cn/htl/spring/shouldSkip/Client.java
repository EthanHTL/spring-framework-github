package cn.htl.spring.shouldSkip;

import cn.htl.spring.utils.BeanUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试bean的生命周期
 */
public class Client {
    public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("cn.htl.spring.shouldSkip");
		ac.refresh();

        // 打印所以的bean
		BeanUtil.printBeans(ac);

        Person bill = (Person) ac.getBean("bill");
        System.out.println(bill);

    }

}
