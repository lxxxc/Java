/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.8 ͬ���߳�
 * Sample16_08��ʹ��ͬ��
***********************************/

package Sample16_08;

class Resource
{
	synchronized void function1(Thread currThread)
	{
		System.out.println(currThread.getName() + "�߳�ִ��function1������");

		try
		{
			Thread.sleep(1000);
			System.out.println(currThread.getName() + "�߳�˯���ˣ�");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	synchronized void function2(Thread currThread)
	{
		System.out.println(currThread.getName() + "�߳�ִ��function2������");
	}
}

class MyThread extends Thread
{
	Resource rs;
	
	public MyThread(String tName, Resource rs)
	{
		this.setName(tName);
		this.rs = rs;
	}
	
	public void run()
	{
		if (this.getName().equals("Thread1")) 
		{
			rs.function1(this);
		}
		else
		{
			System.out.println("Thread2�������ȴ�����ͬ������function2��");
			rs.function2(this);
		}
	}
}

public class Sample16_08 
{
	public static void main(String[] args)
	{
		Resource rs = new Resource();
		MyThread t1 = new MyThread("Thread1", rs);
		MyThread t2 = new MyThread("Thread2", rs);
		t1.start();	//����t1�̣߳�ִ��function1��������ö�����������ִ����ϲŻ��ͷ���
		try
		{
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		t2.start();	//����t2�̣߳�ִ��function2��������Ҫ�Ȼ�ö�����
	}
}
