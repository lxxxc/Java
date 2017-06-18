/***********************************
 * 第16章 多线程的功力
 * 16.5 同时使用多个线程
 * Sample16_02：同时使用多个线程
***********************************/

package Sample16_02;

class MyRunnable1 implements Runnable 
{
	@Override
	public void run() 
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.print("[" + i + "] ");
		}	
	}
}

class MyRunnable2 implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 50; i++) 
		{
			System.out.print("<" + i + "> ");
		}
	}
}

public class Sample16_02 
{
	public static void main(String[] args)
	{
		//创建实现Runnable接口的类对象
		MyRunnable1 mr1 = new MyRunnable1();
		MyRunnable2 mr2 = new MyRunnable2();
		//创建线程Thread对象
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		t1.start();
		t2.start();
	}
}
