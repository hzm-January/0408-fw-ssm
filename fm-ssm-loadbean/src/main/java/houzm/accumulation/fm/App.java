package houzm.accumulation.fm;

import houzm.accumulation.fm.bean.BeanTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/14 16:47
 * description:
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"classpath:applicationContext.xml"});
        BeanTest beanTest = (BeanTest) applicationContext.getBean("beanTest");
        System.out.println(beanTest);
    }

}
