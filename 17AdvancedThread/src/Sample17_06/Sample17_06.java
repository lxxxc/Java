/***********************************
 * ��17�� �߼��߳�
 * 17.4 �з���ֵ���̵߳���
 * Sample17_06��Callable��Future�ӿڵ�ʹ��ʵ��
***********************************/

package Sample17_06;

import java.util.concurrent.*;

class MyCallableImpl implements Callable<Object>
{
	String taskName;
	
	public MyCallableImpl(String taskName)
	{
		this.taskName = taskName;
	}
	
	public Object call()	//�����������run����
	{
		System.out.println(taskName + "����ɹ�ִ�У�");
		return "��ϲ�㣬����ɹ�ִ�У����Ƿ�����Ϣ��";
	}
}

public class Sample17_06 
{
	public static void main(String[] args)
	{
		//�����̳߳�
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		//�����̳߳ص�submit()����ִ������
		Future<Object> future = threadPool.submit(new MyCallableImpl("TaskA"));
		try
		{
			//������������get()��ȡ����ķ���ֵ
			System.out.println(future.get());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		threadPool.shutdown();
	}
}
