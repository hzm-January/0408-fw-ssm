package houzm.accumulation.fm;

import houzm.accumulation.fm.bean.BeanTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/14 16:58
 * description:
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{
                "classpath:applicationContext-dev.xml",
                "classpath:applicationContext-pro.xml"});
        applicationContext.getEnvironment().setActiveProfiles("develop"); //设置profile，通知spring启用哪个环境
        BeanTest beanTestDev = (BeanTest) applicationContext.getBean("beanTest");
        System.out.println(beanTestDev);
//        applicationContext.getEnvironment().setActiveProfiles("production"); //设置profile，通知spring启用哪个环境
//        BeanTest beanTestPro = (BeanTest) applicationContext.getBean("beanTestPro");
//        System.out.println(beanTestPro);
    }
}
