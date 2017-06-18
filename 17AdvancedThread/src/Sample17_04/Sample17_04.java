/***********************************
 * ��17�� �߼��߳�
 * 17.2 �̶��ߴ��̳߳�
 * Sample17_04���ӳ��̳߳�ʵ��
***********************************/

package Sample17_04;

import java.util.concurrent.*;

class MyScheduledTask implements Runnable
{
	private String tname;
	
	public MyScheduledTask(String tname)
	{
		this.tname = tname;
	}
	
	public void run()
	{
		System.out.println(tname + "������ʱ2sִ�У�");
	}
}

public class Sample17_04 
{
	public static void main(String[] args)
	{
		//�����ӳ��̳߳�
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(2);
		//�������߳��ӳ��̳߳�
		ScheduledExecutorService singleScheduledThreadPool = Executors.newSingleThreadScheduledExecutor();
		
		MyScheduledTask mt1 = new MyScheduledTask("MT1");
		MyScheduledTask mt2 = new MyScheduledTask("MT2");
		
		//�ӳ�2sִ������
		scheduledThreadPool.schedule(mt1, 2, TimeUnit.SECONDS);
		singleScheduledThreadPool.schedule(mt2, 2000, TimeUnit.MILLISECONDS);
		
		scheduledThreadPool.shutdown();
		singleScheduledThreadPool.shutdown();
	}
}
