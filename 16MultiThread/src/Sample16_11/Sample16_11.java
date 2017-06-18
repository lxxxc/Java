/***********************************
 * 第16章 多线程的功力
 * 16.12 线程的死锁
 * Sample16_11：线程的死锁
***********************************/

package Sample16_11;

class MyThread extends Thread
{
	private Object resource1;
	private Object resource2;
	
	public MyThread(){};
	
	public MyThread(Object resource1, Object resource2, String name)
	{
		this.resource1 = resource1;
		this.resource2 = resource2;
		this.setName(name);
	}
	
	public void run()
	{
		synchronized(resource1)
		{
			System.out.println(this.getName() + "线程拿到" + resource1 + "对象的锁！");
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(this.getName() + "等待" + resource1 + "对象的锁释放！");
		
			synchronized(resource2)
			{
				System.out.println(this.getName() + "线程拿到了" + resource2.toString() + "的锁！");
				System.out.println(this.getName() + "可以对两个资源同时操作了！");
			}
		}
	}
}

public class Sample16_11 
{
	public static void main(String[] args)
	{
		String s1 = "tom";
		String s2 = "jerry";
		String s3 = "lucy";
		
		//线程拿到资源的锁，同时等待已经被锁定对象的锁，导致死锁
		MyThread mt1 = new MyThread(s1, s2, "MT1");
		MyThread mt2 = new MyThread(s2, s3, "MT2");
		MyThread mt3 = new MyThread(s3, s1, "MT3");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
