/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.8 ��String����ʹ��������ʽ
 * Sample13_15�����ַ������зֲ�
***********************************/

package Sample13_15;

public class Sample13_15 
{
	public static void main(String[] args)
	{
		String patternStr = ";|,";	//ƥ��;����,
		String str = "Tom;Lucy,Jerry;";
		System.out.println("���и��ַ����ĳ�ʼ����Ϊ��" + str);
		
		System.out.print("���ַ����и�Ĭ�Ϸݣ����Ϊ��");	
		String[] arrStr = str.split(patternStr);	//���ַ��������ܶ�Ĳ��
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n���ַ����и�3�ݣ����Ϊ��");
		arrStr = str.split(patternStr, 3);	//���ַ�����ֳ�3��
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n���ַ����и�-2�ݣ����Ϊ��");
		arrStr = str.split(patternStr, -2);	//���ַ��������ܶ�Ĳ�֣�������ַ���
		for (int i = 0; i < arrStr.length; i++)
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
		
		System.out.print("\n���ַ����и�0�ݣ����Ϊ��");
		arrStr = str.split(patternStr, 0);	//���ַ��������ܶ�Ĳ�֣��������ַ���
		for (int i = 0; i < arrStr.length; i++)	
		{
			System.out.print("arrStr[" + i + "]=<" + arrStr[i] + "> ");
		}
	}
}
