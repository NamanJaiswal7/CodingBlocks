package ArrayChallenges;

import java.util.Scanner;

public class InsertionSort {
	public static void swap(int[] arr, int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0&&arr[j]<arr[j-1];j--) {
				swap(arr,j,j-1);
			}
		}
		display(arr);
		
		
		
		
		
		
		
		
	}

}
