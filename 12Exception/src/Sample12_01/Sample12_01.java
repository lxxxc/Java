/***********************************
 * ��12�� ��δ����쳣
 * 12.1 �쳣����
 * Sample12_01��try-catch����ִ������
***********************************/

package Sample12_01;

public class Sample12_01 
{
	public static void main(String[] args)
	{
		try
		{
			int[] a = new int[4];
//			int[] a = null;	//�����ã��ᱻNullPointerException�쳣����
			System.out.println("�������鴴����ϣ�");
			
			a[3] = 9;
//			a[4] = 9;	//�����±�Խ�磬�ᱻArrayIndexOutOfBoundsException�쳣����
			System.out.println("���������е��ĸ�Ԫ�ص���ֵΪ" + a[3] + "��");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
			System.out.println("������ֵĴ��������ǣ������±�Խ�磡");
		}
		catch(NullPointerException npe)
		{
			System.out.println("������ֵĴ��������ǣ������ã�");
		}
		System.out.println("����������������");
	}
}
