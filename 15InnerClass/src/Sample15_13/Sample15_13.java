/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.9 �����ڲ���
 * Sample15_13�������ڲ���ĳ�ʼ��
***********************************/

package Sample15_13;

abstract class FatherForInner
{
	int count;
	abstract void show();
}

public class Sample15_13 
{
	public static void main(String[] args)
	{
		FatherForInner ffi = new FatherForInner() 
		{
			{	//����Ǿ�̬���飬��ʼ����Ա
				count = (int)(100 * Math.random());
			}

			@Override
			public void show() 
			{
				System.out.println("��ʼ����count��ֵΪ��" + count + "��");
			}			
		};
		ffi.show();
	}
}
