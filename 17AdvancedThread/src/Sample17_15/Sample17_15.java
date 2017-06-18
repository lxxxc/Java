/***********************************
 * 第17章 高级线程
 * 17.10 障碍器
 * Sample17_15：CyclicBarrier类的使用实例
***********************************/

package Sample17_15;

import java.util.concurrent.*;

class PartTask implements Runnable	//子任务类
{
	CyclicBarrier cb;
	String ptname;
	int duringTime;
	
	public PartTask(CyclicBarrier cb, String ptname, int duringTime)
	{
		this.cb = cb;
		this.ptname = ptname;
		this.duringTime = duringTime;
	}
	
	public void run()
	{
		System.out.println(ptname + "子任务开始执行！");
		try
		{
			Thread.sleep(duringTime);
			System.out.println(ptname + "子任务执行结束！");
			cb.await();	//子任务执行结束，调用await()方法通知障碍器
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class FinalTask implements Runnable	//子任务结束后任务的类
{
	public void run()
	{
		System.out.println("最后的任务被执行！");
	}
}

public class Sample17_15 
{
	public static void main(String[] args)
	{
		CyclicBarrier cb = new CyclicBarrier(5, new FinalTask());	//创建障碍器对象，指定最后的任务
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++)
		{
			threadPool.execute(new PartTask(cb, "PartTask" + i, 1000));
		}
		threadPool.shutdown();
	}
}
