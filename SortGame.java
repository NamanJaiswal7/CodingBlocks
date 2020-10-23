package ArrayChallenges;

import java.util.Scanner;

public class SortGame {
	public static void swap(int[] arr, int min, int j) {
		int temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}
	public static void swap1(String[] arr, int min, int j) {
		String temp = arr[min];
		arr[min] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		
		String[] str=new String[n];
		int[] num=new int[n];
		
		for(int i=0;i<num.length;i++) {
			str[i]=sc.next();
			num[i]=sc.nextInt();
			
			
		}	
		
		
		for(int pass=1;pass<num.length;pass++) {
			for(int j=0;j<num.length-pass;j++) {
				if(num[j]==num[j+1]) {
					if(str[j].charAt(0)<str[j+1].charAt(0)) {
						swap(num,j,j+1);
						swap1(str,j,j+1);
					}
				}else if(num[j]>num[j+1]) {
					swap(num,j,j+1);
					swap1(str,j,j+1);
				}
			}
		}
		for(int i=(num.length-1);i>=0;i--) {
			if(num[i]>x) {
				System.out.print(str[i]+" ");
				System.out.println(num[i]);
			}
		}
		
		

	}

}
