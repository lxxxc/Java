/***********************************
 * 第14章 集合的使用
 * 14.7 链接实现列表
 * Sample14_07：将数组转换为列表
***********************************/

package Sample14_07;

import java.util.*;

public class Sample14_07 
{
	public static void main(String[] args)
	{
		String[] s = {"tom", "jerry", "lucy", "jc"};
		List<String> l = Arrays.asList(s);	//调用Arrays类的静态方法asList(T a)将对象那个数组转换为列表
		
		System.out.println("这是将字符串数组转换为列表后的结果：" + l	);
	}
}
