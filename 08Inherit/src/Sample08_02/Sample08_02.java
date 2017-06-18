/***********************************
 * 第8章 父与子的继承
 * Sample8_2：类和类的关系-HAS-A关系
***********************************/

package Sample08_02;

class Car
{
	private Tyre t = new Tyre();
	
	public Tyre getTyre()
	{
		return t;
	}
}

class Tyre
{
	private String material = "橡胶";
	private String color = "黑色";
	
	public String getMaterial()
	{
		return material;
	}
	
	public String getColor()
	{
		return color;
	}
}

public class Sample08_02 
{
	public static void main(String[] args)
	{
		Car c = new Car();
		
		System.out.println("轿车所使用轮胎的颜色为：" + c.getTyre().getColor());
		System.out.println("轿车所使用轮胎的材料为：" + c.getTyre().getMaterial());
	}
}
