/***********************************
 * 第14章 集合的使用
 * 14.15 集合的元素的常用操作
 * Sample14_26：任意打乱元素顺序
***********************************/

package Sample14_26;

import java.util.*;

public class Sample14_26 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();

		for (int i = 1; i < 14; i++) 
		{
			String s = null;

			switch (i) 
			{
				case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8:	s = (i + 1) + "";	break;
				case 9:		s = "10";	break;
				case 10: 	s = "J";	break;
				case 11:	s = "Q";	break;
				case 12:	s = "K";	break;
				case 13:	s = "A";	break;
				default:	break;
			}
			al.add("黑桃" + s);  
			al.add("红桃" + s);  
			al.add("梅花" + s);  
			al.add("方片" + s);  
		}
		al.add("大王");  
		al.add("小王"); 
		
		System.out.println("这是扑克牌的初始顺序：");
		System.out.println(al);
		
		Collections.shuffle(al);	//打乱元素顺序
		System.out.println("这是扑克牌洗过牌后的初始顺序：");
		System.out.println(al);
	}
}
