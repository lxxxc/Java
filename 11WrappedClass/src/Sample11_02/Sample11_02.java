/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.2 �ַ����������������ֵ��ת��
 * Sample11_02���ַ���ת��Ϊ������������ֵ
***********************************/

package Sample11_02;

public class Sample11_02 
{
	public static void main(String[] args)
	{
		String number;
		
		number = "60";
		byte b = Byte.parseByte(number);
		System.out.println("ʮ����byte��" + b);
		b = Byte.parseByte(number, 8);
		System.out.println("�˽���byte��" + b);
		
		number = "-30";
		short s = Short.parseShort(number);
		System.out.println("ʮ����short��" + s);
		s = Short.parseShort(number, 8);
		System.out.println("�˽���short��" + s);
		
		number = "100101";
		int i = Integer.parseInt(number);
		System.out.println("ʮ����int��" + i);
		i = Integer.parseInt(number, 2);
		System.out.println("������int��" + i);
		
		number = "124.34f";
		float f = Float.parseFloat(number);
		System.out.println("float��" + f);

		number = "111.2431";
		double d = Double.parseDouble(number);
		System.out.println("double��" + d);
		
		number = "725585265655223";
		long l = Long.parseLong(number);
		System.out.println("long��" + l);
	}
}
