/***********************************
 * ��12�� ��δ����쳣
 * 12.7 �쳣��ƥ��
 * Sample12_19�����catch�����Ⱥ�˳��
***********************************/

package Sample12_19;

public class Sample12_19 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = null;
			a[4] = 9;
		}
		catch (NullPointerException npe)	//NullPointerException��̳���Exception�࣬��˲����쳣�Ĵ��������ǰ��
		{
			System.out.println("�����������쳣��" + npe.toString() +"��");
		}
		catch (Exception e)
		{
			System.out.println("�����쳣��" + e.toString() +"��");
		}

	}
}
