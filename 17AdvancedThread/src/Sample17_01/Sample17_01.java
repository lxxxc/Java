/***********************************
 * ��17�� �߼��߳�
 * 17.2 �̶��ߴ��̳߳�
 * Sample17_01���Զ���ߴ�̶��̳߳�ʵ��
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
		System.out.println("\n==========����" + tname + "��ʼִ��==========");
		for(int i = 0; i < 50; i++)
		{
			System.out.print("[" + tname + "_" + i + "]");
		}
		System.out.println("\n==========����" + tname + "ִ�н���==========");
	}
}

public class Sample17_01 
{
	public static void main(String[] args)
	{
		//ʹ��Executors��ľ�̬���������̶��ߴ��̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		//�����������
		MyTask mt1 = new MyTask("MT1");
		MyTask mt2 = new MyTask("MT2");
		MyTask mt3 = new MyTask("MT3");
		
		//����ExecutorService�ӿڵ�execute������������ִ��
		threadPool.execute(mt1);
		threadPool.execute(mt2);
		threadPool.execute(mt3);
		
		//����shutdown�����ر��̳߳�
		threadPool.shutdown();
	}
}
