/***********************************
 * ��9�� �ӿڵ�����
 * 9.8 instanceof��ʹ��
 * Sample09_15���������õ�ʹ��
***********************************/

package Sample09_15;

class Father
{
}

class Son extends Father
{
}

public class Sample09_15 
{
	public static void main(String[] args)
	{
		int[] intArray = new int[5];
		if (intArray instanceof int[])
		{
			System.out.println("intArray��int[]���͵ģ�");
		}
		
		Son[] sonArray = new Son[12];
		if (sonArray instanceof Son[])
		{
			System.out.println("sonArray��Son[]���͵ģ�");
		}
		if (sonArray instanceof Father[])
		{
			System.out.println("sonArray��Father[]���͵ģ�");
		}
	}
}
