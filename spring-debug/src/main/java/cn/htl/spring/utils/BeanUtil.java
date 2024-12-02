package cn.htl.spring.utils;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class BeanUtil {

    /**
     * 打印spring容器中的所有bean
     * @param context applicationContext
     */
    public static void printBeans(ClassPathXmlApplicationContext context) {
        System.out.println("<----------------------------------->");
        System.out.println("spring容器中所有bean如下：");
        for (String beanName : context.getBeanDefinitionNames()) {
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s \n   别名:[%s]", beanName, String.join(",", aliases)));
        }
        System.out.println("<----------------------------------->");
    }

    public static void printBeans(AnnotationConfigApplicationContext context) {
        System.out.println("<----------------------------------->");
        System.out.println("spring容器中所有bean如下：");
        for (String beanName : context.getBeanDefinitionNames()) {
            String[] aliases = context.getAliases(beanName);
            System.out.println(String.format("beanName:%s \n   别名:[%s]", beanName, String.join(",", aliases)));
        }
        System.out.println("<----------------------------------->");
    }

    public static void printToString(ClassPathXmlApplicationContext context) {
        System.out.println("===================================");
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(context.getBean(beanName));
        }
        System.out.println("===================================");
    }



    public static void printBeanNames(ClassPathXmlApplicationContext ac , List<String> beannNames){
        for (String beanName : beannNames) {
            //获取bean的别名
            String[] aliases = ac.getAliases(beanName);
            System.out.println(String.format("beanName:%s,别名:[%s]", beanName, String.join(",", aliases)));
        }
    }
}
