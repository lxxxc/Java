/***********************************
 * ��12�� ��δ����쳣
 * 12.4 �ٴ��׳��쳣
 * Sample12_09���쳣�����׳�
***********************************/

package Sample12_09;

public class Sample12_09 
{
	public static void main(String[] args)
	{
		a();
		System.out.println("��ϲ�㣬���÷����ɹ�����������������");
	}
	
	static void a()
	{
		try	//����a�ж��쳣�����˴���
		{
			b();
		}
		catch (RuntimeException re) 
		{
			System.out.println("�쳣��a�������������");
		}
	}
	
	static void b()
	{
		c();	//b������Ҳδ���쳣���д����쳣�ᱻ����b��������һ�㷽��a
	}
	
	static void c()
	{
		int[] a = new int[3];
		a[4] = 12;	//a�����в��������±�Խ���쳣����û�д����쳣�ᱻ����c��������һ�㷽��b
	}
}
