package org.lanqiao.gui;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
public class DrawIcon implements Icon{
	
	//声明图标的宽度
	private int width;
	//声明图标的高度
	private int heigh;

	@Override
	public int getIconHeight() {
		return this.heigh;
	}

	@Override
	public int getIconWidth() {
		return this.width;
	}
	public DrawIcon(int width , int heigh){
		this.width = width;
		this.heigh = heigh;
	}

	@Override
	public void paintIcon(Component arg0, Graphics arg1, int x, int y) {
		//绘制一个图形
		arg1.fillOval(x, y, width, heigh);
		
	}
	public static void main(String[] args) {
		DrawIcon icon = new DrawIcon(50, 50);
		//创建标签并设置文字居中对齐
		JLabel jl = new JLabel("测试" , icon ,SwingConstants.CENTER);
		//创建一个窗体
		JFrame jf = new JFrame();
		//获取一个容器
		Container container = jf.getContentPane();
		//向容器添加标签
		container.add(jl);
		//使窗体可视化
		jf.setVisible(true);
		//设置窗体的大小
		jf.setSize(400, 300);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}

}
