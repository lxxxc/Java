/***********************************
 * ��17�� �߼��߳�
 * 17.3 ʹ���Զ����̳߳�
 * Sample17_05��ʹ���Զ����̳߳�
***********************************/

package Sample17_05;

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
		System.out.println("[����" + tname + "��ʼִ��]");
		for(int i = 0; i < 10; i++)
		{
			System.out.println("[" + tname + "_" + i + "] ");
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("[����" + tname + "ִ�н���]");
	}
}

public class Sample17_05 
{
	public static void main(String[] args)
	{
		//���������ȴ�����
		BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(3);
		//�����Զ���ߴ��̳߳أ����ߴ�Ϊ4����׼�ߴ�Ϊ2�������ȴ���������Ϊ3
		ThreadPoolExecutor myThreadPool = new ThreadPoolExecutor(2, 4, 100, TimeUnit.MILLISECONDS, workQueue);
		
		//����4��������󣬿��Ա�֤ͬʱ��2��������ִ�У�2�������ڹ����ȴ������еȴ�ִ�У����ᴴ�����߳�
		MyTask mt1 = new MyTask("MT1");
		MyTask mt2 = new MyTask("MT2");
		MyTask mt3 = new MyTask("MT3");
		MyTask mt4 = new MyTask("MT4");
		
		myThreadPool.execute(mt1);
		myThreadPool.execute(mt2);
		myThreadPool.execute(mt3);
		myThreadPool.execute(mt4);
		
		System.out.println("�̳߳ص�ʵ�ʴ�СΪ��" + myThreadPool.getPoolSize());
		
		myThreadPool.shutdown();
	}
}
