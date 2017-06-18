/***********************************
 * 第17章 高级线程
 * 17.5 封锁资源
 * Sample17_07：ReentrantLock锁使用实例
***********************************/

package Sample17_07;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyCount
{
	private int count;
	
	public MyCount(int count)
	{
		this.count = count;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
}

class MyUser implements Runnable
{
	private String userName;
	private Lock countLock;
	private MyCount mc;
	
	private int taskSum;
	
	public MyUser(String userName, Lock countLock, MyCount mc, int taskSum)
	{
		this.userName = userName;
		this.countLock = countLock;
		this.mc = mc;
		this.taskSum = taskSum;
	}
	
	public void run()
	{
		boolean okFlag = false;
		
		while(!okFlag)
		{
			try
			{
				countLock.lock();	//获取账户锁
				if(taskSum < 0)	//取款操作
				{
					if(taskSum + mc.getCount() >= 0)	//余额充足，取款
					{
						mc.setCount(mc.getCount() + taskSum);
						System.out.println(userName + "成功取款" + (-taskSum) + "元，余额为：" + mc.getCount() + "元。");
						okFlag = true;
					}
				}
				else	//存款操作
				{
					mc.setCount(mc.getCount() + taskSum);
					System.out.println(userName + "成功存款" + taskSum + "元，余额为：" + mc.getCount() + "元。");
					okFlag = true;
				}
			}
			finally
			{
				countLock.unlock();	//释放账户锁，防止任务不释放锁而使程序死锁
			}
			
			if(okFlag == true)	break;	//如果操作成功，则无需执行睡眠操作
			
			try
			{
				//取款失败
				System.out.println(userName + "：余额不足，等待一段时间再试！");
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class Sample17_07 
{
	public static void main(String[] args)
	{
		MyCount mc = new MyCount(50);
		Lock countLock = new ReentrantLock();
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		threadPool.execute(new MyUser("User1", countLock, mc, -200));
		threadPool.execute(new MyUser("User2", countLock, mc, 200));
		threadPool.shutdown();
	}
}
