package com.xiaolou.spring.test.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaolou.spring.entity.AllCollections;
import com.xiaolou.spring.entity.User;

public class Test {

	
	public static void main(String[] args) {
		
		// context : spring 上下文对象
		
		ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml") ;
		// 从spring Ioc 容器中获取一个 id 为 user 的对象
		//User user = (User) context.getBean("user");
		// 从输出的结果看，可知 spring ioc 容器 为我们 new 的User 对象，并且赋值了。
		//System.out.println(user);
		
		AllCollections collections = (AllCollections) context.getBean("collections");
		System.out.println(collections);
	}
}
