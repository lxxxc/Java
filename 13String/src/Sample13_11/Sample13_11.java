/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.6 StringBuilder��
 * Sample13_11��StringBuilder��
***********************************/

package Sample13_11;

public class Sample13_11 
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("Java7.0");
		System.out.println("����֮ǰ����sb������Ϊ��" + sb);
		
		sb.append("���ļ�����ȫ").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("һϵ�в���֮�����sb������Ϊ��" + sb);
	}
}
