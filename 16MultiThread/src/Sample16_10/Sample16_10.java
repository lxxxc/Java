/***********************************
 * 第16章 多线程的功力
 * 16.11 同步语句块
 * Sample16_10：同步语句块
***********************************/

package Sample16_10;

class MyThread extends Thread
{
	private Object resource;
	
	public MyThread(){};
	
	public MyThread(Object resource, String name)
	{
		this.resource = resource;
		this.setName(name);
	}
	
	public void run()
	{
		synchronized(resource)	//声明同步语句块，同一时刻不允许多个线程执行
		{
			System.out.println(this.getName() + "线程访问了资源！");
			System.out.println(this.getName() + "线程带着锁睡觉去了！");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(this.getName() + "线程带着锁睡醒后释放了锁！");
		}
	}
}

public class Sample16_10 
{
	public static void main(String[] args)
	{
		Object resource = new Object();
		MyThread mt1 = new MyThread(resource, "MT1");
		MyThread mt2 = new MyThread(resource, "MT2");
		mt1.start();
		mt2.start();
	}
}
