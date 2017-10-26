package org.lanqiao.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayout {

	public static void main(String[] args) {
		//创建一个窗体
		JFrame jf = new JFrame("本窗使用流式布局");
		//获取一个容器
		Container container = jf.getContentPane();
		//设置窗体流式布局，使组件右对齐，并且设置组件之间的水平间隔与垂直
		jf.setLayout(new java.awt.FlowLayout(1, 10, 10));
		//在容器中添加10个按钮
		for (int i = 0; i < 10; i++) {
			container.add(new JButton(i + ""));
		}
		//设置窗体大小
		jf.setSize(2000, 1000);
		//设置窗体可见
		jf.setVisible(true);
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

	}

}
