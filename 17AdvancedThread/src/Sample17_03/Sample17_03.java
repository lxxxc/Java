/***********************************
 * 第17章 高级线程
 * 17.2 固定尺寸线程池
 * Sample17_03：可变尺寸线程池实例
***********************************/

package Sample17_03;

import java.util.concurrent.*;

class MyShrinkTask implements Runnable
{
	private String tname;
	
	public MyShrinkTask(String tname)
	{
		this.tname = tname;
	}
	
	public void run()
	{
		System.out.println("\n==========任务" + tname + "开始执行==========");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("[" + tname + "_" + i + "]");
		}
		System.out.println("\n==========任务" + tname + "执行结束==========");
	}
}

public class Sample17_03 
{
	public static void main(String[] args)
	{
		//使用Executors类的静态方法创建固定尺寸线程池
		ExecutorService shrinkThreadPool = Executors.newCachedThreadPool();
		
		//创建任务对象
		MyShrinkTask mt1 = new MyShrinkTask("MT1");
		MyShrinkTask mt2 = new MyShrinkTask("MT2");
		MyShrinkTask mt3 = new MyShrinkTask("MT3");
		
		//调用ExecutorService接口的execute方法启动任务执行
		shrinkThreadPool.execute(mt1);
		shrinkThreadPool.execute(mt2);
		shrinkThreadPool.execute(mt3);
		
		//调用shutdown方法关闭线程池
		shrinkThreadPool.shutdown();
	}
}
