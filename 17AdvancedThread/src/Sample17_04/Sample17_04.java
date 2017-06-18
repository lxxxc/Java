/***********************************
 * 第17章 高级线程
 * 17.2 固定尺寸线程池
 * Sample17_04：延迟线程池实例
***********************************/

package Sample17_04;

import java.util.concurrent.*;

class MyScheduledTask implements Runnable
{
	private String tname;
	
	public MyScheduledTask(String tname)
	{
		this.tname = tname;
	}
	
	public void run()
	{
		System.out.println(tname + "任务延时2s执行！");
	}
}

public class Sample17_04 
{
	public static void main(String[] args)
	{
		//创建延迟线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
		//创建单线程延迟线程池
		ScheduledExecutorService singleScheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
		
		MyScheduledTask mt1 = new MyScheduledTask("MT1");
		MyScheduledTask mt2 = new MyScheduledTask("MT2");
		
		//延迟2s执行任务
		scheduledThreadPool.schedule(mt1, 2, TimeUnit.SECONDS);
		singleScheduledThreadPool.schedule(mt2, 2000, TimeUnit.MILLISECONDS);
		
		scheduledThreadPool.shutdown();
		singleScheduledThreadPool.shutdown();
	}
}
