/***********************************
 * ��18�� �ڴ������
 * 18.3 ����ռ���������
 * Sample18_03��finalize��ȫ����
***********************************/

package Sample18_03;

class CallBack
{
	static CallBack help;
	
	public void show()
	{
		System.out.println("show�������ܷ��ʣ��ö���û�б������ռ���");
	}
	
	public void finalize()
	{
		System.out.println("��һ���ռ�CallBack���󣬵�����finalize������");
		CallBack.help = this;	//����Լ�����Ϊ����
	}
}

class Common
{
	public void finalize()
	{
		System.out.println("�ռ�Common���󣬵�����finalize������");
	}
}

public class Sample18_03 
{
	public static void main(String[] args)
	{
		System.out.println("==========������һ��CallBack����ʹ���Ϊ����==========");
		new CallBack();
		
		System.gc();	//���������ռ������У�CallBack������ȣ�û�б������ռ�
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		CallBack.help.show();
		
		System.out.println("==========������һ��Common����ʹ���Ϊ����==========");
		new Common();
		System.out.println("==========�ٴ�ʹCallBack�����Ϊ����==========");
		CallBack.help = null;
		
		System.gc();	//�ٴ����������ռ������У������Ѿ�ִ�й�CallBack�����finalize����������ִ�У�ֱ���������
		try
		{
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		CallBack.help.show();
	}
}
