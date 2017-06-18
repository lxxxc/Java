/***********************************
 * ��9�� �ӿڵ�����
 * 9.7 �ӿڻص�
 * Sample09_12���ӿڻص�
***********************************/

package Sample09_12;

interface MyListener
{
	void specialProcessEvent();
}

class MyMonitor
{
	MyListener ml;	//�ӿڲ���ʵ���������ǿ���ʹ�ýӿ����͵�����
	
	public void regListener(MyListener ml)
	{
		this.ml = ml;	//ʹ�ýӿ�������ָ��ͬ�����
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
		System.out.println("�Ҳ���A���Դ����¼���");
	}
}

class ProcessorB implements MyListener
{
	public void specialProcessEvent()
	{
		System.out.println("�Ҳ���B���Դ����¼���");
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
