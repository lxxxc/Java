/***********************************
 * ��12�� ��δ����쳣
 * 12.4 �ٴ��׳��쳣
 * Sample12_12���������׳�
***********************************/

package Sample12_12;

import java.net.*;
import java.io.*;

public class Sample12_12 
{
	public static void myFunction() throws IOException	//������û���׳��쳣��䣬�������쳣���Զ������׳������÷����ķ�����
	{
		ServerSocket ss = new ServerSocket(9999);
	}
	
	public static void main(String[] args)
	{
		try
		{
			myFunction();
		}
		catch (IOException e)	//��main�����ж��쳣�����˲��񲢴���
		{
			e.printStackTrace();
		}
		System.out.println("��ϲ�㣬�����������н�����");
	}
}
