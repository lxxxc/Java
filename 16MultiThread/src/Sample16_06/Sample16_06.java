/***********************************
 * ��16�� ���̵߳Ĺ���
 * 16.7 �̵߳�ʹ��
 * Sample16_06���̵߳��ò�:join����
***********************************/

package Sample16_06;

class MyThread extends Thread
{
	public void run()
	{
		for (int i = 0; i < 30; i++)
		{
			System.out.print("[" + i + "] ");
		}
		System.out.print("{���߳�ִ�н�����} ");
	}
}

public class Sample16_06 
{
	public static void main(String[] args)
	{
		Thread t = new MyThread();
		t.start();
		
		for (int i = 0; i < 30; i++)
		{
			if (i == 10)
			{
				try
				{
					System.out.print("{ʹ����join����}");
					t.join();	//����join���������߳�һֱ�ȵ��߳�tִ����ϲż���ִ�У����Ա�֤�̵߳��ò�ִ��
				}
				catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			System.out.print("<" + i + "> ");
		}
	}
}
