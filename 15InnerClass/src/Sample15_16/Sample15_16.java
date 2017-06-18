/***********************************
 * 第15章 内部类应用
 * 15.11 内部接口
 * Sample15_16：定义在接口中的内部接口
***********************************/

package Sample15_16;

interface OuterInterface
{
	interface InnerInterface
	{
		public void inShow();
	}
	
	public void outShow();
}

class InnerInterfaceImpl implements OuterInterface.InnerInterface
{
	@Override
	public void inShow() 
	{
		System.out.println("恭喜你，这个类成功实现了内部接口！");
	}
}

class OutInterfaceImpl implements OuterInterface
{
	@Override
	public void outShow() 
	{
		System.out.println("恭喜你，这个类成功实现了外部接口！");
	}
}

public class Sample15_16 
{
	public static void main(String[] args)
	{
		OuterInterface.InnerInterface iic = new InnerInterfaceImpl();
		OuterInterface oic = new OutInterfaceImpl();
		iic.inShow();
		oic.outShow();
	}
}
