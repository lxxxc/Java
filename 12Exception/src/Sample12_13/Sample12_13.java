/***********************************
 * ��12�� ��δ����쳣
 * 12.5 ������д���׳��쳣������
 * Sample12_13��������д���׳��쳣������
***********************************/

package Sample12_13;

import java.io.*;

class Father
{
	public void myFunction() throws Exception
//	public void myFunction() //Son����дmyFunction���������׳��˱�Father�������쳣���������
	{
		System.out.println("�����Ǹ��෽�����÷���û���쳣�׳���");
	}
}

class Son extends Father
{
	public void myFunction() throws InterruptedException	//��д��ķ���һ�����������׳��µĲ����쳣���ԭ�����������Ĳ����쳣
	{
		System.out.println("���������෽�����÷����׳�InterruptedException�쳣��");
	}
}

public class Sample12_13 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		try
		{
			s.myFunction();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
