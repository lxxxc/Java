/***********************************
 * 第17章 高级线程
 * 17.6 信号量
 * Sample17_09：Semaphore类使用实例
***********************************/

package Sample17_09;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyResourcePool
{
	public Semaphore sp;
	
	public MyResourcePool(int count)
	{
		sp = new Semaphore(count);	//创建信号量
	}
}

class MyTask implements Runnable
{
	private String tname;
	private MyResourcePool mrp;
	private int count;
	
	public MyTask(String tname, MyResourcePool mrp, int count)
	{
		this.tname = tname;
		this.mrp = mrp;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			mrp.sp.acquire(count);	//申请指定数量的资源
			System.out.println(tname + "任务申请了" + count + "个资源执行完毕！");
			Thread.sleep(2000);	//带着申请的信号量睡眠
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			mrp.sp.release(count);	//释放信号量
		}
	}
}

public class Sample17_09 
{
	public static void main(String[] args)
	{ 
		MyResourcePool mrp = new MyResourcePool(10);
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		threadPool.execute(new MyTask("Task1", mrp, 8));
		threadPool.execute(new MyTask("Task2", mrp, 4));
		threadPool.execute(new MyTask("Task3", mrp, 1));
		
		threadPool.shutdown();
	}
}
