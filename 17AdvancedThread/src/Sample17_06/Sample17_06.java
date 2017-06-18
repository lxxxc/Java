/***********************************
 * 第17章 高级线程
 * 17.4 有返回值的线程调用
 * Sample17_06：Callable与Future接口的使用实例
***********************************/

package Sample17_06;

import java.util.concurrent.*;

class MyCallableImpl implements Callable<Object>
{
	String taskName;
	
	public MyCallableImpl(String taskName)
	{
		this.taskName = taskName;
	}
	
	public Object call()	//存放任务代码的run方法
	{
		System.out.println(taskName + "任务成功执行！");
		return "恭喜你，任务成功执行，我是返回消息！";
	}
}

public class Sample17_06 
{
	public static void main(String[] args)
	{
		//创建线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//调用线程池的submit()方法执行任务
		Future<Object> future = threadPool.submit(new MyCallableImpl("TaskA"));
		try
		{
			//调用阻塞方法get()获取任务的返回值
			System.out.println(future.get());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		threadPool.shutdown();
	}
}
