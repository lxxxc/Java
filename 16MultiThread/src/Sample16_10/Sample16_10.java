/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.11 ͬ������
 * Sample16_10��ͬ������
***********************************/

package Sample16_10;

class MyThread extends Thread
{
	private Object resource;
	
	public MyThread(){};
	
	public MyThread(Object resource, String name)
	{
		this.resource = resource;
		this.setName(name);
	}
	
	public void run()
	{
		synchronized(resource)	//����ͬ�����飬ͬһʱ�̲��������߳�ִ��
		{
			System.out.println(this.getName() + "�̷߳�������Դ��");
			System.out.println(this.getName() + "�̴߳�����˯��ȥ�ˣ�");
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(this.getName() + "�̴߳�����˯�Ѻ��ͷ�������");
		}
	}
}

public class Sample16_10 
{
	public static void main(String[] args)
	{
		Object resource = new Object();
		MyThread mt1 = new MyThread(resource, "MT1");
		MyThread mt2 = new MyThread(resource, "MT2");
		mt1.start();
		mt2.start();
	}
}
