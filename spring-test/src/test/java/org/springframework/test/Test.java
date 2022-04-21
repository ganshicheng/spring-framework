package org.springframework.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.domain.GetBeanTest;
import org.springframework.test.domain.Person;
import org.springframework.test.domain.TestChangeMethod;

public class Test {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Person person = context.getBean("person", Person.class);
//		System.out.printf("person:"+person.toString());

		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
//		test.showMe();
		TestChangeMethod test = (TestChangeMethod) bf.getBean("testChangeMethod");
		test.changeMe();
	}
}
