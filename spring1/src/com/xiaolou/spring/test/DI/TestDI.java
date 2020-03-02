package com.xiaolou.spring.test.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xiaolou.spring.entity.Course;

/**
 *  DI 测试，
 *  
 * @author 小楼
 *
 */
public class TestDI {

	
	public static void main(String[] args) {
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml") ;
		Course course = (Course) context.getBean("course");
		course.show();
		
	}
}
