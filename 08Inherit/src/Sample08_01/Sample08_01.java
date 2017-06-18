/***********************************
 * 第8章 父与子的继承
 * Sample8_1：类和类的关系-USES-A关系
***********************************/

package Sample08_01;

class SalonCar	//SalonCar使用了Benzine类中的cubage成员
{
	public void startUp(Benzine b)	
	{
		if (b.isEnough()) 
		{
			System.out.println("恭喜你，汽油的储备量充足，汽车可以启动！");
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
