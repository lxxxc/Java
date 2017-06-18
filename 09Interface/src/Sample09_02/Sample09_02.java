/***********************************
 * 第9章 接口的世界
 * 9.2 接口中的成员变量
 * Sample09_02：接口中成员变量的作用
***********************************/

package Sample09_02;

interface Flyer
{
	public static final int HIGH = 1;
	public static final int MIDDLE = 2;
	public static final int LOW = 3;
}

class AirPlane implements Flyer
{
	public void setFlyHeight(int height)
	{
		switch (height) 
		{
			case HIGH:
				System.out.println("我现在处在高空飞行状态！");
				break;
				
			case MIDDLE:
				System.out.println("我现在处在中等高度飞行状态！");
				break;
				
			case LOW:
				System.out.println("我现在处在低空飞行状态！");
				break;
	
			default:
				break;
		}
	}
}

public class Sample09_02 
{
	public static void main(String[] args)
	{
		AirPlane ap = new AirPlane();
		ap.setFlyHeight(Flyer.LOW);	//使用接口中的成员变量，需要使用接口的名称来调用，Flyer.LOW/AirPlace.LOW/ap.LOW
	}
}
