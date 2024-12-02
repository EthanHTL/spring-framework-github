package cn.htl.spring.dynamic_proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Cglib 动态代理
 * {@link  org.springframework.cglib.proxy.CallbackInfo}
 */
public class CglibTest {

	public static void main(String[] args) {
		//动态代理创建的class文件存储到本地
		String value = "/Users/aurora/StudySpace/spring-framework/proxy/org/springframework/cglib";
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, value);

		//通过cglib动态代理获取代理对象的过程，创建调用的对象
		Enhancer enhancer = new Enhancer();
		//设置enhancer对象的父类
		enhancer.setSuperclass(MyCalculator2.class);
		//设置enhancer的回调对象
		enhancer.setCallback(new MyCglib());
		//创建代理对象
		MyCalculator2 myCalculator = (MyCalculator2) enhancer.create();
		//通过代理对象调用目标方法
		myCalculator.add(1,1);
		System.out.println(myCalculator.getClass());
	}

}
