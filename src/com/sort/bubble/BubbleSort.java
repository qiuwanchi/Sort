package com.sort.bubble;

public class BubbleSort {

	/**
	 * 每一次把当前位置设为最小，再用这位置的值跟后面的值比较，后面的更小则 交换，此时选出了 为排序中最小的
	 * 时间复杂度：O(n*n)
	 * 缺点:本来位于前面的较小数被交换到后面
	 * 
	 * @param arr<br/>
	 * @author qiuwanchi<br/>
	 * @date: 2016年6月29日 <br/>
	 */
	public static void bubbleSort1(int[] arr){
		int n = arr.length;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if( arr[i] > arr[j]){
					BubbleSort.swap(arr, i, j);
				}
			}
		}
	}
	
	/**
	 * 从后面开始 把小的往前冒，相邻的两个进行比较
	 * 时间复杂度：(n-1) + (n-2) + ... + 2 + 1 = n(n-1)/2
	 * O(n*n)
	 * @param arr<br/>
	 * @author qiuwanchi<br/>
	 * @date: 2016年6月29日 <br/>
	 */
	public static void bubbleSort2(int[] arr){
		int n = arr.length;
		
		for(int i = 0; i < n; i++){
			
			//从后面开始 把小的往前冒，相邻的两个进行比较
			for(int j = n - 1; j > i; j--){
				if(arr[j] < arr[j-1]){
					BubbleSort.swap(arr, j, j-1);
				}
			}
		}
	}
	
	/**
	 * 冒泡排序优化方案
	 * 当后续两两没有交换，说明后面数据有序，我们可以停止了
	 * 
	 * @param arr<br/>
	 * @author qiuwanchi<br/>
	 * @date: 2016年6月29日 <br/>
	 */
	public static void bubbleSort3(int[] arr){
		int n = arr.length;
		boolean isSwap = true;
		for(int i = 0; i < n && isSwap; i++){
			isSwap = false;
			//从后面开始 把小的往前冒，相邻的两个进行比较
			for(int j = n - 1; j > i; j--){
				if(arr[j] < arr[j-1]){
					BubbleSort.swap(arr, j, j-1);
					isSwap = true;
				}
			}
		}
	}
	
	/**
	 * 
	 * 交换
	 * @param arr
	 * @param i
	 * @param j<br/>
	 * @author qiuwanchi<br/>
	 * @date: 2016年6月29日 <br/>
	 */
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {543,34,23,5,12,7,3,1,8,6};
		
		System.out.println("排序前：");
		BubbleSort.print(arr);
		
		BubbleSort.bubbleSort3(arr);
		System.out.println("排序后：");
		BubbleSort.print(arr);
		
	}
	
	public static void print(int[] arr){
		for(int i = 0; i < arr.length; i ++){
			System.out.println(arr[i]);
		}
	}
}
