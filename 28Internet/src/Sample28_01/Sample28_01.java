/***********************************
 * 第28章 网络编程的世界
 * 28.3 Internet地址
 * Sample28_01：Internet地址(InetAddress地址)
***********************************/

package Sample28_01;

import java.net.*;

public class Sample28_01 
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress addr1, addr2;
		
		addr1 = InetAddress.getLocalHost();	//获取本机的IP地址
		System.out.println(addr1);
		
		addr2 = InetAddress.getByName("www.baidu.com");	//获取百度的IP地址
		System.out.println(addr2);
		
		InetAddress addr3[] = new InetAddress[InetAddress.getAllByName("www.sohu.com").length];	//初始化数组长度
		addr3 = InetAddress.getAllByName("www.sohu.com");	//获取搜狐网站所有的IP地址
		for (int i = 0; i < addr3.length; i++) 
		{
			System.out.println(addr3[i]);
		}
	}
}
