package com.yzx.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yzx.test.HelloWorld;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hello=(HelloWorld) ac.getBean("hello");
		hello.say();
	}
}
