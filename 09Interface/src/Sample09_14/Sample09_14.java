/***********************************
 * ��9�� �ӿڵ�����
 * 9.8 instanceof��ʹ��
 * Sample09_14��null���õ�ʹ��
***********************************/

package Sample09_14;

public class Sample09_14 
{
	public static void main(String[] args)
	{
		String s = null;	
		
		if (s instanceof String)	//null���ò������Ƿ���false 
		{
			System.out.println("��ϲ�㣬����ͨ����");
		}
		else 
		{
			System.out.println("���ź������Բ�ͨ����");
		}
	}
}
