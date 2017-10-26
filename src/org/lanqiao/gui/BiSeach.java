package org.lanqiao.gui;

public class BiSeach {
	public static void main(String[] args) {
		int[] test = {23,44,55,56,67,77,78};
		int elem = 44;
		int result = biSeach(test, elem);
		System.out.println(result);
	}
	public static int biSeach(int[] a , int elem){
		int n = a.length;
		//定义地位下标和高位下标、中间
		int low =0;
		int high = n - 1;
		int mid;
		//二分查找
		while (low <= high) {
			mid = (low + high)/2;
			if (a[mid] == elem) {
				return mid + 1;
			}else if(a[mid] < elem){
				low = mid + 1;
			}else {
				high = mid - 1;
			}			
		}
		return -1;
	}

}
