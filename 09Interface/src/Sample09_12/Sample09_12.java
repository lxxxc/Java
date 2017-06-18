/***********************************
 * 第9章 接口的世界
 * 9.7 接口回调
 * Sample09_12：接口回调
***********************************/

package Sample09_12;

interface MyListener
{
	void specialProcessEvent();
}

class MyMonitor
{
	MyListener ml;	//接口不能实例化，但是可以使用接口类型的引用
	
	public void regListener(MyListener ml)
	{
		this.ml = ml;	//使用接口引用来指向不同类对象
	}
	
	public void generalProcessEvent()
	{
		this.ml.specialProcessEvent();
	}
}

class ProcessorA implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("我采用A策略处理事件！");
	}
}

class ProcessorB implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("我采用B策略处理事件！");
	}
}

public class Sample09_12 
{
	public static void main(String[] args)
	{
		MyMonitor mm = new MyMonitor();
		ProcessorA pa = new ProcessorA();
		ProcessorB pb = new ProcessorB();
		
		mm.regListener(pa);
		mm.generalProcessEvent();
		
		mm.regListener(pb);
		mm.generalProcessEvent();
	}
}
