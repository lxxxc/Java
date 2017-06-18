/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.7 �̵߳�ʹ��
 * Sample16_03��˯��ʹ��
***********************************/
package Sample16_03;

class MyRunnable1 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("[" + i + "]�����߳�1" );
			try
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
	}
}

class MyRunnable2 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("<" + i + ">�����߳�1" );
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
	}
}

public class Sample16_03 
{
	public static void main(String[] args)
	{
		MyRunnable1 mr1 = new MyRunnable1();
		MyRunnable2 mr2 = new MyRunnable2();
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		
		t1.start();	//�����߳�t1
		try
		{
			Thread.sleep(10);	//ʹ���߳̽�������״̬����֤�߳�t1����ִ��
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		t2.start();	//������t2
	}
}
