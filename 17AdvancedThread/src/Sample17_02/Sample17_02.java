/***********************************
 * 第17章 高级线程
 * 17.2 固定尺寸线程池
 * Sample17_02：单任务线程池实例
***********************************/

package Sample17_02;

import java.util.concurrent.*;

class MyTaskSingle implements Runnable
{
	private String tname;
	
	public MyTaskSingle(String tname)
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

public class Sample17_02 
{
	public static void main(String[] args)
	{
		//使用Executors类的静态方法创建单任务线程池
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
		
		//创建任务对象
		MyTaskSingle mt1 = new MyTaskSingle("MT1");
		MyTaskSingle mt2 = new MyTaskSingle("MT2");
		MyTaskSingle mt3 = new MyTaskSingle("MT3");
		
		//调用ExecutorService接口的execute方法启动任务执行
		singleThreadPool.execute(mt1);
		singleThreadPool.execute(mt2);
		singleThreadPool.execute(mt3);
		
		//调用shutdown方法关闭线程池
		singleThreadPool.shutdown();
	}
}
