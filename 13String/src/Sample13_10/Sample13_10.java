/***********************************
 * ��13�� �ַ���Ӧ��
 * 13.5 StringBuffer��
 * Sample13_10��StringBuffer�����Ҫ����
***********************************/

package Sample13_10;

public class Sample13_10 
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("Java7.0");
		System.out.println("����֮ǰ����sb1������Ϊ��" + sb1);
		
		sb1.append("���ļ�����ȫ").insert(4, "SE").delete(9, 15).reverse();
		System.out.println("һϵ�в���֮�����sb1������Ϊ��" + sb1);
		
		
		StringBuffer sb2 = new StringBuffer(sb1.toString());
		System.out.println("===== ʹ��StringBuffer��equals�������Զ���sb1��sb2������ =====");
		if (sb1.equals(sb2))	//StringBuffer���equals�����൱�ڱȽ����������Ƿ�ָ��ͬһ�������൱��"=="
		{
			System.out.println("����sb1��sb2��������ͬ��");
		}
		else
		{
			System.out.println("����sb1��sb2�����ݲ���ͬ��");
		}
		
		System.out.println("===== ʹ��toString������ʹ��equals�������Զ���sb1��sb2������ =====");
		String s1 = sb1.toString();
		String s2 = sb2.toString();
		if (s1.equals(s2))	//���Ҫ�Ƚ�����StringBuffer����������Ƿ���ͬ����Ҫ���ȵ���toString�����ٽ��бȽ�
		{
			System.out.println("����sb1��sb2��������ͬ��");
		}
		else
		{
			System.out.println("����sb1��sb2�����ݲ���ͬ��");
		}
	}
}
