/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.8 ��String����ʹ��������ʽ
 * Sample13_13��ƥ����
***********************************/

package Sample13_13;

import java.util.regex.*;

public class Sample13_13 
{
	public static void main(String[] args)
	{
		String patternStr = "\\d{4}-\\d{2}-\\d{2}";	//ƥ��xxxx-xx-xx�����ַ���
		String s1 = "9999-66-88";
		String s2 = "����Ϊ9999-66-88";
		
		if (s1.matches(patternStr))	//ʹ���ַ�����match������ƥ�䣬��ֻ������ƥ��
		{
			System.out.println("��ϲ�㣬�ַ���s1����ָ���ĸ�ʽҪ��");
		}
		else
		{
			System.out.println("����ʧ�ܣ��ַ���s1������ָ���ĸ�ʽҪ��");
		}
		
		if (s2.matches(patternStr))
		{
			System.out.println("��ϲ�㣬�ַ���s2����ָ���ĸ�ʽҪ��");
		}
		else
		{
			System.out.println("����ʧ�ܣ��ַ���s2������ָ���ĸ�ʽҪ��");
		}
	}
}
