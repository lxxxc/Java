/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.9 �����ڲ���
 * Sample15_12�����ڽӿ�ʵ�ֵ������ڲ���
***********************************/

package Sample15_12;

interface MyInterface
{
	public void show();
}

public class Sample15_12 
{
	public static void main(String[] args)
	{
		MyInterface mi = new MyInterface()	//����ʵ��MyInterface�ӿڵ������ڲ��ಢ��������
		{
			public void show() 
			{
				System.out.println("��ϲ�㣬�����������ڲ���Ķ��󣬸���ʵ����MyInterface�ӿڣ�");
			}		
		};
		mi.show();
	}
}
