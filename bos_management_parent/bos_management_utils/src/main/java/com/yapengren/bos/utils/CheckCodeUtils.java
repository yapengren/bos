package com.yapengren.bos.utils;

import java.util.Random;

public class CheckCodeUtils {
	
	private static Integer[] intArr = new Integer[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
	//生成随机验证码
	public static String getCheckCode(Integer size) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < size; i++) {
			Random rm = new Random();
			
			//每次循环从数组中随机取出一个数字
			int index = rm.nextInt(intArr.length);
			
			//将数字放入StringBuilder
			sb.append(intArr[index]);
		}
		
		//返回生成的随机数
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(getCheckCode(4));
	}
}
