/***********************************
 * ��12�� ��δ����쳣
 * 12.7 �쳣��ƥ��
 * Sample12_18��ͬʱ��������쳣
***********************************/

package Sample12_18;

public class Sample12_18 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = new int[4];
			a[4] = 9;
		}
		catch (Exception e)	//Exception�������쳣��ĸ��࣬��˿��Բ������е��쳣��
		{
			System.out.println("�쳣���༰����Ϊ��" + e.toString() +"��");
		}
	}
}
