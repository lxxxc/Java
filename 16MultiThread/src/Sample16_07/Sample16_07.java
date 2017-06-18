/***********************************
 * 第16章 多线程的功力
 * 16.7 线程的使用
 * Sample16_07：守护线程
***********************************/

package Sample16_07;

class MyCommon implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			System.out.print("[" + i + "] ");
		}
		System.out.print("{前台用户线程执行完毕！} ");
	}
}

class MyDaemon implements Runnable
{
	public void run()
	{
		for (int i = 0; i < 100000; i++)
		{
			System.out.print("<" + i + "> ");
		}
		System.out.print("{后台守护线程执行完毕！} ");
	}
}

public class Sample16_07 
{
	public static void main(String[] args)
	{
		Runnable mc = new MyCommon();
		Runnable md = new MyDaemon();
		Thread tc = new Thread(mc);
		Thread td = new Thread(md);
		td.setDaemon(true);	//将线程td设置为守护线程
		tc.start();
		td.start();
	}
}
