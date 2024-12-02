package cn.htl.spring.dynamic_proxy.jdk;

/**
 * jdk的动态代理
 */
public class JdkTest {

	public static void main(String[] args) {
		// 将生成的代理类输出到本地
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		// 创建代理
		Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());

		System.out.println("add = " + proxy.add(1, 1));
		System.out.println(proxy.getClass());
	}
}
