/***********************************
 * ��15�� �ڲ���Ӧ��
 * 15.9 �����ڲ���
 * Sample15_11�����ڼ̳е������ڲ���
***********************************/

package Sample15_11;

class Father
{
	public void show()
	{
		System.out.println("������Father��ķ���");
	}
}

public class Sample15_11 
{
	public static void main(String[] args)
	{
		Father f = new Father()	//����һ�������ڲ��࣬ͬʱ����һ�������ڲ������
		{
			public void show()
			{
				System.out.println("��ϲ�㣬�ɹ������������ڲ���Ķ���");
			}
		};	//��Ҫһ����		
		f.show();
	}
}
