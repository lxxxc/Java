/***********************************
 * ��12�� ��δ����쳣
 * 12.6 �Զ����쳣
 * Sample12_17���������׳��쳣������
***********************************/

package Sample12_17;

class MyExceptionToHighLevel extends Exception	//�в����ϲ㱨���쳣��
{
	public MyExceptionToHighLevel()
	{
		
	}
	
	public MyExceptionToHighLevel(String msg)
	{
		super(msg);
	}
}

class MyExceptionFromLowLevel extends Exception	//�Ͳ����в㱨���쳣��
{
	public MyExceptionFromLowLevel()
	{
		
	}
	
	public MyExceptionFromLowLevel(String msg)
	{
		super(msg);
	}
}

class MyClass
{
	public void doLowLevelStaff(int a) throws MyExceptionFromLowLevel
	{
		if (a > 50)
		{
			System.out.println("��ϲ�㣬�Ͳ㷽��ִ�гɹ���");
		}
		else
		{
			System.out.println("�Ͳ㷢���¹ʣ��ϱ�����");
			throw new MyExceptionFromLowLevel("ֵ������50�������¹ʣ�");	//ִ�з����������Խ��쳣�׳�
		}
	}
	
	public void doMiddleLevelStaff() throws MyExceptionToHighLevel
	{
		try
		{
			int value = (int)Math.round(Math.random() * 100);
			System.out.println("����ֵΪ��" + value + "��");
			this.doLowLevelStaff(value);	//���õͲ㴦�������п��ܲ����쳣
		}
		catch (MyExceptionFromLowLevel e)	//����Ͳ��쳣��Ȼ��������֮�����Խ��쳣���׳�
		{
			System.out.println("�����¹ʣ��в��Ƚ���һЩ����Ȼ���ϱ����ϲ㣡");
			throw new MyExceptionToHighLevel("���¹ʷ��������ϲ㴦��");
		}
	}
	
	public void doHighLevelStaff()
	{
		try
		{
			this.doMiddleLevelStaff();	//�����в㴦�������п��ܲ����쳣
		}
		catch (MyExceptionToHighLevel e)	
		{
			System.out.println("�ϲ����մ����¹ʣ�");
		}
	}
}

public class Sample12_17 
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.doHighLevelStaff();
	}
}
