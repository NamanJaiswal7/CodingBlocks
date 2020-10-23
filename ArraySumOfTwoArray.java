package ArrayChallenges;

import java.util.Scanner;

public class ArraySumOfTwoArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int j=0;j<arr.length;j++) {
			arr[j]=sc.nextInt();
		}
		
		int m=sc.nextInt();
		int [] arr1=new int[m];
		for(int j=0;j<arr1.length;j++) {
			arr1[j]=sc.nextInt();
		}
		
		int ans=sum(arr,arr1);
		
		String s=Integer.toString(ans);
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i)+", ");
		}
		System.out.println("END");
		
		// TODO Auto-generated method stub

	}

	public static int sum(int[] arr, int[] arr1) {
		String s1="";String s2="";
		for(int i=0;i<arr.length;i++) {
				s1=s1+arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			s2=s2+arr1[i];
	}
	int x=Integer.parseInt(s1);
	int y=Integer.parseInt(s2);
	int ans=x+y;
	
		
		return ans;
		
	}

}
