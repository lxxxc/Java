/***********************************
 * ��12�� ��δ����쳣
 * 12.4 �ٴ��׳��쳣
 * Sample12_11�������쳣�׳���Ҫע�������
***********************************/

package Sample12_11;

import java.io.*;

public class Sample12_11 
{
	public void myFunction() throws EOFException	//���׳������쳣�������ͱ����뷽�������׳��Ĳ����쳣������ͬ����Ϊ�����࣬���͵�ȷ�����������ͽ���
	{
//		IOException e = new EOFException();	//����IOExceptionΪEOFExection�ĳ��࣬�׳��Ĳ����쳣���ʹ���
		EOFException e = new EOFException();
		throw e;
	}
	
	public static void main(String[] args)
	{
		
	}
}
