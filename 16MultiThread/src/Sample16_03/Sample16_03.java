/***********************************
 * 第16章 多线程的功力
 * 16.7 线程的使用
 * Sample16_03：睡眠使用
***********************************/
package Sample16_03;

class MyRunnable1 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("[" + i + "]我是线程1" );
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
			System.out.println("<" + i + ">我是线程1" );
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
		
		t1.start();	//启动线程t1
		try
		{
			Thread.sleep(10);	//使主线程进入休眠状态，保证线程t1首先执行
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		t2.start();	//再启动t2
	}
}
