/***********************************
 * ��17�� �߼��߳�
 * 17.2 �̶��ߴ��̳߳�
 * Sample17_02���������̳߳�ʵ��
***********************************/

package Sample17_02;

import java.util.concurrent.*;

class MyTaskSingle implements Runnable
{
	private String tname;
	
	public MyTaskSingle(String tname)
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

public class Sample17_02 
{
	public static void main(String[] args)
	{
		//ʹ��Executors��ľ�̬���������������̳߳�
		ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
		
		//�����������
		MyTaskSingle mt1 = new MyTaskSingle("MT1");
		MyTaskSingle mt2 = new MyTaskSingle("MT2");
		MyTaskSingle mt3 = new MyTaskSingle("MT3");
		
		//����ExecutorService�ӿڵ�execute������������ִ��
		singleThreadPool.execute(mt1);
		singleThreadPool.execute(mt2);
		singleThreadPool.execute(mt3);
		
		//����shutdown�����ر��̳߳�
		singleThreadPool.shutdown();
	}
}
