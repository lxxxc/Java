/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.5 StringBuffer��
 * Sample13_08��StringBuffer�������
***********************************/

package Sample13_08;

public class Sample13_08 
{
	public static void main(String[] args)
	{
		String s = "JavaSE 7.0";
		StringBuffer sb = new StringBuffer("JavaSE 7.0");
		String str = "���ļ�����ȫ";
		
		s.concat(str);	//String�����ַ������ӣ��������ַ�����������ã���s����û�б仯
		sb.append(str);	//StringBuffer�����ַ������ӣ�sb�������˱仯
		
		System.out.println("��String����s�Լ�StringBuffer����sb���ַ������Ӳ�����������£�");
		System.out.println("������s = " + s);
		System.out.println("������sb = " + sb);
	}
}
