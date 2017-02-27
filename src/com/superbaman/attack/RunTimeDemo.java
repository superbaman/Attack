package com.superbaman.attack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**  
 * 创建时间：2015年6月24日 上午9:41:42
 * 项目名称：Attack
 * @author wangyc  
 * @version 1.0
 * @since JDK 1.7.0_21  
 * 文件名称：RunTimeDemo.java  
 * 类说明：  
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

