package com.xiaolou.spring.test;

import com.xiaolou.spring.entity.User;

/**
 *  传统方法测试
 * @author 小楼
 *
 */
public class Test {

	
	public static void main(String[] args) {
		
		User user = new User() ;
		user.setName("zs");
		user.setGender("男");
		user.setAge(11);
		System.out.println(user);
	}
}
