/***********************************
 * 第11章 迷惑的封装类
 * 11.5 其它常用方法
 * Sample11_05：isNaN()方法
***********************************/

package Sample11_05;

public class Sample11_05 
{
	public static void main(String[] args)
	{
		Double wDouble;
		double d;
		d = 0.0 / 0.0;
		boolean b;
		
		b = Double.isNaN(d);	//使用静态方法判断是否是NaN
		System.out.println("0.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		
		wDouble = Double.valueOf(d);	//使用静态工厂方法生成对象
		b = wDouble.isNaN();	//使用成员方法判断是都是NaN
		System.out.println("0.0 / 0.0 " + (b ? "is " : "is not ") + "NaN.");
		
		System.out.println(Double.NaN == Double.NaN);	//NaN是唯一与自身的值
	}
}
