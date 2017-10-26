package org.lanqiao.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingTest extends JFrame{
	public void CreateJFrame(String title){
		JFrame jf = new JFrame(title);//实例化一个JFrame对象
		Container container = jf.getContentPane();//获取一个容器
		JLabel jl = new JLabel("这是一个JFrame窗体");
		//标签的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);//将标签添加到容器中
		container.setBackground(Color.blue);//设置容器背景颜色
		jf.setVisible(true);//设置窗体可视化
		jf.setSize(200, 150);//设置窗体大小
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new SwingTest().CreateJFrame("这是一个窗体");
	}

}
