package ArrayChallenges;

import java.util.Scanner;

public class MaximumCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			
			int n=sc.nextInt();
			int [] arr=new int[n];
			for(int j=0;j<arr.length;j++) {
				
				arr[j]=sc.nextInt();
				
			}
			int sum=0;
		for(int j=0;j<arr.length;j++) {
			
			sum=sum+arr[j];
			
			
		}
			System.out.println(sum);
			
			
		}	
		
		
		
	}

}
