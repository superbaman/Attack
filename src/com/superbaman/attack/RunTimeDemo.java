package com.superbaman.attack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * ����ʱ�䣺2015��6��24�� ����9:41:42
 * ��Ŀ���ƣ�Attack
 * @author wangyc  
 * @version 1.0
 * @since JDK 1.7.0_21  
 * �ļ����ƣ�RunTimeDemo.java  
 * ��˵����  
 */

public class RunTimeDemo {
	
	public static void main(String[] commands) throws IOException{
		
		BufferedReader   bufferedReader = new BufferedReader(
				new InputStreamReader(Runtime.getRuntime().exec("net localgroup").getInputStream()));
		String ls_1 = "";
		while   (   (ls_1=bufferedReader.readLine())   !=   null) 
				System.out.println(ls_1);
		}

}

