/***********************************
 * 第16章 多线程的功力
 * 16.7 线程的使用
 * Sample16_05：线程的让步:yield方法
***********************************/

package Sample16_05;

class MyRunnable implements Runnable
{
	private String flagl;
	private String flagr;
	
	public MyRunnable(String flagl, String flagr)
	{
		this.flagl = flagl;
		this.flagr = flagr; 
	}
	
	public void run()
	{
		for (int i = 0; i < 30; i++)
		{
			System.out.print(flagl + i + flagr);
			Thread.yield();	//调用yield方法，使正在运行的线程回到准备状态
		}
	}
}

public class Sample16_05 
{
	public static void main(String[] args)
	{
		MyRunnable mr1 = new MyRunnable("[", "] ");
		MyRunnable mr2 = new MyRunnable("<", "> ");
		Thread t1 = new Thread(mr1);
		Thread t2 = new Thread(mr2);
		t1.start();
		t2.start();
	}
}
