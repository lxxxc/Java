/***********************************
 * ��12�� ��δ����쳣
 * 12.8 ����
 * Sample12_20����������ִ�д���
***********************************/

//�������ԣ�Window->Preferences->Java->Installed JREs->Edit->Default VM arguments:-ea

package Sample12_20;

public class Sample12_20 
{
	public static void main(String[] args)
	{
		myFunction(-12);
	}
	
	private static void myFunction(int i)
	{
		assert (i >= 0):"����ʧ�ܣ���ֵiС��0����ֵi=" + i;
		System.out.println("��ϲ�㣬�����жϳɹ�����������������У�");
	}
}
