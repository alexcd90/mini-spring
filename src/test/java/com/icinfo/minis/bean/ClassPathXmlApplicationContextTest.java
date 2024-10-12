package com.icinfo.minis.bean;

import com.icinfo.minis.service.AService;
import com.icinfo.minis.service.impl.AServiceImpl;
import org.junit.Test;

public class ClassPathXmlApplicationContextTest {
    @Test
    public void testConstructor(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AService aServiceImpl = (AServiceImpl) applicationContext.getBean("aService");
        aServiceImpl.sayHello();
    }
}
