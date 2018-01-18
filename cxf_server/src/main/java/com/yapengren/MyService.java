package com.yapengren;

import javax.jws.WebService;

//标识该类用于提供ws 服务
@WebService
public class MyService {
	
	public String echo(String str) {
		System.out.println("ws 回音方法被调用了");
		return str;
	}
	
}
