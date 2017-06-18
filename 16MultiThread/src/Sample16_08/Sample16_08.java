/***********************************
 * 第16章 多线程的功力
 * 16.8 同步线程
 * Sample16_08：使用同步
***********************************/

package Sample16_08;

class Resource
{
	synchronized void function1(Thread currThread)
	{
		System.out.println(currThread.getName() + "线程执行function1方法！");

		try
		{
			Thread.sleep(1000);
			System.out.println(currThread.getName() + "线程睡醒了！");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	synchronized void function2(Thread currThread)
	{
		System.out.println(currThread.getName() + "线程执行function2方法！");
	}
}

class MyThread extends Thread
{
	Resource rs;
	
	public MyThread(String tName, Resource rs)
	{
		this.setName(tName);
		this.rs = rs;
	}
	
	public void run()
	{
		if (this.getName().equals("Thread1")) 
		{
			rs.function1(this);
		}
		else
		{
			System.out.println("Thread2启动，等待进入同步方法function2！");
			rs.function2(this);
		}
	}
}

public class Sample16_08 
{
	public static void main(String[] args)
	{
		Resource rs = new Resource();
		MyThread t1 = new MyThread("Thread1", rs);
		MyThread t2 = new MyThread("Thread2", rs);
		t1.start();	//启动t1线程，执行function1方法，获得对象锁，方法执行完毕才会释放锁
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		t2.start();	//启动t2线程，执行function2方法，需要先获得对象锁
	}
}
