/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.5 �������÷���
 * Sample11_04����̬��������
***********************************/

package Sample11_04;

public class Sample11_04 
{
	public static void main(String[] args)
	{
		Integer wInt;
		int i = 10;
		int radix = 2;	
		String s = "1001011";
		
		wInt = Integer.valueOf(i);	//���þ�̬��������valueOf()��ͨ��int��������Integer����
		System.out.println("int��" + i + "; Integer:" + wInt);
		
		wInt = Integer.valueOf(s);	//���þ�̬��������valueOf()��ͨ��string��������Integer����
		System.out.println("String��" + s + "; Integer(10����):" + wInt);
		
		wInt = Integer.valueOf(s, radix);
		System.out.println("String��" + s + "; Integer(2����):" + wInt);
		
		Boolean wBoolean;
		boolean b = true;
		s = "false";
		
		wBoolean = Boolean.valueOf(b);
		System.out.println("boolean��" + b + "; Boolean:" + wBoolean);
		
		wBoolean = Boolean.valueOf(s);
		System.out.println("boolean��" + s + "; Boolean:" + wBoolean);
	}
}
