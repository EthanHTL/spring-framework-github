package cn.htl.spring.selftag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSelfTag {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/selftag/selftag.xml");
        User user=(User)context.getBean("testbean");
        System.out.println(user.toString());
    }
}
