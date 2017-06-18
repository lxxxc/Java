/***********************************
 * 第12章 如何处理异常
 * 12.4 再次抛出异常
 * Sample12_12：隐形再抛出
***********************************/

package Sample12_12;

import java.net.*;
import java.io.*;

public class Sample12_12 
{
	public static void myFunction() throws IOException	//方法中没有抛出异常语句，若产生异常将自动隐形抛出给调用方法的方法中
	{
		ServerSocket ss = new ServerSocket(9999);
	}
	
	public static void main(String[] args)
	{
		try
		{
			myFunction();
		}
		catch (IOException e)	//在main方法中对异常进行了捕获并处理
		{
			e.printStackTrace();
		}
		System.out.println("恭喜你，程序正常运行结束！");
	}
}
