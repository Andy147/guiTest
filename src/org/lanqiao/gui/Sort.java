package org.lanqiao.gui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Sort {
	public static void main(String[] args) {
//		int[] a = {2,32,54,223};
//		System.out.println("排序前：");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
//		sort(a);
//		System.out.println("排序后：");
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+"\t");
//		}
//		
//	}
//	public static void sort(int[] arr){
//		int low;
//		int high;
//		int mid;
//		for (int i = 2; i < arr.length; i++) {
//			//哨兵位
//			arr[0] = arr[i];
//			//要将第i位插入前i-1有序序列
//			low = 1;
//			high = i - 1;
//			//折半查找
//			while (low <= high) {
//				mid = (high + low) / 2;
//				System.out.println("low:" + low + "high:" + high + "mid" + mid);
//				if (arr[0] < arr[mid]) {
//					high = mid - 1;
//				}else {
//					low = mid + 1;
//				}
//				
//			}
//			//要插入high+1位置，需要把high+1-----i-1位置的数据依据依次后移一位
//			for (int j = i - 1; j >= high+1; j--) {
//				arr[ j + 1] = arr[j];
//			}
//			arr[high + 1] = arr[0];
//		}
		int[] arr = new int[100];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100);
			System.out.println(arr[i]);			
		}
		
		}
	}


