/***********************************
 * ��12�� ��δ����쳣
 * 12.4 �ٴ��׳��쳣
 * Sample12_10���������׳�
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
			throw e;	//��catch����ν������쳣�������׳�
		}
	}
	
	public static void main(String[] args)
	{
		
	}
}
