/***********************************
 * ��12�� ��δ����쳣
 * 12.2 �����쳣
 * Sample12_07�������쳣
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
			ServerSocket ss = new ServerSocket(9999);	//ServerSocker���������ú��п��ܻ��׳������쳣IOException�����봦��������뱨��
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
