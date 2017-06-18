/***********************************
 * ��17�� �߼��߳�
 * 17.2 �̶��ߴ��̳߳�
 * Sample17_03���ɱ�ߴ��̳߳�ʵ��
***********************************/

package Sample17_03;

import java.util.concurrent.*;

class MyShrinkTask implements Runnable
{
	private String tname;
	
	public MyShrinkTask(String tname)
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

public class Sample17_03 
{
	public static void main(String[] args)
	{
		//ʹ��Executors��ľ�̬���������̶��ߴ��̳߳�
		ExecutorService shrinkThreadPool = Executors.newCachedThreadPool();
		
		//�����������
		MyShrinkTask mt1 = new MyShrinkTask("MT1");
		MyShrinkTask mt2 = new MyShrinkTask("MT2");
		MyShrinkTask mt3 = new MyShrinkTask("MT3");
		
		//����ExecutorService�ӿڵ�execute������������ִ��
		shrinkThreadPool.execute(mt1);
		shrinkThreadPool.execute(mt2);
		shrinkThreadPool.execute(mt3);
		
		//����shutdown�����ر��̳߳�
		shrinkThreadPool.shutdown();
	}
}
