/***********************************
 * 第17章 高级线程
 * 17.9 线程安全的单变量操作
 * Sample17_14：atomic包中类的使用实例
***********************************/

package Sample17_14;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class MyTask implements Runnable
{
	AtomicLongArray ala;
	String tname;
	
	public MyTask(AtomicLongArray ala, String tname)
	{
		this.ala = ala;
		this.tname = tname;
	}
	
	public void run()
	{
		ala.set(9, 12);
		long l = ala.addAndGet(3, 15);
		ala.set(4, 1);
	}
}

public class Sample17_14 
{
	public static void main(String[] args) throws InterruptedException
	{
		long[] la = new long[]{1,23,45,1,2,3,4,5,6,7,8,8,9,2,4,5,6,7,8};
		AtomicLongArray ala = new AtomicLongArray(la);
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 3; i++) 
		{
			threadPool.execute(new MyTask(ala, i +""));
		}
		threadPool.shutdown();
	}
}
