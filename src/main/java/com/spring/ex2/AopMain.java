package com.spring.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		
//		로그인 수행
//		상품 주문 하기
//		DB 작업 수행함
//		로그아웃 수행
/*		
		Login li = new Login();
		li.login();
		
		OrderImpl myorder = new OrderImpl();
		myorder.order();
		
		Dao d = new Dao();
		d.dao();
		
		Logout lo = new Logout();
		lo.logout();
		
*/	
//	aopExam.xml
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("---- 상품 주문하기 ----");
		Order myorder = (Order)context.getBean("myorder");
		myorder.order();
	}

}





