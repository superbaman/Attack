package com.superbaman.attack;

import java.io.IOException;

/**  
 * 创建时间：2015年6月3日 上午8:49:27
 * 项目名称：Attack
 * @author wangyc good boy 
 * @version 1.0
 * @since JDK 1.7.0_21  
 * 文件名称：ProcessDemo.java  
 * 类说明：  
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

