package ArrayChallenges;

import java.util.Scanner;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int[][] arr=new int[m][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		int search=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(search==arr[i][j]) {
					System.out.println("1");
					return;
				}
			}
		}
		System.out.println("0");
		
	}

}
