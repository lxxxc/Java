/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.1 String��
 * Sample13_02�����ù�����
***********************************/

package Sample13_02;

public class Sample13_02 
{
	public static void main(String[] args) throws Exception
	{
		String s1 = "Java���ļ�����ȫ";
		
		String s2 = new String(s1.getBytes(), "iso8859_1");
		System.out.println("��s1ת��ΪISO8859_1�����ʽ�����Ϊ��" + s2);
		
		String s3 = new String(s2.getBytes("iso8859_1"), "gb2312");
		System.out.println("��s2��ת��ΪGB2312�����ʽ�����Ϊ��" + s3);
	}
}
