/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.5 �������÷���
 * Sample11_08������ת������
***********************************/

package Sample11_08;

public class Sample11_08 
{
	public static void main(String[] args)
	{
		String s = "";
		int i = 60;
		
		s = Integer.toBinaryString(i);
		System.out.println(i + "ת��Ϊ�����ƣ�" + s);
		s = Integer.toOctalString(i);
		System.out.println(i + "ת��Ϊ�˽��ƣ�" + s);
		s = Integer.toHexString(i);
		System.out.println(i + "ת��Ϊʮ���ƣ�" + s);
	}
}
