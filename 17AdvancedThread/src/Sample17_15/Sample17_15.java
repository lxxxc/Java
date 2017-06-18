/***********************************
 * ��17�� �߼��߳�
 * 17.10 �ϰ���
 * Sample17_15��CyclicBarrier���ʹ��ʵ��
***********************************/

package Sample17_15;

import java.util.concurrent.*;

class PartTask implements Runnable	//��������
{
	CyclicBarrier cb;
	String ptname;
	int duringTime;
	
	public PartTask(CyclicBarrier cb, String ptname, int duringTime)
	{
		this.cb = cb;
		this.ptname = ptname;
		this.duringTime = duringTime;
	}
	
	public void run()
	{
		System.out.println(ptname + "������ʼִ�У�");
		try
		{
			Thread.sleep(duringTime);
			System.out.println(ptname + "������ִ�н�����");
			cb.await();	//������ִ�н���������await()����֪ͨ�ϰ���
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class FinalTask implements Runnable	//������������������
{
	public void run()
	{
		System.out.println("��������ִ�У�");
	}
}

public class Sample17_15 
{
	public static void main(String[] args)
	{
		CyclicBarrier cb = new CyclicBarrier(5, new FinalTask());	//�����ϰ�������ָ����������
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 5; i++)
		{
			threadPool.execute(new PartTask(cb, "PartTask" + i, 1000));
		}
		threadPool.shutdown();
	}
}
