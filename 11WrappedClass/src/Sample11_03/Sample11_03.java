/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.2 �ַ����������������ֵ��ת��
 * Sample11_03��������������ֵת��Ϊ�ַ���
***********************************/

package Sample11_03;

public class Sample11_03 
{
	public static void main(String[] args)
	{
		String s;
		
		boolean b = true;
		s = String.valueOf(b);
		System.out.println("booleanת��ΪString��" + s);
		
		char c = 'A';
		s = String.valueOf(c);
		System.out.println("charת��ΪString��" + s);
		
		char[] cs = new char[]{'A', 'b', 'E', 'h'};
		s = String.valueOf(cs);
		System.out.println("char[]ת��ΪString��" + s);
		s = String.valueOf(cs, 1, 2);
		System.out.println("char[]ת��ΪString��" + s);
		
		double d = -43.325;
		s = String.valueOf(d);
		System.out.println("doubleת��ΪString��" + s);
		
		float f = 23.4f;
		s = String.valueOf(f);
		System.out.println("floatת��ΪString��" + s);
		
		int i = -32443;
		s = String.valueOf(i);
		System.out.println("intת��ΪString��" + s);
		
		long l = 5744845454614561546L;
		s = String.valueOf(l);
		System.out.println("longת��ΪString��" + s);
	}
}
