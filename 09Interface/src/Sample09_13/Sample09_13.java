/***********************************
 * ��9�� �ӿڵ�����
 * 9.8 instanceof��ʹ��
 * Sample09_13������ʹ��
***********************************/

package Sample09_13;

interface IFather
{
}

interface ISon extends IFather
{
}

class Father
{
}

class Son extends Father implements ISon
{
}

public class Sample09_13 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		
		if (s instanceof Son)	//s��Son���͵Ķ��󣬿��Կ���Son���� 
		{
			System.out.println("sָ��Ķ�����Կ���Son���ͣ�");
		}
		if (s instanceof Father)	//s��Son���͵Ķ���Son��̳���Father�࣬���Կ���Father����  
		{
			System.out.println("sָ��Ķ�����Կ���Father���ͣ�");
		}
		if (s instanceof ISon)	//sʵ����ISon�ӿڣ����Կ���ISon���� 
		{
			System.out.println("sָ��Ķ�����Կ���ISon���ͣ�");
		}
		if (s instanceof IFather)	//sʵ����ISon�ӿڣ�ISon�ӿڼ̳���IFather�ӿڣ����Կ���IFahter���� 
		{
			System.out.println("sָ��Ķ�����Կ���IFather���ͣ�");
		}
	}
}
