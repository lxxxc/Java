/***********************************
 * ��8�� �����ӵļ̳�
 * Sample8_1�������Ĺ�ϵ-USES-A��ϵ
***********************************/

package Sample08_01;

class SalonCar	//SalonCarʹ����Benzine���е�cubage��Ա
{
	public void startUp(Benzine b)	
	{
		if (b.isEnough()) 
		{
			System.out.println("��ϲ�㣬���͵Ĵ��������㣬��������������");
		}
	}
}

class Benzine
{
	private int cubage = 100;
	
	public boolean isEnough()
	{
		if (cubage > 80)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class Sample08_01 
{
	public static void main(String[] args)
	{
		Benzine b = new Benzine();
		SalonCar sc = new SalonCar();
		
		sc.startUp(b);
	}
}
