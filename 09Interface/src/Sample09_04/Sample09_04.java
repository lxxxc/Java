/***********************************
 * 第9章 接口的世界
 * 9.4 接口引用的使用
 * Sample09_04：接口引用间的赋值
***********************************/

package Sample09_04;

interface Developer
{
}

interface JavaDeveloper extends Developer
{
}

interface Lecturer
{
}

class Person implements JavaDeveloper
{
}

public class Sample09_04 
{
	public static void main(String[] args)
	{
		JavaDeveloper jd = new Person();	//接口引用可以指向间接或之间实现该接口的类对象
		Developer d = jd;	//子接口引用可以直接赋值给父接口引用
		jd = (JavaDeveloper)d;	//父接口引用需要强制类型转换后才能赋值给子接口引用
//		Lecturer l = (Lecturer)d;	//
	}
}
