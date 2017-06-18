/***********************************
 * 第16章 多线程的功力
 * 16.7 线程的使用
 * Sample16_06：线程的让步:join方法
***********************************/

package Sample16_06;

class MyThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 30; i++)
		{
			System.out.print("[" + i + "] ");
		}
		System.out.print("{子线程执行结束！} ");
	}
}

public class Sample16_06 
{
	public static void main(String[] args)
	{
		Thread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 30; i++)
		{
			if (i == 10)
			{
				try
				{
					System.out.print("{使用了join方法}");
					t.join();	//调用join方法后，主线程一直等到线程t执行完毕才继续执行，可以保证线程的让步执行
				}
				catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			System.out.print("<" + i + "> ");
		}
	}
}
