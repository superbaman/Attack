package com.superbaman.attack;

import java.io.IOException;

/**  
 * ����ʱ�䣺2015��6��3�� ����8:49:27
 * ��Ŀ���ƣ�Attack
 * @author wangyc  
 * @version 1.0
 * @since JDK 1.7.0_21  
 * �ļ����ƣ�ProcessDemo.java  
 * ��˵����  
 */

public class ProcessDemo {
	
	public static void main(String[] args){
		ProcessBuilder p = new ProcessBuilder(new String[]{"whoami"});
		try {
			p.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

