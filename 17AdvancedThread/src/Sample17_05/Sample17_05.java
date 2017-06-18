/***********************************
 * 第17章 高级线程
 * 17.3 使用自定义线程池
 * Sample17_05：使用自定义线程池
***********************************/

package Sample17_05;

import java.util.concurrent.*;

class MyTask implements Runnable
{
	private String tname;
	
	public MyTask(String tname)
	{
		this.tname = tname;
	}
	
	public void run()
	{
		System.out.println("[任务" + tname + "开始执行]");
		for(int i = 0; i < 10; i++)
		{
			System.out.println("[" + tname + "_" + i + "] ");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("[任务" + tname + "执行结束]");
	}
}

public class Sample17_05 
{
	public static void main(String[] args)
	{
		//创建工作等待队列
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(3);
		//创建自定义尺寸线程池，最大尺寸为4，标准尺寸为2，工作等待队列容量为3
		ThreadPoolExecutor myThreadPool = new ThreadPoolExecutor(2, 4, 100, TimeUnit.MILLISECONDS, workQueue);
		
		//创建4个任务对象，可以保证同时有2个任务在执行，2个任务在工作等待队列中等待执行，不会创建新线程
		MyTask mt1 = new MyTask("MT1");
		MyTask mt2 = new MyTask("MT2");
		MyTask mt3 = new MyTask("MT3");
		MyTask mt4 = new MyTask("MT4");
		
		myThreadPool.execute(mt1);
		myThreadPool.execute(mt2);
		myThreadPool.execute(mt3);
		myThreadPool.execute(mt4);
		
		System.out.println("线程池的实际大小为：" + myThreadPool.getPoolSize());
		
		myThreadPool.shutdown();
	}
}
