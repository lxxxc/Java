/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.3 String�ڴ���Ƶ�����
 * Sample13_06����Զ������ַ�������
***********************************/

package Sample13_06;

public class Sample13_06 
{
	public static void main(String[] args)
	{
		String s1 = "JavaSE 7.0";
		String s2 = "���ļ�����ȫ";
		
		s2 = s1.concat(s2);	//ִ�����Ӳ�����s1����û�з����仯�������Ӻ���ַ�����������÷���ʹs2ָ�����ַ�������
		
		System.out.println("���ַ���s1���������ַ����������ַ���s1��s2�Ľ��Ϊ��");
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
