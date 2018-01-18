package com.yapengren.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yapengren.MyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class WsTest {
	
	@Autowired
	private MyService ms;
	
	@Test
	public void test01() {
		System.out.println(ms.echo("hello cxf!"));
	}
}
