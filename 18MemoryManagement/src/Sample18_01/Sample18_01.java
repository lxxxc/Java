/***********************************
 * ��18�� �ڴ������
 * 18.2 ���������ռ���
 * Sample18_01�����������ռ�������
***********************************/

package Sample18_01;

public class Sample18_01 
{
	public static void main(String[] args)
	{
		Runtime rt = Runtime.getRuntime();	//���þ�̬���������õ�Runtime����
		System.out.println("��ǰJVMʹ�õ����ڴ���Ϊ��" + rt.totalMemory());
		
		System.gc();	//���������ռ�������
		try
		{
			Thread.sleep(100);	//�������̣߳�������������ռ������еĳɹ���
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("����10000000����������ǰJVM�п����ڴ�Ϊ��" + rt.freeMemory());
		for (int i = 0; i < 10000000; i++) 
		{
			new String("Rubbish");
		}
		System.out.println("����10000000�����������JVM�п����ڴ�Ϊ��" + rt.freeMemory());
		
		System.gc();
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("���������ռ������к�JVM�п����ڴ�Ϊ��" + rt.freeMemory());
	}
}
