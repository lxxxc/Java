/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.5 StringBuffer��
 * Sample13_09����д������
***********************************/

package Sample13_09;

class MyClass
{
	public MyClass a()
	{
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���a��");
		return this;
	}
	
	public MyClass b()
	{
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���b��");
		return this;
	}
	
	public void c()
	{
		System.out.println("��ϲ�㣬�ɹ�ʹ���˷����������ڵ��õ��˷���c��");
	}
}

public class Sample13_09 
{
	public static void main(String[] args)
	{
		MyClass mc = new MyClass();
		mc.a().b().c();	//�����ķ���a��b�������ͱ���Ϊ�����������ͣ����ķ�������
	}
}
