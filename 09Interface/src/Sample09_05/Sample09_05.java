/***********************************
 * ��9�� �ӿڵ�����
 * 9.4 �ӿ����õ�ʹ��
 * Sample09_05����������ӿ����ü�ĸ�ֵ
***********************************/

package Sample09_05;

interface IFEx1
{
}

interface IFEx2
{
}

class CEx implements IFEx1
{
}

public class Sample09_05 
{
	public static void main(String[] args)
	{
		CEx c = new CEx();	
		IFEx1 ifex1 = c;	//�������ü�ӻ�ֱ��ʵ���˽ӿڣ������ֱ�Ӹ�ֵ���ӿ�����
		c = (CEx)ifex1;	//�������ü�ӻ�ֱ��ʵ���˽ӿڣ�����Խ��ӿ����ø�ֵ�������ã�����Ҫ����ǿ������ת��
	}
}
