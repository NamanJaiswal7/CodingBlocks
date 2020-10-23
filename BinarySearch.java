package ArrayChallenges;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int data=sc.nextInt();
		int lo=0;
		int hi=arr.length-1;
		int mid=lo+hi/2;
		while(lo<=hi) {
			if(arr[mid]>data) {
				hi=mid-1;
			}else if(arr[mid]>data) {
				lo=mid+1;
			} else
				System.out.println(mid);
		}
		
		System.out.println(-1);
		
		
	}

}
