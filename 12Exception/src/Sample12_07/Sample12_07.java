/***********************************
 * 第12章 如何处理异常
 * 12.2 捕获异常
 * Sample12_07：捕获异常
***********************************/

package Sample12_07;

import java.net.*;
import java.io.*;

public class Sample12_07 
{
	public static void main(String[] args)
	{
		try
		{
			ServerSocket ss = new ServerSocket(9999);	//ServerSocker构造器调用后，有可能会抛出捕获异常IOException，必须处理，否则编译报错
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
