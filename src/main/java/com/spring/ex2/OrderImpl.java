package com.spring.ex2;

public class OrderImpl implements Order{

	String msg = "상품 주문 ";
	
	@Override
	public void order() {
		System.out.println(msg + "하기"); // 핵심기능
		
	}

}
