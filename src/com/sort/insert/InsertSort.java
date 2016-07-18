package com.sort.insert;

import com.sort.bubble.BubbleSort;

public class InsertSort {

	/**
	 * 插入排序
	 * 由小到大排序
	 * arr[first,mid],arr[mid+1,last]
	 * @param arr<br/>
	 * @author qiuwanchi<br/>
	 * @date: 2016年6月29日 <br/>
	 */
	public static void insertSort(int[] arr){
		int n = arr.length;
		for(int i = 1; i < n; i++){
			
  			int index = 0;//标记要插入的位置
			//寻找插入位置
			for(int j = 0;j < i; j++){
				if(arr[i] < arr[j] ){
 					index = j;
  					break;
				}
			}
			
			int result = arr[i];
			//后移动
 			if(index < i){
 				for(int t = i;t > index;t--){
					arr[t] = arr[t-1];
				}
			}
			arr[index] = result;
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void print(int[] arr){
		for(int i = 0; i < arr.length; i ++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {543,34,23,5,12,7,3,1,8,6};
		
		System.out.println("排序前：");
		InsertSort.print(arr);
		
		InsertSort.insertSort(arr);
		System.out.println("排序后：");
		BubbleSort.print(arr);
		
	}
}
