/***********************************
 * 第8章 父与子的继承
 * 8.8 final与继承
 * Sample08_27：最终的方法
***********************************/

package Sample08_28;

class Father
{
	public final void show()
	{
		System.out.println("我是final方法，可以被继承，但是不能被重写！");
	}
}

class Son extends Father
{
//	public void show()	//final方法只能被继承，不能被重写
//	{
//		System.out.println("重写final方法！");
//	}
}

public class Sample08_28 
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.show();
	}
}
