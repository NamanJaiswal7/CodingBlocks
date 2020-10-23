package ArrayChallenges;

import java.util.Scanner;

public class SelectionSort {
	
	public static void swap(int [] arr,int min,int j) {
		int temp=arr[min];
		arr[min]=arr[j];
		arr[j]=temp;
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();		
			}
		
	
			for(int i=0;i<arr.length-1;i++) {
				int min_index=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[min_index]) {
						min_index=j;
					}
				}
				swap(arr,min_index,i);
			}
			display(arr);
	}
}
	

