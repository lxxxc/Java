/***********************************
 * 第14章 集合的使用
 * 14.5 列表
 * Sample14_04：List接口
***********************************/

package Sample14_04;

import java.util.*;

public class Sample14_04 
{
	public static void main(String[] args)
	{
		//ArrayList类，随机访问性能好，插入/删除性能差
		ArrayList<String> al = new ArrayList<>();	//需要在<>内指定具体的类型
		
		for (int i = 0; i < 50; i++)
		{
			al.add(String.valueOf(i));	//添加元素
		}
		for(int i = 60; i < 75; i++)
		{
			al.set(i - 45, String.valueOf(i));	//替换元素
		}
		
		System.out.println("这里是ArrayList操作后的结果：");
		System.out.println(al);
		
		Object o = al.get(22);	//使用get方法返回Object类型的引用
		String s = (String)o;
		System.out.println("索引为22的元素长度为：" + s.length());
	}
}
