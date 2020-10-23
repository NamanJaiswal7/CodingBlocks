package ArrayChallenges;

import java.util.Scanner;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[][] arr=new int[n][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=arr.length-1;i>=0;i--) {
			
			for(int j=0;j<arr.length;j++) {
				
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
