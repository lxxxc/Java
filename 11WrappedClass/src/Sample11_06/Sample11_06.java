/***********************************
 * ��11�� �Ի�ķ�װ��
 * 11.5 �������÷���
 * Sample11_06��equals()����
***********************************/

package Sample11_06;

public class Sample11_06 
{
	public static void main(String[] args)
	{
		int i = 125;
		Integer wInt = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt) ? "����" : "������") + " wInt");	//�Ƚ϶���ֵ�Ƿ����
		System.out.println("wInt " + (wInt == wInt ? "==" : "!=") + " wInt");	//�Ƚ϶��������Ƿ����
		
		Integer wInt1 = Integer.valueOf(i);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "����" : "������") + " wInt");
		System.out.println("wInt " + (wInt == wInt1 ? "==" : "!=") + " wInt");
		
		int i1 = 127;
		wInt = Integer.valueOf(i1);
		System.out.println("wInt " + (wInt.equals(wInt1) ? "����" : "������") + " wInt");
		System.out.println("wInt " + (wInt == wInt1 ? "==" : "!=") + " wInt");
	}
}
