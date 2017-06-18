/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.11 �ڲ��ӿ�
 * Sample15_16�������ڽӿ��е��ڲ��ӿ�
***********************************/

package Sample15_16;

interface OuterInterface
{
	interface InnerInterface
	{
		public void inShow();
	}
	
	public void outShow();
}

class InnerInterfaceImpl implements OuterInterface.InnerInterface
{
	@Override
	public void inShow() 
	{
		System.out.println("��ϲ�㣬�����ɹ�ʵ�����ڲ��ӿڣ�");
	}
}

class OutInterfaceImpl implements OuterInterface
{
	@Override
	public void outShow() 
	{
		System.out.println("��ϲ�㣬�����ɹ�ʵ�����ⲿ�ӿڣ�");
	}
}

public class Sample15_16 
{
	public static void main(String[] args)
	{
		OuterInterface.InnerInterface iic = new InnerInterfaceImpl();
		OuterInterface oic = new OutInterfaceImpl();
		iic.inShow();
		oic.outShow();
	}
}
