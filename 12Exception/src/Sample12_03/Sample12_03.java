/***********************************
 * ��12�� ��δ����쳣
 * 12.1 �쳣����
 * Sample12_03��finally���
***********************************/

/********** try-catch-finally��� **********/
/* ��catchʱfinally�������try
/* catch��finally����ͬʱʡ��
/* try��catch�Լ�finally��֮�䲻�ܲ����κ���������
/********** try-catch-finally��� **********/
package Sample12_03;

public class Sample12_03 
{
	public static void main(String[] args)
	{
		try	//�����쳣����벻ִ��
		{
			int[] a = new int[4];
//			int[] a = null;	//�����ã��ᱻNullPointerException�쳣����
			System.out.println("�������鴴����ϣ�");
			
			a[3] = 9;
//			a[4] = 9;	//�����±�Խ�磬û���쳣�������ϴ�����main����
			System.out.println("���������е��ĸ�Ԫ�ص���ֵΪ" + a[3] + "��");
		}
		catch(NullPointerException npe)	//�������쳣�����벻ִ��
		{
			System.out.println("������ֵĴ��������ǣ������ã�");
		}
		finally	//�����ܻᱻִ��(���⣺finally���鱾������쳣/ִ��finally������߳�����/finally������ִ����System.exit(0);����/������ϵ�)
		{
			System.out.println("������finally�飬�����Ƿ��׳��쳣����������ִ�У�");
		}
	}
}
