/***********************************
 * ��18�� �ڴ������
 * 18.4 �����ػ���ʵ��
 * Sample18_04�������ػ���ʵ��
***********************************/

package Sample18_04;

class FinalGuarder
{
	private Object fg = new Object()	//�����ػ��ߣ�����Ϊprivate������������Ϊ����ʱ���������Ҳ����Ϊ������ҲҪ���ռ���ִ��finalize�������ﵽ���Զ��������õ�Ч��
			{
		public void finalize() throws Throwable
		{
			System.out.println("FinalGuarder�౻���������ռ�ʱ��Ҫִ�е�finalize������");
		}
			};
}

class FinalGuarderSon extends FinalGuarder
{
	public void finalize() throws Throwable
	{
		System.out.println("FinalGuarderSon�౻���������ռ�ʱ��Ҫִ�е�finalize������");
	}
}

public class Sample18_04 
{
	public static void main(String[] args)
	{
		new FinalGuarderSon();
		
		System.gc();
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
