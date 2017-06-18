/***********************************
 * 第17章 高级线程
 * 17.5 封锁资源
 * Sample17_08：ReentrantReadWriteLock读/写锁使用实例
***********************************/

package Sample17_08;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyResource
{
	public ReadWriteLock lock = new ReentrantReadWriteLock(false);
	private String msg = "init";
	
	public String getMsg()
	{
		return msg;
	}
	
	public void setMsg(String msg)
	{
		this.msg = msg;
	}
}

class MyUser implements Runnable
{
	private String uname;
	private int functionCode;	//功能码：0-读/1-写
	private String msg;
	private MyResource mr;
	
	public MyUser(String uname, int functionCode, String msg, MyResource mr)
	{
		this.uname = uname;
		this.functionCode = functionCode;
		this.msg = msg;
		this.mr = mr;
	}
	
	public void run()
	{
		if(functionCode == 0)	//读操作
		{
			try
			{
				mr.lock.readLock().lock();	//获取读锁，同时可以有多个线程拥有读锁，此时不可以进行写操作
				System.out.println(uname + "用户成功进行读操作，读出内容为：”" + mr.getMsg() + "“！");
				Thread.sleep(2000);	//读操作成功后带着读锁睡眠
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				mr.lock.readLock().unlock();	//释放读锁
			}
		}
		else	//写操作
		{
			try
			{
				mr.lock.writeLock().lock();	//获取写锁，同一时刻只能有一个线程拥有写锁，此时不可以进行写操作，可以提高并发效率
				mr.setMsg(msg);
				System.out.println(uname + "用户成功进行写操作，写入后内容为：”" + mr.getMsg() + "“！");
				Thread.sleep(2000);	//写操作成功后带着写锁睡眠
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				mr.lock.writeLock().unlock();	//释放写锁
			}
		}
	}
}

public class Sample17_08
{
	public static void main(String[] args)
	{
		MyResource mr = new MyResource();
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		threadPool.execute(new MyUser("User1", 0, null, mr));
		threadPool.execute(new MyUser("User2", 0, null, mr));
		threadPool.execute(new MyUser("User3", 1, "Hello World", mr));
//		threadPool.execute(new MyUser("User4", 1, "Hello World2", mr));
		
		threadPool.shutdown();
	}
}
