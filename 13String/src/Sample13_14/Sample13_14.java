/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.8 ��String����ʹ��������ʽ
 * Sample13_14�������滻
***********************************/

package Sample13_14;

import java.util.regex.*;

public class Sample13_14 
{
	public static void main(String[] args)
	{
		String patternStr = "\\b\\d*\\.\\d{3,}\\b";	//ƥ��С����󳬹���λ��������
		
		String s1 = "123.5 123.56 123.567 123.5600 123.0098";	
		System.out.println("��ʼ�ַ�������Ϊ��" + s1);
		
		String s2 = s1.replaceAll(patternStr, "Error");
		System.out.println("ʹ��replaceAll�������ƥ���滻��" + s2);
		
		s2 = s1.replaceFirst(patternStr, "Error");
		System.out.println("ʹ��replaceFirst�������ƥ���滻��" + s2);
	}
}
