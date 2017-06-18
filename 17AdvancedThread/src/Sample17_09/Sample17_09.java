/***********************************
 * ��17�� �߼��߳�
 * 17.6 �ź���
 * Sample17_09��Semaphore��ʹ��ʵ��
***********************************/

package Sample17_09;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

class MyResourcePool
{
	public Semaphore sp;
	
	public MyResourcePool(int count)
	{
		sp = new Semaphore(count);	//�����ź���
	}
}

class MyTask implements Runnable
{
	private String tname;
	private MyResourcePool mrp;
	private int count;
	
	public MyTask(String tname, MyResourcePool mrp, int count)
	{
		this.tname = tname;
		this.mrp = mrp;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			mrp.sp.acquire(count);	//����ָ����������Դ
			System.out.println(tname + "����������" + count + "����Դִ����ϣ�");
			Thread.sleep(2000);	//����������ź���˯��
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			mrp.sp.release(count);	//�ͷ��ź���
		}
	}
}

public class Sample17_09 
{
	public static void main(String[] args)
	{ 
		MyResourcePool mrp = new MyResourcePool(10);
		ExecutorService threadPool = Executors.newFixedThreadPool(4);
		
		threadPool.execute(new MyTask("Task1", mrp, 8));
		threadPool.execute(new MyTask("Task2", mrp, 4));
		threadPool.execute(new MyTask("Task3", mrp, 1));
		
		threadPool.shutdown();
	}
}
