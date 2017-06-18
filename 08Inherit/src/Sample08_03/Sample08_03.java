/***********************************
 * 第8章 父与子的继承
 * Sample8_3：成员变量的继承-公有成员
***********************************/

package Sample08_03;

public class Sample08_03 
{
	public String str1 = "该成员变量为public类型，能够被子类成功继承！";	//public类型的成员变量可以被包外的类继承
	protected String str2 = "该成员变量为protected类型，能够被子类成功继承！";	//protected类型的成员变量可以被包外的类继承
}
