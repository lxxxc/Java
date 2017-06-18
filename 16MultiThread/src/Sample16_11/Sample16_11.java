/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.12 �̵߳�����
 * Sample16_11���̵߳�����
***********************************/

package Sample16_11;

class MyThread extends Thread
{
	private Object resource1;
	private Object resource2;
	
	public MyThread(){};
	
	public MyThread(Object resource1, Object resource2, String name)
	{
		this.resource1 = resource1;
		this.resource2 = resource2;
		this.setName(name);
	}
	
	public void run()
	{
		synchronized(resource1)
		{
			System.out.println(this.getName() + "�߳��õ�" + resource1 + "���������");
			try
			{
				Thread.sleep(10);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println(this.getName() + "�ȴ�" + resource1 + "��������ͷţ�");
		
			synchronized(resource2)
			{
				System.out.println(this.getName() + "�߳��õ���" + resource2.toString() + "������");
				System.out.println(this.getName() + "���Զ�������Դͬʱ�����ˣ�");
			}
		}
	}
}

public class Sample16_11 
{
	public static void main(String[] args)
	{
		String s1 = "tom";
		String s2 = "jerry";
		String s3 = "lucy";
		
		//�߳��õ���Դ������ͬʱ�ȴ��Ѿ������������������������
		MyThread mt1 = new MyThread(s1, s2, "MT1");
		MyThread mt2 = new MyThread(s2, s3, "MT2");
		MyThread mt3 = new MyThread(s3, s1, "MT3");
		mt1.start();
		mt2.start();
		mt3.start();
	}
}
