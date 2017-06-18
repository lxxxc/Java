/***********************************
 * 第12章 如何处理异常
 * 12.4 再次抛出异常
 * Sample12_10：显性再抛出
***********************************/

package Sample12_10;

import java.net.*;
import java.io.*;

public class Sample12_10 
{
	public void connect() throws IOException 
	{
		try 
		{
			ServerSocket ss = new ServerSocket(9999);
		} 
		catch (IOException e) 
		{
			throw e;	//在catch代码段将捕获异常显性再抛出
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}
