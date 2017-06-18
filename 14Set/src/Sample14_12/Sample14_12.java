/***********************************
 * ��14�� ���ϵ�ʹ��
 * 14.10 �Զ���Sorted���ϵ���
 * Sample14_12���Զ���Sorted���ϵ���
***********************************/

package Sample14_12;

import java.util.*;

class MyEntry implements Comparable<Object>	//���Լ��������������ΪԪ�أ��������ʵ��Comparable�ӿ�
{
	int size;
	
	public MyEntry()
	{
		
	}
	
	public MyEntry(int size)
	{
		this.size = size;
	}
	
	public String toString()
	{
		return "[size=" + this.size + "]";
	}
	
	public int compareTo(Object o)
	{
		MyEntry me = (MyEntry)o;
		System.out.println(this.toString() + "��" + me.toString() + "compareTo�ȣ�");
		return this.size - me.size;
	}
	
	public boolean equals(Object o)
	{
		MyEntry me = (MyEntry)o;
		System.out.println(this.toString() + "��" + me.toString() + "equals�ȣ�");
		return (me.size == this.size);
	}
	
	public int hashCode()
	{
		System.out.println(this.toString() + "hashCode��");
		return 12;
	}
}

public class Sample14_12 
{
	public static void main(String[] args)
	{
		//TreeSet��ʹ�ù�ϣ�洢���ԣ���˲�����hashCode����
		//ʵ����compareTo�������������equals��������˲���ʱҲ������equals����
		//ʹ�ú�-������ʵ�ֶ���ƽ����
		TreeSet<MyEntry> ts = new TreeSet<MyEntry>();	
														
		System.out.println("===============����21===============");
		ts.add(new MyEntry(21));
		
		System.out.println("===============����19===============");
		ts.add(new MyEntry(19));
		
		System.out.println("===============����18===============");
		ts.add(new MyEntry(18));
		
		System.out.println("===============����28===============");
		ts.add(new MyEntry(28));
		
		System.out.println("===============�ٴβ���21===============");
		ts.add(new MyEntry(21));
		
		System.out.println("������TreeSet������Ľ��" + ts);
	}
}
