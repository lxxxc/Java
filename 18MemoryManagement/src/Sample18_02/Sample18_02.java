/***********************************
 * ��18�� �ڴ������
 * 18.3 ����ռ���������
 * Sample18_02��finalize��д
***********************************/

package Sample18_02;

class Father
{
	public void finalize() throws Throwable
	{
		super.finalize();	//���ø����finalize()����
		System.out.println("��ϲ�㣬������Father�࣬����ǰ�ɹ�������finalize������");	//�Լ�����������
	}	
}

class Son extends Father
{
	public void finalize() throws Throwable
	{
		super.finalize();	//���ø����finalize()����
		System.out.println("��ϲ�㣬������Son�࣬����ǰ�ɹ�������finalize������");	//�Լ�����������
	}	
}

public class Sample18_02 
{
	public static void main(String[] args)
	{
		new Son();
		
		System.gc();	//���������ռ������У�����ø����finalize()������ֱ��׷����Object���finalize()����
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
