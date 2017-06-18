/***********************************
 * 第17章 高级线程
 * 17.2 固定尺寸线程池
 * Sample17_01：自定义尺寸固定线程池实例
***********************************/

package Sample17_01;

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
		System.out.println("\n==========任务" + tname + "开始执行==========");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("[" + tname + "_" + i + "]");
		}
		System.out.println("\n==========任务" + tname + "执行结束==========");
	}
}

public class Sample17_01 
{
	public static void main(String[] args)
	{
		//使用Executors类的静态方法创建固定尺寸线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		//创建任务对象
		MyTask mt1 = new MyTask("MT1");
		MyTask mt2 = new MyTask("MT2");
		MyTask mt3 = new MyTask("MT3");
		
		//调用ExecutorService接口的execute方法启动任务执行
		threadPool.execute(mt1);
		threadPool.execute(mt2);
		threadPool.execute(mt3);
		
		//调用shutdown方法关闭线程池
		threadPool.shutdown();
	}
}
