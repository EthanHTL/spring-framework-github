package cn.htl.spring.aop.xml;

import cn.htl.spring.aop.xml.service.MyCalculator;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.util.Properties;

public class TestAop {

    public static void main(String[] args) throws Exception {
        saveGeneratedCGlibProxyFiles(System.getProperty("user.dir")+"/proxy");
        String xml = "aop/aop.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        MyCalculator bean = ac.getBean(MyCalculator.class);
        System.out.println(bean.toString());
        bean.add(1,1);
        // System.out.println("---------------");
        // bean.sub(1,1);

    }

    /**
     * 反编译动态代理文件
     * @param dir
     * @throws Exception
     */
    public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
        Field field = System.class.getDeclaredField("props");
        field.setAccessible(true);
        Properties props = (Properties) field.get(null);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);//dir为保存文件路径
        props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
    }
}
