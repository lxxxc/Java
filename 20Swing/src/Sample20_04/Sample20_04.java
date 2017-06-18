/***********************************
 * 第20章 Swing编程
 * 20.5 窗体事件
 * Sample20_04：窗体事件
***********************************/

package Sample20_04;

import java.awt.event.*;
import javax.swing.*;

public class Sample20_04 extends JFrame implements WindowListener	//继承JFrame类并实现WindowListener接口，既作为窗体事件的事件源又作为监听器
{
	public Sample20_04()
	{
		this.setTitle("关闭窗体事件处理被重新定义的窗体");
		this.add(new JLabel("                           这是一个演示窗体，用来演示如何监听窗体关闭事件！"));
		this.addWindowListener(this);	//向窗体对象注册监听器，因为自己就是监听器，所以使用this
		this.setBounds(100, 100, 500, 200);
		this.setVisible(true);
	}

	//非抽象类必须实现接口中的所有方法
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) 
	{	
		System.out.println("当窗体关闭时将执行这里的代码！");
		System.exit(0);
	}

	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}

	public static void main(String[] args)
	{
		new Sample20_04();
	}
}
