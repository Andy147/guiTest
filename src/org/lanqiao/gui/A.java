package org.lanqiao.gui;

public class A {
	public static void main(String[] args) {
		double i = 0;
		double i1 = 141.7794;
		double i2 = 14.1796;
		for (double j = 0; j < 1000; j= j + 0.0001) {
			if (j / (j - i1) > 0 && j / (j - i1) == Math.pow((j / (j - i2)), 10)) {
				System.out.println(j);
			}
		}
	}

}
