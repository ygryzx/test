package com.yzx.service;

import com.yzx.test.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yzx.test.HelloWorld;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello=(HelloWorld) ac.getBean("hello");
		Hello hello1=(Hello) ac.getBean("hello1");
		hello.say();
		hello1.say1();
	}
}
